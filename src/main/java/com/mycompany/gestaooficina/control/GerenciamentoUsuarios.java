package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.exception.CredenciaisInvalidasException;
import com.mycompany.gestaooficina.model.Usuario;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;


public class GerenciamentoUsuarios {

    private static final String ARQUIVO_DADOS = "usuarios.txt";

    private final LinkedList<Usuario> usuarios;
    private static GerenciamentoUsuarios instance = null;

    private GerenciamentoUsuarios() {
        this.usuarios = new LinkedList<>();
        carregarDados();
        garantirUsuarioAdministrador();
    }

    public static GerenciamentoUsuarios getInstance() {
        if (instance == null) {
            instance = new GerenciamentoUsuarios();
        }
        return instance;
    }

    private void carregarDados() {
        List<String> linhas = ArmazenamentoArquivo.lerLinhas(ARQUIVO_DADOS);
        for (String linha : linhas) {
            try {
                this.usuarios.add(Usuario.apartirDeLinha(linha));
            } catch (RuntimeException e) {
                // Linha inválida ou corrompida é ignorada.
            }
        }
    }

    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Usuario usuario : this.usuarios) {
            linhas.add(usuario.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    private void garantirUsuarioAdministrador() {
        if (this.usuarios.isEmpty()) {
            this.usuarios.add(new Usuario("admin", gerarHash("123")));
            persistirDados();
        }
    }

    public static String gerarHash(String texto) {
        try {
            MessageDigest digestor = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digestor.digest(texto.getBytes(StandardCharsets.UTF_8));
            StringBuilder construtor = new StringBuilder();
            for (byte b : bytes) {
                construtor.append(String.format("%02x", b));
            }
            return construtor.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Algoritmo de hash indisponível", e);
        }
    }

    
    public boolean autenticar(String login, String senha) {
        if (login == null || senha == null) {
            return false;
        }
        String hashInformado = gerarHash(senha);
        for (Usuario usuario : this.usuarios) {
            if (usuario.getLogin().equalsIgnoreCase(login.trim())
                    && usuario.getSenhaHash().equals(hashInformado)) {
                return true;
            }
        }
        return false;
    }

    
    public void autenticarOuLancar(String login, String senha) throws CredenciaisInvalidasException {
        if (!autenticar(login, senha)) {
            throw new CredenciaisInvalidasException();
        }
    }
}

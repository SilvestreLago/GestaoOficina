package com.mycompany.gestaooficina.control;

import com.mycompany.gestaooficina.model.Usuario;
import com.mycompany.gestaooficina.persistence.ArmazenamentoArquivo;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe de controle responsável pela autenticação de usuários do sistema.
 * As senhas nunca são gravadas em texto puro: apenas o seu hash SHA-256 é
 * persistido no arquivo {@value #ARQUIVO_DADOS}.
 *
 * <p>Caso o arquivo de usuários ainda não exista (primeira execução do
 * sistema), um usuário administrador padrão é criado automaticamente
 * (login: {@code admin}, senha: {@code 123}).</p>
 */
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

    //CARREGA OS USUARIOS PERSISTIDOS NO ARQUIVO DE DADOS
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

    //GRAVA TODOS OS USUARIOS ATUAIS NO ARQUIVO DE DADOS
    private void persistirDados() {
        List<String> linhas = new LinkedList<>();
        for (Usuario usuario : this.usuarios) {
            linhas.add(usuario.paraLinha());
        }
        ArmazenamentoArquivo.escreverLinhas(ARQUIVO_DADOS, linhas);
    }

    //CRIA O USUARIO ADMINISTRADOR PADRAO CASO NENHUM USUARIO EXISTA AINDA
    private void garantirUsuarioAdministrador() {
        if (this.usuarios.isEmpty()) {
            this.usuarios.add(new Usuario("admin", gerarHash("123")));
            persistirDados();
        }
    }

    //GERA O HASH SHA-256 DE UM TEXTO (utilizado para nunca gravar senhas em texto puro)
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

    //VERIFICA SE O LOGIN E A SENHA INFORMADOS SAO VALIDOS
    public boolean autenticar(String login, String senha) {
        if (login == null || senha == null) {
            return false;
        }
        String hashInformado = gerarHash(senha);
        for (Usuario usuario : this.usuarios) {
            if (usuario.getLogin().equalsIgnoreCase(login.trim()) && usuario.getSenhaHash().equals(hashInformado)) {
                return true;
            }
        }
        return false;
    }

    //CADASTRA UM NOVO USUARIO DE ACESSO AO SISTEMA
    public void cadastrarUsuario(String login, String senha) {
        this.usuarios.add(new Usuario(login, gerarHash(senha)));
        persistirDados();
    }

    //ALTERA A SENHA DE UM USUARIO EXISTENTE
    public boolean alterarSenha(String login, String novaSenha) {
        for (Usuario usuario : this.usuarios) {
            if (usuario.getLogin().equalsIgnoreCase(login)) {
                usuario.setSenhaHash(gerarHash(novaSenha));
                persistirDados();
                return true;
            }
        }
        return false;
    }
}

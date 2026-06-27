package com.mycompany.gestaooficina.persistence;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe utilitária responsável por toda a leitura e escrita de dados em
 * arquivos de texto (.txt). É utilizada pelas classes de controle
 * (Gerenciamento*) para tornar os dados do sistema persistentes entre
 * execuções, sem a necessidade de um banco de dados.
 *
 * <p>Cada entidade do sistema é gravada em um arquivo próprio, dentro do
 * diretório {@value #DIRETORIO_DADOS}, localizado na raiz da aplicação.
 * Cada linha do arquivo representa um registro, com os campos separados
 * pelo caractere "|" (pipe).</p>
 */
public final class ArmazenamentoArquivo {

    private static final Logger LOGGER = Logger.getLogger(ArmazenamentoArquivo.class.getName());

    // Diretório onde todos os arquivos de dados da aplicação são salvos.
    public static final String DIRETORIO_DADOS = "data";

    // Caractere utilizado para separar os campos dentro de cada linha.
    public static final String SEPARADOR = "|";

    private ArmazenamentoArquivo() {
        // Classe utilitária: não deve ser instanciada.
    }

    private static Path resolverCaminho(String nomeArquivo) {
        Path diretorio = Paths.get(DIRETORIO_DADOS);
        try {
            Files.createDirectories(diretorio);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Não foi possível criar o diretório de dados \"" + DIRETORIO_DADOS + "\"", e);
        }
        return diretorio.resolve(nomeArquivo);
    }

    public static List<String> lerLinhas(String nomeArquivo) {
        Path caminho = resolverCaminho(nomeArquivo);
        List<String> linhas = new ArrayList<>();
        if (!Files.exists(caminho)) {
            return linhas;
        }
        try {
            List<String> lidas = Files.readAllLines(caminho, StandardCharsets.UTF_8);
            for (String linha : lidas) {
                if (linha != null && !linha.trim().isEmpty()) {
                    linhas.add(linha);
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao ler o arquivo de dados \"" + nomeArquivo + "\"", e);
        }
        return linhas;
    }

    public static void escreverLinhas(String nomeArquivo, List<String> linhas) {
        Path caminho = resolverCaminho(nomeArquivo);
        try (BufferedWriter escritor = Files.newBufferedWriter(caminho, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {
            for (String linha : linhas) {
                escritor.write(linha);
                escritor.newLine();
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao gravar o arquivo de dados \"" + nomeArquivo + "\"", e);
        }
    }

    public static String escaparCampo(String valor) {
        if (valor == null) {
            return "";
        }
        return valor.replace(SEPARADOR, "/");
    }
    
    public static String[] dividirCampos(String linha) {
        return linha.split("\\|", -1);
    }
}

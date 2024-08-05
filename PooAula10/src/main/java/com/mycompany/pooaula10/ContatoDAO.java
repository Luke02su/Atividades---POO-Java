package com.mycompany.pooaula10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {

    // A conexão com o banco de dados
    private Connection connection; // Campo para armazenar a conexão com o banco de dados

    // Construtor da classe ContatoDAO
    public ContatoDAO() {
        // Inicializa a conexão com o banco de dados usando a ConnectionFactory
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionar(Contato contato) {
        // Comando SQL para inserir um novo contato na tabela contatos
        String sql = "insert into contatos "
                + "(nome,email,endereco)"
                + " values (?,?,?)";

        try {
            // Cria um PreparedStatement para executar o comando SQL
            PreparedStatement stmt = connection.prepareStatement(sql);

            // Define os valores dos parâmetros na instrução SQL
            stmt.setString(1, contato.getNome()); // Nome do contato
            stmt.setString(2, contato.getEmail()); // Email do contato
            stmt.setString(3, contato.getEndereco()); // Endereço do contato

            // Executa o comando SQL
            // O método execute retorna true se a execução gerar um ResultSet (não é o caso aqui), caso contrário retorna false
            if (!stmt.execute()) {
                System.out.println("Contato adicionado!"); // Mensagem de sucesso
            } else {
                System.out.println("Erro na gravação!"); // Mensagem de erro
            }
            stmt.close(); // Fecha o PreparedStatement
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na execução do SQL
            throw new RuntimeException(e);
        }
    }

    public List<Contato> getLista() {
        try {
            // Cria uma lista para armazenar os contatos recuperados do banco de dados
            List<Contato> contatos = new ArrayList<Contato>();

            // Comando SQL para selecionar todos os registros da tabela contatos
            PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
            
            // Executa a consulta e obtém o resultado
            ResultSet rs = stmt.executeQuery();

            // Itera sobre cada registro retornado pelo ResultSet
            while (rs.next()) {
                // Cria um novo objeto Contato e define seus atributos com base nos dados do banco de dados
                Contato contato = new Contato();
                contato.setId(rs.getLong("id")); // ID do contato
                contato.setNome(rs.getString("nome")); // Nome do contato
                contato.setEmail(rs.getString("email")); // Email do contato
                contato.setEndereco(rs.getString("endereco")); // Endereço do contato

                // Adiciona o contato à lista de contatos
                contatos.add(contato);
            }
            rs.close(); // Fecha o ResultSet
            stmt.close(); // Fecha o PreparedStatement
            return contatos; // Retorna a lista de contatos
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na execução do SQL
            throw new RuntimeException(e);
        }
    }
    
    public void listar() {
        System.out.println("------------ Listagem ------------");
        // Obtém a lista de contatos do banco de dados
        List<Contato> contatos = this.getLista();
        
        // Itera sobre cada contato e imprime seus detalhes
        for (Contato c : contatos) {
            System.out.println("Nome: " + c.getNome()); // Imprime o nome do contato
            System.out.println("Email: " + c.getEmail()); // Imprime o email do contato
            System.out.println("Endereço: " + c.getEndereco()); // Imprime o endereço do contato
            System.out.println("----------------------------------");
        }
    }

    public void alterar(Contato contato) {
        // Comando SQL para atualizar os dados de um contato existente
        String sql = "update contatos set nome=?, email=?, endereco=? where id=?";
        
        try {
            // Cria um PreparedStatement para executar o comando SQL
            PreparedStatement stmt = connection.prepareStatement(sql);

            // Define os novos valores dos parâmetros na instrução SQL
            stmt.setString(1, contato.getNome()); // Novo nome do contato
            stmt.setString(2, contato.getEmail()); // Novo email do contato
            stmt.setString(3, contato.getEndereco()); // Novo endereço do contato
            stmt.setLong(4, contato.getId()); // ID do contato a ser atualizado

            // Executa o comando SQL
            stmt.execute();
            stmt.close(); // Fecha o PreparedStatement
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na execução do SQL
            throw new RuntimeException(e);
        }
    }

    public void remover(Contato contato) {
        try {
            // Comando SQL para deletar um contato pelo ID
            PreparedStatement stmt = connection.prepareStatement("delete from contatos where id=?");
            
            // Define o valor do parâmetro ID na instrução SQL
            stmt.setLong(1, contato.getId());

            // Executa o comando SQL
            stmt.execute();
            stmt.close(); // Fecha o PreparedStatement
        } catch (SQLException e) {
            // Lança uma exceção em caso de erro na execução do SQL
            throw new RuntimeException(e);
        }
    }
}

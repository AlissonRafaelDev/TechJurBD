package br.com.techjur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    public void salvarNoBanco(Cliente cliente) {
        // Comando SQL com '?' no lugar dos valores, para evitar ataques de injeção de SQL
        String sql = "INSERT INTO clientes (nome, cpf_cnpj) VALUES (?, ?)";

        // Chama nossa classe de conexão para abrir a porta com o banco
        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Troca as interrogações pelos dados reais do cliente
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());

            // Manda o PostgreSQL executar o comando
            stmt.execute();
            System.out.println("SUCESSO: Cliente '" + cliente.getNome() + "' foi salvo de verdade no PostgreSQL!");

        } catch (SQLException e) {
            System.out.println("ERRO: Não foi possível salvar o cliente.");
            e.printStackTrace();
        }
    }
}
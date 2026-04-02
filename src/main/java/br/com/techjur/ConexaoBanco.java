package br.com.techjur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    public static Connection conectar() {
        // url: jdbc:postgresql://servidor:porta/nome_do_banco
        String url = "jdbc:postgresql://localhost:5432/TechJur";
        String usuario = "postgres";
        String senha = "thecriashastheoverpower"; // <-- Mude para a senha do seu banco!

        try {
            Connection conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("SUCESSO: Conectado ao PostgreSQL!");
            return conn;
        } catch (SQLException e) {
            System.out.println("ERRO: Não foi possível conectar ao banco de dados.");
            e.printStackTrace();
            return null;
        }
    }
}
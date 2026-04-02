package br.com.techjur;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema TechJur!");

        // 1. Criamos o cliente no Java
        Cliente clienteTeste = new Cliente("João da Silva", "123.456.789-00");
        System.out.println("Cliente criado na memória: " + clienteTeste.getNome());

        System.out.println("--- Enviando dados para o Banco de Dados ---");

        // 2. Chamamos o DAO para salvar esse cliente no PostgreSQL
        ClienteDAO dao = new ClienteDAO();
        dao.salvarNoBanco(clienteTeste);
    }
}
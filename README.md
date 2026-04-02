# ⚖️ TechJur - Sistema de Gestão Jurídica

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/postgresql-4169e1?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

## 📌 Sobre o Projeto
O **TechJur** é um sistema back-end de gestão jurídica focado no controle e organização de rotinas de um escritório de advocacia. 

Este projeto está sendo desenvolvido de forma colaborativa como parte das atividades práticas do curso de Sistemas para Internet e Ciencias da Computação da Uniesp. O objetivo principal é consolidar conhecimentos em Programação Orientada a Objetos e persistência de dados, criando uma integração robusta entre uma aplicação **Java** e um banco de dados relacional (**PostgreSQL**).

*Nota: Este repositório reflete as minhas contribuições individuais para a base de dados e a conexão Java do sistema. O repositório central do grupo pode ser acessado [aqui](https://github.com/vhfedatto/pjt-TechJur).*

## 👥 Equipe de Desenvolvimento
O TechJur é fruto do trabalho em equipe dos seguintes desenvolvedores:

- **Victor Fedatto** ([@vhfedatto](https://github.com/vhfedatto)) - Líder de Projeto 
- **Alisson Rafael** ([@AlissonRafaelDev](https://github.com/SeuUsuarioAqui)) - Desenvolvedor Back-end / Integração com Banco de Dados
- **Leonardo Camilo de Souza Filho** ([@Leocfilho]([https://github.com/link](https://github.com/Leocfilho)))
- **Kaliel A. Amblard Selhorst** ([@Selhorstkaliel](https://github.com/Selhorstkaliel))

## 🚀 Funcionalidades Implementadas (Módulo Back-end)
- **Cadastro Dinâmico:** Inserção de novos clientes via CLI utilizando a classe `Scanner`.
- **Persistência de Dados:** Conexão direta com o PostgreSQL via driver JDBC (Data Access Object - DAO).
- **Estrutura Relacional:** Banco de dados modelado com chaves primárias UUID e separação lógica (Clientes, Processos, Tarefas, Usuários).
- **Menu Interativo:** Interface em looping para navegação e realização de múltiplos cadastros.

## 🛠️ Tecnologias e Ferramentas
- **Linguagem:** Java (JDK)
- **Banco de Dados:** PostgreSQL 16+
- **Gerenciador de Dependências:** Maven
- **IDE:** IntelliJ IDEA
- **Drivers:** JDBC (Java Database Connectivity)

## 📂 Arquitetura (Integração)
A estrutura segue boas práticas de separação de responsabilidades:
* `Cliente`: Classe modelo (Entity).
* `ClienteDAO`: Classe responsável pelas operações de banco de dados, utilizando `PreparedStatement` contra SQL Injection.
* `ConexaoBanco`: Gerenciamento das credenciais e ponte com o banco.
* `Main`: Gerenciamento do menu e captura de dados do usuário.

## ⚙️ Como executar localmente

1. **Clone este repositório:**
   ```bash
   git clone [https://github.com/AlissonRafaelDev/TechJurBD.git](https://github.com/AlissonRafaelDev/TechJurBD.git)
   Configure o Banco de Dados:

2. Crie um banco de dados chamado techjur no PostgreSQL.

3. Execute os scripts SQL de criação das tabelas correspondentes (necessária a tabela clientes).

4. Configure as Credenciais:

- Navegue até src/main/java/br/com/techjur/ConexaoBanco.java e insira a senha do seu usuário local.

5. Execute a aplicação:

- Atualize as dependências do Maven e rode a classe Main.java.

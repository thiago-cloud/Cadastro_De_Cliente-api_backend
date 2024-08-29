# CRUD de Cadastramento de Cliente

Status: Desenvolvedor ⚠️


Este é um projeto de exemplo que implementa uma aplicação CRUD (Create, Read, Update, Delete) para gerenciamento de clientes. A aplicação é dividida em duas partes:

- **Backend**: Implementado com **Spring Boot**.
- **Frontend**: Implementado com **Angular**.

## Tecnologias Utilizadas

### Backend
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Para acesso a dados e integração com o banco de dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Spring Web**: Para criação de APIs RESTful.

## Estrutura do Projeto

### Backend
1. **Controlador**: Define os endpoints da API para operações CRUD.
2. **Serviço**: Contém a lógica de negócios e manipulação de dados.
3. **Repositório**: Interface para operações de persistência com o banco de dados.
4. **Modelo**: Define a estrutura dos dados (entidades) no modelo se encontra os atributos nome, idade e cidade da entidade cliente.


## Pré-requisitos
- **Java 17**
- **Maven** para gerenciamento de dependências e construção do projeto

## Execução do projeto
- **Backend** em "src/main/java/br/com/projeto/api_cliente/ApiClienteApplication.java" pressione run para a execução do backend.

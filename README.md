# API de Cadastro de Usuário

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot para gerenciar o cadastro de usuários. A estrutura foi organizada seguindo boas práticas de desenvolvimento orientado a objetos, utilizando arquitetura em camadas e persistência com banco de dados.

## 🧱 Tecnologias Utilizadas

- Java 17+ (ou superior)
- Spring Boot
- Spring Data JPA
- H2 Database (pode ser substituído por PostgreSQL)
- Maven
- Lombok
- Postman (para testes de requisição)

## 📁 Estrutura do Projeto

cadastro-usuario/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── seuusuario/
│ │ │ └── cadastro/
│ │ │ ├── controllers/
│ │ │ ├── dtos/
│ │ │ ├── entities/
│ │ │ ├── repositories/
│ │ │ ├── services/
│ │ │ └── CadastroUsuarioApplication.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── data.sql
├── pom.xml
└── README.md


## 🚀 Funcionalidades

- Cadastro de usuários
- Atualização de dados
- Exclusão lógica ou física
- Listagem de usuários
- Validação com DTOs
- Camada de serviço desacoplada com interfaces

## 🔧 Como Executar

1. Clone o projeto:
   ```bash
   git clone https://github.com/Daniel-Macedo-dev/api-cadastro-usuario.git

    Acesse o diretório:

cd api-cadastro-usuario

Compile e execute:

    ./mvnw spring-boot:run

    Teste as rotas usando o Postman ou outro cliente HTTP.

📄 Licença

Este projeto está licenciado sob a MIT License.

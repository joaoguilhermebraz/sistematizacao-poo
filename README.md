# Sistema de gerenciamento de entregadores

Este projeto é uma API REST que utiliza o Framework Spring Boot, com conexão com o banco de dados MYSQL. 
Este software é a solução simples para gerenciar os entregadores da empresa de entregas Dianome.



## Pré-requisitos

- Java 17
- MySQL
- Maven (opcional)

## Configuração

Antes de executar a aplicação, configure o banco de dados MySQL:

1. Crie um banco de dados MySQL.
2. Atualize o arquivo application.properties ou application.yml do Spring Boot com as informações do seu banco de dados:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### Autor João Guilherme Braz. 

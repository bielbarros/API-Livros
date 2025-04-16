# 📚 Livros API - Java Spring Boot CRUD

Este projeto é uma API RESTful desenvolvida com **Java 21**, **Spring Boot**, **Lombok** e **Jakarta Persistence API**, com o objetivo de praticar boas práticas de arquitetura, padronização de entidades e recursos REST. A aplicação implementa um CRUD completo para gerenciamento de livros utilizando **MySQL** como banco de dados.

---

## 🧩 Funcionalidades

- ✅ Criar (POST) um novo livro
- ✅ Listar (GET) todos os livros
- ✅ Buscar (GET) livro por ID
- ✅ Atualizar (PUT) um livro existente
- ✅ Deletar (DELETE) um livro

---

## 🛠️ Tecnologias e Dependências

- Java 21+
- Spring Boot 3.x
- Spring Data JPA
- Jakarta Persistence (`jakarta.persistence`)
- Lombok
- MySQL
- Maven

---

## 📁 Estrutura do Projeto

```bash
src
└── main
    └── java
        └──  com
                └── livros
                    └── api
                        ├── controller
                        ├── entity
                        ├── repository
                        └── service
    └── resources
        └── application.properties

```

---

## 📘 Exemplo de Entidade com Jakarta Persistence e Lombok

```bash
package br.com.livros.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private Integer anoPublicacao;
}

```

---

## 🔄 Endpoints
```bash

Método |         Endpoint          | Descrição
GET    | /api/livros/findAll       | Lista todos os livros
GET    | /api/livros/findById/{id} | Busca livro por ID
POST   | /api/livros/save          | Cria um novo livro
PUT    | /api/livros/update/{id}   | Atualiza livro por ID
DELETE | /api/livros/delete/{id}   | Remove livro por ID

```
---

## ⚙️ Configuração do MySQL
Edite seu arquivo application.properties com as credenciais do seu banco:

```bash
properties

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/livros
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true

```
⚠️ Certifique-se de que o banco livros já foi criado no MySQL antes de rodar a aplicação.

## 🧪 Teste Local

```bash
1- Clone o projeto:

git clone https://github.com/seuusuario/livros-api.git
cd livros

2- Rode a aplicação com:

./mvnw spring-boot:run

3- Acesse a API via http://localhost:8080/livros

```
---


## 📌 Observações
* Este projeto é ideal para praticar CRUD com Spring Boot e entender como estruturar uma API RESTful simples.


* Sinta-se livre para expandir com relacionamentos entre entidades, autenticação, validação e mais!
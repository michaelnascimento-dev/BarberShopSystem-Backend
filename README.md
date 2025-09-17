# 💈 Sistema de Agendamentos para Barbearia – Backend

Este é o backend do meu primeiro projeto fullstack. A aplicação tem como objetivo oferecer um sistema de agendamentos para uma barbearia fictícia, onde os clientes podem se registrar com nome e telefone, agendar serviços nos horários disponíveis e consultar seus agendamentos.

O barbeiro (admin) possui acesso a uma área exclusiva, onde pode definir os horários disponíveis e visualizar todos os serviços agendados para o dia.

---

## ⚙️ Status do Projeto

> 🚧 **Em desenvolvimento**  
A estrutura básica do backend foi iniciada com a criação das entidades que representam os principais elementos do sistema, como clientes, serviços oferecidos e agendamentos. Também foram implementados os repositórios para permitir a persistência de dados no banco e adicionada a dependência do Swagger, que será utilizada futuramente para documentar os endpoints da API.

---

## 🛠️ Tecnologias e Dependências

A aplicação está sendo construída com:

- **Java 21**
- **Spring Boot 3.5.5**
- **Spring Web** – para criação de APIs RESTful
- **Spring Data JPA** – para integração com banco de dados relacional
- **Spring Boot Starter Validation** – para validação de dados
- **JDBC Driver (MySQL Connector)** – para conexão com o banco MySQL
- **Lombok** – para reduzir boilerplate no código
- **Spring Boot DevTools** – para facilitar o desenvolvimento com hot reload
- **Spring Boot Starter Test** – para testes unitários e de integração
- **Springdoc OpenAPI (Swagger)** – para geração automática da documentação da API
---

## 🗄️ Banco de Dados

O banco de dados MySQL foi configurado e está sendo executado em um **contêiner Docker**, utilizando a imagem oficial `mysql:8.0`. A configuração atual define:

- Banco: `barbershop_db`
- Usuário: `barber`
- Senha: `barber123`
- Porta exposta: `3307`

O container pode ser iniciado com:

```bash
docker-compose up -d
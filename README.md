# API REST para envio de e-mail


![GitHub repo size](https://img.shields.io/github/repo-size/paulorosmaninho/api-email-sb)
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/paulorosmaninho/api-email-sb/blob/master/LICENSE) 

### Disponível no Heroku através da URL: https://emailsb.herokuapp.com/enviarEmail

# Sobre o projeto

Este microserviço faz parte do curso de Java do canal Michelli Brito no YouTube. Link: https://youtu.be/ZBleZzJf6ro.

Esse projeto foi construído com Spring Boot e JPA/Hibernate. Utiliza banco de dados PostgreSQL em desenvolvimento e produção.

Nele é utilizado somente o método POST do HTTP.

JSON de Exemplo:
```bash

# Campos:
# nomeRemetente: Nome do remetente que será apresentado à esquerda do e-mail
# emailRemetente: E-mail do remetente. Este microserviço está utilizando o SMTP do GMAIL.
# nomeDestinatario: Nome de um destinatário.
# emailsDestinatario: Lista de e-mails destino separados por vírgula.
# assuntoEmail: Assunto do e-mail
# textoEmail: Texto do e-mail em formato HTML

# Os dados abaixo são fictícios
{
    "nomeRemetente": Paulo Rosmaninho,
    "emailRemetente": "paulo@email.com",
    "nomeDestinatario": "Maria Brown",
    "emailsDestinatario": "maria.brown@email.com, frank.brown@email.com",
    "assuntoEmail": "Novo Microserviço",
    "textoEmail":"<h3>Olá Maria e Frank, tudo bem?</h3> 
    Este é um novo microserviço para envio de e-mail <br> 
    O que acharam?"
}

```

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Front end
- Simulado via POSTMAN

## Implantação em produção
- Back end: Heroku
- Banco de dados: PostgreSQL

# Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/paulorosmaninho/api-email-sb.git

# configurar o SMTP no arquivo application.properties, que está na pasta src/main/resources
# a configuração abaixo está utilizando o GMAIL, mas é possível utilizar outros provedores
# de sua preferência, basta verificar as configurações e substituir.

spring.mail.host=smtp.gmail.com
spring.mail.port=465
spring.mail.username=**********@gmail.com
spring.mail.password=**********
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.starttls.required=true
spring.mail.properties.mail.smtp.ssl.enable=true
spring.mail.test-connection=true

# entrar na pasta local do projeto
exemplo: cd api-email-sb

# executar o comando abaixo
mvnw spring-boot:run

# utilizar o POSTMAN para executar o método POST
```
## Back end
Pré-requisitos: 
Java versão 17
PostgreSQL versão 13

# Autor
Paulo Rosmaninho

https://www.linkedin.com/in/paulorosmaninho

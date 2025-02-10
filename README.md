# Challenge Java - Encontrando a Primeira Vogal Única

Este projeto consiste em uma API desenvolvida em Java com Spring Boot que identifica a primeira vogal única que aparece após uma consoante em uma string fornecida. Utilizando JPA para persistência de dados e banco de dados H2 ou PostgreSQL, a aplicação permite armazenar os resultados das análises realizadas. A API foi criada como parte do Challenge Back-End Java da Alura, oferecendo uma solução eficiente e escalável para esse problema.

# Tecnologias Utilizadas

Java 17
<br>
Spring Boot
<br>
Spring Data JPA
<br>
Banco de Dados H2
<br>
 # Estrutura do Projeto

challengeJava/
├── src/main/java/dev/Zerphyis/challengeJava/
│   ├── ControllerVogal.java
│   ├── service/
│   │   ├── VogalService.java
│   ├── repository/
│   │   ├── VogalRepository.java
│   ├── vogal/
│   │   ├── DadosVogal.java
│   │   ├── Vogal.java
│   ├── Application.java (classe principal)
├── pom.xml

# Como Executar o Projeto

# Pré-requisitos
<br>
JDK 17+
<br>
Maven
<br>
Banco de Dados H2
<br>
#Passos
<br>
#Clone o repositório:

git clone https://github.com/seu-usuario/challenge-java-vogal.git
cd challenge-java-vogal

Compile e execute o projeto:

mvn spring-boot:run

A API estará disponível em: http://localhost:8080/api

# Endpoints da API

# Endpoint: POST /api


Créditos

Resolução de Desafio 
<br>
https://github.com/devssa/no-pain-no-brain/tree/master/Solutis/Analista%20de%20Sistemas%20Java

# Teste Prático  - Melhor Petshop

Este projeto é uma API desenvolvida para resolver o desafio técnico de uma Empresa . A aplicação busca  o melhor petshop com base em preço, data e porte dos cães. No primeiro momento 
foi construido somente o backend da aplicação ,podendo ser testada pelo Postman ou Insomnia . No meu caso utilizei o Insomnia, para a entrada de dados usei os dados que solicitaram 
no enunciado e o resultado foi satisfatório .

## 🛠 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Maven
- Insomnia (para testes da API)

## 🚀 Como executar

1. Para executar é necessário clonar o repositorio em sua maquina, utilizando o seguinte comando em seu terminal..
2. git clone git@github.com:IagoWiliian/Teste-Pratico.git 

##   Endpoint para testes 

Método: POST

URL: http://localhost:8080/melhor-petshop

Body: JSON

{
  "data": "03/08/2018",
  "caesPequenos": 3,
  "caesGrandes": 5
}

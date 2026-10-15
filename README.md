# 🛒 Store Management System

> **Status do Projeto:** 🚧 Em Desenvolvimento (In Progress)

Aplicação console em Java desenvolvida para o gerenciamento de produtos e operações de uma loja, aplicando boas práticas de arquitetura, separação de responsabilidades e manipulação eficiente de dados.

## 📌 Sumário

* [Visão Geral](#-visão-geral)

* [Funcionalidades Principais](#-funcionalidades-principais)

* [Tecnologias Utilizadas](#-tecnologias-utilizadas)

* [Estrutura do Projeto](#-estrutura-do-projeto)

* [Como Executar o Projeto](#-como-executar-o-projeto)

* [Próximos Passos](#-próximos-passos)

* [Autor](#-autor)

## 💡 Visão Geral

O **Store Management System** é um sistema focado na gestão de estoque e produtos. O projeto foi estruturado com foco em orientação a objetos, refatoração constante para extração de serviços (como `ProductService`) e integração na classe principal (`Main`), garantindo um código limpo e de fácil manutenção.

## ✨ Funcionalidades Principais

* \[x\] **Gerenciamento de Produtos**: Cadastro, listagem e controle de itens da loja.

* \[x\] **Arquitetura em Camadas**: Separação clara das regras de negócio no `ProductService`.

* \[x\] **Interface via Console**: Execução e interação simples pelo terminal/console.

* \[ \] **Persistência de Dados**: *\[Em progresso\]* Salvamento das informações em banco de dados / arquivo.

* \[ \] **Tratamento de Exceções**: *\[Em progresso\]* Validações para evitar erros de entrada e garantir estabilidade.

## 🛠️ Tecnologias Utilizadas

* **Linguagem**: Java 100%

* **Paradigma**: Orientação a Objetos (POO)

* **IDE**: Eclipse / IntelliJ 

* **Versionamento**: Git & GitHub

## 🏗️ Estrutura do Projeto

```
store-management-system/
└── StoreProject/
    └── src/
        ├── service/     # Regras de negócio (ex: ProductService)
        ├── model/       # Entidades de dados
        └── Main.java    # Ponto de entrada da aplicação

```

## ⚙️ Como Executar o Projeto

### Pré-requisitos

* Java JDK 17+ (ou versão compatível) instalado.

* Git instalado na máquina.

### Passos de Instalação

1. **Clone o repositório:**

   ```
   git clone https://github.com/Paulo-Henrique-De-Jesus-Santos/store-management-system.git
   
   ```

2. **Acesse o diretório do projeto:**

   ```
   cd store-management-system/StoreProject
   
   ```

3. **Compile os arquivos Java:**

   ```
   javac -d bin src/*.java
   
   ```

4. **Executando a aplicação:**

   ```
   java -cp bin Main
   
   ```

## 🎯 Próximos Passos

* \[ \] Implementar a funcionalidade de buscar produtos por ID ou categoria.

* \[ \] Adicionar persistência de dados em arquivos JSON ou Banco de Dados (H2/PostgreSQL).

* \[ \] Criar testes unitários para validar os métodos de `ProductService`.

## 👤 Autor

Desenvolvido por **Paulo Henrique De Jesus Santos**.

* **GitHub**: [@Paulo-Henrique-De-Jesus-Santos](https://github.com/Paulo-Henrique-De-Jesus-Santos)

* **LinkedIn**:\[https://www.linkedin.com/in/paulo-henrique-de-jesus-8b19b0442/\]

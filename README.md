# Sistema Gerencial de Restaurante Ravin - Projeto +devs2blu

Repositório de desenvolvimento colaborativo do restaurante Ravin!
Este é um projeto em andamento como parte do programa +devs2blu,
onde cada aluno contribuirá para criar um sistema
com as operações de um restaurante.

O Projeto está sendo desenvolvido com as seguintes técnologias:
**Java, Spring Boot, H2 como banco de dados**

## Sumário

- [Instalação](#instalação)
- [Uso](#uso)
- [API Endpoints](#api-endpoints)
- [Banco de Dados](#banco-de-dados)
- [Contribuição](#contribuição)
- [Migration](#migration)

## Instalação

1. Clone o repositório:

```bash
git clone https://github.com/marciomichelluzzi/ravin-java.git
```

2. Instale as dependências com o Maven.

## Uso

1. Inicie a aplicação com Maven
2. A API estará disponível em http://localhost:8080


## API Endpoints
Essa API possui os seguintes endpoints:

```markdown
Por enquanto, não há endpoints disponíveis.
```

## Banco de Dados
Esse projeto utiliza o banco [H2](https://www.h2database.com/html/main.html).
O banco de dados pode ser acessado em http://localhost:8080/h2-console.
As credenciais de acesso são:

```markdown
username: sa
password: <empty>
```

> **Nota:** O banco H2 é um banco de dados em memória, ou seja,
os dados são perdidos quando a aplicação é reiniciada.

## Contribuição

1. Faça o _fork_ do projeto
2. Faça o _clone_ do seu _fork_

```bash
git clone <url-do-seu-fork>
```

3. Adicione o _upstream_ ao seu _fork_:

```bash
git remote add upstream <repositorio-original>
```

4. Baixe as atualizações do projeto original caso hajam:

```bash
git checkout main # ir para a branch main
git fetch upstream # pega a lista de mudanças que tem no remoto
git merge upstream/main # une as mudanças remotas com seu repositório local
git push origin main # manda a nova versão para seu fork no github
```

5. Faça as suas alterações e _commits_:

```bash
git add . # adiciona todas as mudanças
git commit -m "<mensagem-do-commit>" # cria um commit com as mudanças
```

6. Faça o _push_ para o seu _fork_:

```bash
git push origin main # envia as alterações para o seu fork
```

7. Abra um _pull request_ no repositório que você fez o _fork_:
8. Aguarde aprovação do seu _pull request_!

## Migration

Para criar uma migration, siga os seguintes passos:

1. Dentro do diretório `src/main/resources/db/migration`,
   crie um arquivo com o nome `V<numero-da-versao>__<nome-da-migration>.sql`.
   Por exemplo: `V1__create_table.sql`.

2. Escreva o código SQL da migration dentro do arquivo criado.
3. Execute a aplicação. As migrations serão executadas automaticamente.

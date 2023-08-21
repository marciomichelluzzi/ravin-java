-- Arquivo: V1_Initial_Schema.sql
-- Descrição: Migração inicial para criar a tabela de usuários

CREATE TABLE users (
    id INT PRIMARY KEY,
    username VARCHAR(50),
    email VARCHAR(100)
);

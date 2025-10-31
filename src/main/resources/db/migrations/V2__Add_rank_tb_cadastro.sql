-- V2 Migrations para adicionar uma nova coluna de cargo na tabela de cadastros

ALTER TABLE tb_cadastro
ADD COLUMN cargo VARCHAR(255);
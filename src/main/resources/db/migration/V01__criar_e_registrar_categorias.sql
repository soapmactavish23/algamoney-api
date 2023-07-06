CREATE TABLE `categoria` (
	`codigo` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(50) NOT NULL,
	PRIMARY KEY (`codigo`)
);

INSERT INTO categoria (nome) VALUES ('Lazer');
INSERT INTO categoria (nome) VALUES ('Alimentação');
INSERT INTO categoria (nome) VALUES ('Supermercado');
INSERT INTO categoria (nome) VALUES ('Farmácia');
INSERT INTO categoria (nome) VALUES ('Outros');
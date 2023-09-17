CREATE TABLE `pessoa` (
	`codigo` INT(10) NOT NULL AUTO_INCREMENT,
	`nome` VARCHAR(150) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`logradouro` VARCHAR(255) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`numero` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`complemento` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`bairro` VARCHAR(255) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`cep` VARCHAR(15) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`cidade` VARCHAR(255) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`estado` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	PRIMARY KEY (`codigo`) USING BTREE
) ENGINE=InnoDB;

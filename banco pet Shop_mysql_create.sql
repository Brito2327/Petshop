CREATE TABLE `Cliente` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`Nome` varchar(255) NOT NULL,
	`Email` varchar(255) NOT NULL,
	`Telefone` varchar(255) NOT NULL,
	`idPet` varchar(255) NOT NULL,
	`idEndereco` varchar(255) NOT NULL,
	`idUsuario` BINARY NOT NULL,
	`idPedido` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Endereco` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`Rua` varchar(255) NOT NULL,
	`Bairro` varchar(255) NOT NULL,
	`Numero` varchar(255) NOT NULL,
	`Cidade` varchar(255) NOT NULL,
	`Cep` varchar(255) NOT NULL,
	`Estado` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Pet` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`Nome` varchar(255) NOT NULL,
	`Raca` varchar(255) NOT NULL,
	`Peso` varchar(255) NOT NULL,
	`Idade` varchar(255) NOT NULL,
	`Sexo` varchar(255) NOT NULL,
	`foto` varchar(255) NOT NULL,
	`Observacao` TEXT(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Pedido` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`idAlimentoPedido` BINARY NOT NULL,
	`idAcessorioPedido` BINARY NOT NULL,
	`idSaudePedido` BINARY NOT NULL,
	`idHigienePdido` BINARY NOT NULL,
	`idServico` BINARY NOT NULL,
	`idAgendamento` BINARY NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Servico` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`servico` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Agendamento` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`Data` varchar(255) NOT NULL,
	`Hora` varchar(255) NOT NULL,
	`Buscar` BOOLEAN(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Usuario` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`Email` varchar(255) NOT NULL,
	`idCategoria` varchar(255) NOT NULL,
	`Senha` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Categoria` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`Cliente` BOOLEAN NOT NULL AUTO_INCREMENT,
	`Funcionario` BOOLEAN NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `HigienePedido` (
	`id` BINARY NOT NULL,
	`idHigiene` BINARY NOT NULL,
	`idCliente` BINARY NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `AlimentoPedido` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`idAlimento` BINARY NOT NULL,
	`idCliente` BINARY NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `AcessorioPedido` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`idAcessorio` BINARY NOT NULL,
	`idCliente` BINARY NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `SaudePedido` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`idSaude` BINARY NOT NULL,
	`idCliente` BINARY NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Alimento` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`tipo` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Higiene` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`tipo` varchar(255) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Acessorio` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`acessorio` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `saude` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`categria` varchar(255) NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Funcionario` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`Nome` varchar(255) NOT NULL,
	`idUsuario` BINARY(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Avaliacao` (
	`id` BINARY NOT NULL AUTO_INCREMENT,
	`Avaliacao` TEXT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Cliente` ADD CONSTRAINT `Cliente_fk0` FOREIGN KEY (`idPet`) REFERENCES `Pet`(`id`);

ALTER TABLE `Cliente` ADD CONSTRAINT `Cliente_fk1` FOREIGN KEY (`idEndereco`) REFERENCES `Endereco`(`id`);

ALTER TABLE `Cliente` ADD CONSTRAINT `Cliente_fk2` FOREIGN KEY (`idUsuario`) REFERENCES `Usuario`(`id`);

ALTER TABLE `Cliente` ADD CONSTRAINT `Cliente_fk3` FOREIGN KEY (`idPedido`) REFERENCES `Pedido`(`id`);

ALTER TABLE `Pedido` ADD CONSTRAINT `Pedido_fk0` FOREIGN KEY (`idAlimentoPedido`) REFERENCES `AlimentoPedido`(`id`);

ALTER TABLE `Pedido` ADD CONSTRAINT `Pedido_fk1` FOREIGN KEY (`idAcessorioPedido`) REFERENCES `AcessorioPedido`(`id`);

ALTER TABLE `Pedido` ADD CONSTRAINT `Pedido_fk2` FOREIGN KEY (`idSaudePedido`) REFERENCES `SaudePedido`(`id`);

ALTER TABLE `Pedido` ADD CONSTRAINT `Pedido_fk3` FOREIGN KEY (`idHigienePdido`) REFERENCES `HigienePedido`(`id`);

ALTER TABLE `Pedido` ADD CONSTRAINT `Pedido_fk4` FOREIGN KEY (`idServico`) REFERENCES `Servico`(`id`);

ALTER TABLE `Pedido` ADD CONSTRAINT `Pedido_fk5` FOREIGN KEY (`idAgendamento`) REFERENCES `Agendamento`(`id`);

ALTER TABLE `Usuario` ADD CONSTRAINT `Usuario_fk0` FOREIGN KEY (`idCategoria`) REFERENCES `Categoria`(`id`);

ALTER TABLE `HigienePedido` ADD CONSTRAINT `HigienePedido_fk0` FOREIGN KEY (`idHigiene`) REFERENCES `Higiene`(`id`);

ALTER TABLE `AlimentoPedido` ADD CONSTRAINT `AlimentoPedido_fk0` FOREIGN KEY (`idAlimento`) REFERENCES `Alimento`(`id`);

ALTER TABLE `AcessorioPedido` ADD CONSTRAINT `AcessorioPedido_fk0` FOREIGN KEY (`idAcessorio`) REFERENCES `Acessorio`(`id`);

ALTER TABLE `SaudePedido` ADD CONSTRAINT `SaudePedido_fk0` FOREIGN KEY (`idSaude`) REFERENCES `saude`(`id`);

ALTER TABLE `Funcionario` ADD CONSTRAINT `Funcionario_fk0` FOREIGN KEY (`idUsuario`) REFERENCES `Usuario`(`id`);


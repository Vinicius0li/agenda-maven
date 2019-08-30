CREATE TABLE pessoas (
	id	BIGINT NOT	NULL AUTO_INCREMENT,
	nome			VARCHAR(200),
	dataNascimento	DATE,

	PRIMARY KEY 	(id)
);

CREATE TABLE enderecos (
	id	BIGINT NOT	NULL AUTO_INCREMENT,
	logradouro		VARCHAR(200),
	cep				VARCHAR(9),

	PRIMARY KEY 	(id)
);

CREATE TABLE contatos (
	id	BIGINT NOT	NULL AUTO_INCREMENT,
	email			VARCHAR(200),
	celular			VARCHAR(15),

	PRIMARY KEY 	(id)
);
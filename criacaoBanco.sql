USE sys;
CREATE DATABASE candidatos;
USE candidatos;
CREATE TABLE tblCANDIDATOS(
	 id INT NOT NULL AUTO_INCREMENT,
	_id VARCHAR(255) NOT NULL,
	nome VARCHAR(255),
	vaga VARCHAR(255),
	data_nascimento DATE NOT NULL,
	PRIMARY KEY(id)
	
);
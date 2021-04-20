CREATE DATABASE demo;
USE demo

CREATE TABLE IF NOT EXISTS empresas (
    empresa_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS clientes (
    cliente_id INT AUTO_INCREMENT,    
    name VARCHAR(255),
    empresa_id INT NOT NULL,
    PRIMARY KEY (cliente_id),
    FOREIGN KEY (empresa_id) REFERENCES empresas (empresa_id)
);


INSERT INTO empresas (name) VALUES ("empresa 1");
INSERT INTO empresas (name) VALUES ("empresa 2");

INSERT INTO clientes (name, empresa_id) VALUES ("cliente 1.1", 1);
INSERT INTO clientes (name, empresa_id) VALUES ("cliente 1.2", 1);
INSERT INTO clientes (name, empresa_id) VALUES ("cliente 2.1", 2);
INSERT INTO clientes (name, empresa_id) VALUES ("cliente 2.2", 2);

# select * from clientes c left join empresas e on c.empresa_id = e.empresa_id;

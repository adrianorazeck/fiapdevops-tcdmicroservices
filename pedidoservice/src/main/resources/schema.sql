DROP TABLE IF EXISTS pedidos;

CREATE TABLE pedidos (
  id            VARCHAR(2)  PRIMARY KEY NOT NULL,
  status        VARCHAR(30) NOT NULL,
  dataCriacao   VARCHAR(10) NOT NULL,
  dataEntrega   VARCHAR(10) NOT NULL,
  produto       TEXT        NOT NULL,
  endereco      TEXT        NOT NULL,
  uf            CHAR(2)     NOT NULL, 
  municipio     TEXT        NOT NULL,
  cep           VARCHAR(9)  NOT NULL);

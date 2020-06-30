DROP TABLE IF EXISTS entregas;

CREATE TABLE entregas (
  id        VARCHAR(2) PRIMARY KEY NOT NULL,
  uf        VARCHAR(2) NOT NULL,
  sla       INTEGER NOT NULL);

INSERT INTO entregas (id,  uf, sla) VALUES ('01', 'AC', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('02', 'AL', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('03', 'AP', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('04', 'AM', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('05', 'BA', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('06', 'CE', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('07', 'DF', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('08', 'ES', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('09', 'GO', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('10', 'MA', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('11', 'MT', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('12', 'MS', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('13', 'MG', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('14', 'PA', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('15', 'PB', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('16', 'PR', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('17', 'PE', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('18', 'PI', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('19', 'RJ', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('20', 'RN', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('21', 'RS', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('22', 'RO', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('23', 'RR', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('24', 'SC', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('25', 'SP', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('26', 'SE', 0);
INSERT INTO entregas (id,  uf, sla) VALUES ('27', 'TO', 0);

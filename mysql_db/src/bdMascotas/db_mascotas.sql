CREATE DATABASE mascotas;
USE mascotas;

CREATE TABLE mascotas (
id						int auto_increment primary key,
nombre					varchar(45),
raza					varchar(45),
anio					varchar(4),
cod_historia_clinica	int
);

CREATE TABLE historia_clinica (
id						int auto_increment primary key,
historial				varchar(255)
);

INSERT INTO mascotas (nombre,raza,anio,cod_historia_clinica) VALUES
("Lasi","Boxer","2010",4718),
("Rocky","Doberman","2011",4325),
("Rufus","Rotweiler","2015",5119),
("Tango","Pastor Alemán","2019",6011),
("Patxi","Dogo","2020",9735);

INSERT INTO historia_clinica (historial) VALUES
("Chequeo general"),
("Vacuna 1"),
("Fractura de pata trasera izquierda"),
("Bulto en costado derecho"),
("Dientes sensibles");

select * from mascotas;

drop table mascotas;

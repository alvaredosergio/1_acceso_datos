CREATE DATABASE personas;
USE personas;

CREATE TABLE usuario (
id						int auto_increment primary key,
nombre					varchar(50),
apellido				varchar(50),
dni						varchar(9),
tlf						varchar(50)
);

INSERT INTO usuario (nombre,apellido,dni,tlf) VALUES
("Sergio","Alvaredo","50456753Q","663567070"),
("Maria","Ruiz","49457859R","613587156"),
("Julia","Gomez","48452751S","678451010"),
("José","Ramos","47436752P","650456712"),
("Luis","Rodriguez","41545675L","680151526");

select * from usuario;

drop table usuario;

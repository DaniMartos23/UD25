

DROP table IF EXISTS fabricante;

create table fabricante(
	codigo Long auto_increment primary key,
	nombre varchar(100)
);

DROP table IF EXISTS articulo;

create table articulo(
	codigo Long auto_increment primary key,
	nombre varchar(100),
	precio int,
	cod_fabricante int,
	foreign key(cod_fabricante) references fabricante(codigo)
);

insert into fabricante (nombre) values('Jose'),('Dani'),('Pol');
insert into articulo (nombre, precio, cod_fabricante) values( 'disco duro',50,1),('fuente alimentación',60,2),('memoria ram',75,3);

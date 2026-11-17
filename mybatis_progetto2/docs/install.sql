create table corso(
	id int(11) not null auto_increment primary key
	,nome varchar(30) not null
	,aula varchar(5)
	,argomento varchar(30)

)engine=innodb;

create table studente(
	id int(11) not null auto_increment primary key
	,nome varchar(30) not null
	,cognome varchar(40) not null
	,email varchar(70)
	,id_corso int(11) 
	,foreign key (id_corso) references corso(id)

)engine=innodb;


insert into corso(nome,aula,argomento) values ('java','A1','programmazione');
insert into studente(nome,cognome,email,id_corso) values ('mario','rossi','m.rossi@gmail.com',1);
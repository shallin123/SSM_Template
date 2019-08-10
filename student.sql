create table student
(
	id int unsigned auto_increment
		primary key,
	command varchar(30) not null,
	description varchar(30) not null,
	content varchar(30) not null
)
charset=utf8;


use library;

drop table book;
drop table author;

create table author(
id int not null auto_increment primary key,
name varchar(45),
last_name varchar(45));

create table book(
id int not null auto_increment primary key,
name varchar(45),
author_id int,
foreign key(author_id) references author(id));

ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
flush privileges;

drop database if exists library;
Create database library;
use library;
create table author 
(
id int auto_increment, 
name varchar(255),
PRIMARY KEY (id)
);

insert into author (id, name)
values
(3, 'Taras'),
(4, 'Puskkin'),
(7, 'Puskkin'),
(8, 'Bulgakov');
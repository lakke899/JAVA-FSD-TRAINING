create database coffee_str;
use coffee_str;

create table products(
id int auto_increment primary key,
name varchar(30),
price decimal(4,2),
coffee_origin varchar(30)
);

create table orders(
id int auto_increment primary key,
product_id int,
customer_id int,
order_time datetime
);

create table customers(
id int auto_increment primary key,
first_name varchar(30),
last_name varchar(30),
gender enum('M','F'),
phone_number varchar(11)
);
create database example;
use example;

create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6)
);
alter table addresses
add primary key (id);

create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int
);
alter table people
add primary key(id);
describe people;

create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int
);
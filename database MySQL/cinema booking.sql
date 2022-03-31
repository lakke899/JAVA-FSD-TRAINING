create database cinema_booking_system;
use cinema_booking_system;
create table films(
id int primary key auto_increment,
name varchar(45) not null unique,
length_min int not null
);
desc films;
show tables;
create table customers(
id int primary key auto_increment,
first_name varchar(45),
last_name varchar(45) not null,
email varchar(45) not null unique
);
desc customers;
create table rooms(
id int primary key auto_increment,
name varchar(45) not null,
no_seats int not null
);
desc rooms;
create table screenings(
id int primary key auto_increment,
film_id int not null,
room_id int not null,
start_time datetime not null,
foreign key(film_id) references films(id),
foreign key(room_id) references rooms(id)
);
desc screenings;
create table seats(
id int primary key auto_increment,
row_char CHAR(1) not null,
number int not null,
room_id int not null,
foreign key(room_id) references rooms(id)
);
desc seats;
create table bookings(
id int primary key auto_increment,
screening_id int not null,
customer_id int not null,
foreign key(screening_id) references screenings(id),
foreign key(customer_id) references customers(id)
);
desc bookings;
create table reserved_seat(
id int primary key auto_increment,
booking_id int not null,
seat_id int not null,
foreign key(booking_id) references bookings(id),
foreign key(seat_id) references seats(id)
);
desc reserved_seat;
show tables;

create database project_movie_data;

use project_movie_data;

create table actor(
act_id int  primary key ,
act_fname varchar(20),
act_lname varchar(20),
act_gender char
);

desc actor;
drop table actor;

create table movie_cast(
act_id int ,
mov_id int ,
role varchar(30),
foreign key(act_id) references actor(act_id),
foreign key(mov_id) references movie(mov_id)
);
drop table movie_cast;
desc movie_cast;

create table director(
dir_id int primary key ,
dir_fname varchar(20),
dir_lname varchar(20)
);
drop table director;
desc director;

create table genres(
gen_id int primary key,
gen_title varchar(20)
);
drop table genres;
desc genres;

create table movie(
mov_id int primary key ,
mov_title varchar(50),
mov_year int,
mov_time int,
mov_lang varchar(50),
mov_dt_rel date,
mov_rel_country varchar(5)
);
drop table movie;
desc movie;

create table movie_genres(
mov_id int,
gen_id int,
foreign key(gen_id) references genres(gen_id),
foreign key(mov_id) references movie(mov_id)
);
drop table movie_genres;
desc movie_genres;

create table movie_direction(
dir_id int,
mov_id int,
foreign key(dir_id) references director(dir_id),
foreign key(mov_id) references movie(mov_id)
);
drop table movie_direction;
desc movie_direction;

create table reviewer(
rev_id int primary key,
rev_name char(30)
);
drop table reviewer;
desc reviewer;

create table rating(
mov_id int,
rev_id int,
rev_stars int,
num_o_ratings int,
foreign key(rev_id) references reviewer(rev_id),
foreign key(mov_id) references movie(mov_id)
);
drop table rating;
desc rating;

show tables;


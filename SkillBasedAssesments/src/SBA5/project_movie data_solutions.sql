use project_movie_data;

-- 3.Write a query in SQL to list the Horror movies?
select mov_title,gen_title from movie
inner join movie_genres on movie.mov_id=movie_genres.mov_id
inner join genres on genres.gen_id=movie_genres.gen_id
where genres.gen_title='Horror';


-- 4.Write a query in SQL to find the name of all reviewers who have rated 8 or   more stars?
select rev_name,rev_stars from reviewer
inner join rating on reviewer.rev_id=rating.rev_id
where rev_stars>=8;

-- 5.Write a query in SQL to list all the information of the actors who played a role in the movie ‘Deliverance’
select act_fname,act_lname,act_gender,mov_title from actor 
inner join movie_cast on actor.act_id=movie_cast.act_id
inner join  movie on movie_cast.mov_id=movie.mov_id 
where movie.mov_title='Deliverance';

-- 6.Write a query in SQL to find the name of the director (first and last names) who directed a movie that casted a role for ‘Eyes Wide Shut’. (using subquery)

select dir_fname,dir_lname from director
natural join movie_direction 
natural join movie_cast
where act_id in 
(select act_id from movie
natural join movie_cast
natural join actor
where role is not null and mov_title='Eyes Wide Shut');

-- 7.Write a query in SQL to find the movie title, year, date of release, director and actor for those movies which reviewer is ‘Neal Wruck’
select mov_title,mov_year,mov_dt_rel, concat(director.dir_fname,' ',director.dir_lname) as director_name, concat(actor.act_fname,' ',actor.act_lname) from movie
inner join movie_cast on movie.mov_id=movie_cast.mov_id
inner join actor on movie_cast.act_id=actor.act_id
inner join movie_direction on movie.mov_id=movie_direction.mov_id
inner join director on movie_direction.dir_id=director.dir_id
where movie.mov_id in 
(select mov_id from reviewer
inner join rating on reviewer.rev_id=rating.rev_id
where rev_name='Neal Wruck');

-- 8 Write a query in SQL to find all the years which produced at least one movie and that received a rating of more than 4 stars.
select mov_title,rev_stars,mov_year from movie
inner join rating on movie.mov_id=rating.mov_id
where rev_stars>=4;

-- 9 Write a query in SQL to find the name of all movies who have rated their ratings with a NULL value
select mov_title,rev_stars from movie
inner join rating on movie.mov_id=rating.mov_id
where rating.rev_stars=null;
select * from rating;


-- 10 Write a query in SQL to find the name of movies who were directed by ‘David’

select mov_title,dir_fname,dir_lname from movie
inner join movie_direction on movie.mov_id=movie_direction.mov_id
inner join director on movie_direction.dir_id=director.dir_id
where director.dir_fname='David' or director.dir_lname='David';

-- 11 Write a query in SQL to list the first and last names of all the actors who were cast in the movie ‘Boogie Nights’, and the roles they played in that production.
select act_fname,act_lname,mov_title,role from actor 
inner join movie_cast on actor.act_id=movie_cast.act_id
inner join  movie on movie_cast.mov_id=movie.mov_id 
where movie.mov_title='Boogie Nights';

-- 12 Find the name of the actor who have worked in more than one movie.
select act_fname,act_lname from actor
where act_id in (select act_id from movie_cast group by act_id
having count(act_id)>1);
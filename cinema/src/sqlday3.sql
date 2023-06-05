

/*1. Get the Top 3 film that have the most CUSTOMERS book*/
select film.name,count(distinct booking.customer_id) as count from film join screening on film.id=screening.film_id
join booking on screening.id=booking.screening_id
group by film.name
order by count desc
limit 3;


/*2/ Get all the films that longer than average length
*/

select * from film where (SELECT AVG(length_min) FROM film) > length_min;

/*3/ Get the room which have the highest and lowest screenings IN 1 SQL query*/

select room.name,count(room.id) as count from room join screening on room.id=screening.room_id
group by room.id
having  count =(select max(y.count) from (select count(room.id) as count from room join screening on room.id=screening.room_id
group by room.id) y) 
or count =(select min(y.count) from (select count(room.id) as count from room join screening on room.id=screening.room_id
group by room.id) y) ;

/* 4/ Get number of booking customers of each room of film ‘Tom&Jerry’ */

select film.name, count(screening_id) from booking join screening on booking.screening_id = screening.id
join film on screening.film_id = film.id
group by film.name;

/*5/ What seat is being book the most ?*/
 select seat.room_id,seat.row,seat.number,count(seat_id)as c from booking join reserved_seat on booking.id= reserved_seat.booking_id
 join seat on reserved_seat.seat_id=seat.id
 group by room_id,seat.row,seat.number 
 having c =  (select max(y.c) from (select count(seat_id)as c from booking join reserved_seat on booking.id= reserved_seat.booking_id join seat on reserved_seat.seat_id=seat.id
 group by room_id,seat.row,seat.number ) y)
 order by c desc;
 
 /* 6/ What film have the most screens in 2022? */
 
select film.name,count(film_id) as count from film join screening on film.id= screening.film_id
group by film.id
having count = (select max(y.count) from (select count(film_id) as count from film join screening on film.id= screening.film_id
group by film.id)y);

/*7/ Which day has most screen?*/

select date(start_time),count(date(start_time)) as count from screening
group by date(start_time)
having count = (select max(y.count) from (select count(date(start_time)) as count from screening
group by date(start_time))y);

/* 8/ Show film on 2022- MAy*/
select * from screening where year(start_time)= 2022 and month(start_time)=05;

/*.9/ Select film end with character "n" */

Select * from film where film.name like '%n';

/*10/ Show customer name but just show first 3 characters AND last 3 characters in UPPERCASE*/
select customer.first_name,customer.last_name, upper(concat(left(customer.first_name,3) ,' ' ,right(customer.last_name,3)))  from customer ;

/*11/ WHAT film long than 2 hours?*/
select * from film where film.length_min >120











 
 










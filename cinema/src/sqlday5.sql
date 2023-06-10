CREATE DEFINER=`root`@`localhost` PROCEDURE `findMostBookedRoom`(out room_id int)
BEGIN
with temptable as(select room.name,room.id,count(distinct booking.customer_id)as cus
from room join screening on room.id = screening.room_id
join booking on screening.id=booking.screening_id
group by room.name,room.id
having cus= (select count(distinct booking.customer_id)as cus
from room join screening on room.id = screening.room_id
join booking on screening.id=booking.screening_id 
group by room.name,room.id
order by cus desc
limit 1))


select id into room_id
from temptable;
END

CREATE DEFINER=`root`@`localhost` PROCEDURE `findCustomer`(in roomid int)
BEGIN
select customer.first_name
from customer join booking on booking.customer_id=customer.id
join screening on booking.screening_id=screening.id
where screening.room_id = roomid;




END
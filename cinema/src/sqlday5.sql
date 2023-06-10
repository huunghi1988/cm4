CREATE DEFINER=`root`@`localhost` PROCEDURE `findMostBookedRoom`()
BEGIN
select room.name,room.id,count(distinct booking.customer_id)as cus
from room join screening on room.id = screening.room_id
join booking on screening.id=booking.screening_id
group by room.name,room.id
having cus= (select count(distinct booking.customer_id)as cus
from room join screening on room.id = screening.room_id
join booking on screening.id=booking.screening_id 
group by room.name,room.id
order by cus desc
limit 1);
END
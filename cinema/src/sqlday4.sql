

-- QUESTION 1
-- FOR DELETE CASE
CREATE DEFINER=`root`@`localhost` TRIGGER `customer_AFTER_DELETE` AFTER DELETE ON `customer` FOR EACH ROW BEGIN
UPDATE booking
    SET customer_name = null
    WHERE customer_id = OLD.id;
END

-- FOR UPDATE CASE
CREATE DEFINER=`root`@`localhost` TRIGGER `booking_AFTER_UPDATE_cutomer` AFTER UPDATE ON `customer` FOR EACH ROW BEGIN
UPDATE booking
    SET customer_name = CONCAT(NEW.last_name, ' ', NEW.first_name)
    WHERE customer_id = NEW.id;
END

-- QUESTION 2
-- FOR INSERT
CREATE DEFINER=`root`@`localhost` TRIGGER `booking_AFTER_INSERT` AFTER INSERT ON `booking` FOR EACH ROW BEGIN
UPDATE film
        SET total_booking_CUSTOMER = total_booking_CUSTOMER + 1
        WHERE id = NEW.screening_id;
END

-- FOR DELETE
CREATE DEFINER=`root`@`localhost` TRIGGER `booking_AFTER_DELETE` AFTER DELETE ON `booking` FOR EACH ROW BEGIN
UPDATE film
        SET total_booking_CUSTOMER = total_booking_CUSTOMER - 1
        WHERE id = OLD.screening_id;
END

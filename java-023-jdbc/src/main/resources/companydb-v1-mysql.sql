CREATE SCHEMA `companydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `companydb`.`customers` (
  `customer_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(55) NULL,
  PRIMARY KEY (`customer_id`));
  
INSERT INTO `companydb`.`customers` (`first_name`, `last_name`) VALUES ('Selahattin', 'Dişli');
INSERT INTO `companydb`.`customers` (`first_name`, `last_name`) VALUES ('Adem', 'Kok');
INSERT INTO `companydb`.`customers` (`first_name`, `last_name`) VALUES ('Barış', 'Tatar');
INSERT INTO `companydb`.`customers` (`first_name`, `last_name`) VALUES ('Dilşat', 'Şentürk');
  
SELECT * FROM companydb.customers;

drop schema ims;

CREATE DATABASE IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `customer_id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`customer_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
`order_id` INT(11) NOT NULL AUTO_INCREMENT,
`customer_id` INT NOT NULL,
`date_of_order` DATETIME NOT NULL,
`total cost` DECIMAL(6,2) NOT NULL,
PRIMARY KEY (`order_id`),
FOREIGN KEY(`customer_id`) REFERENCES `ims`.`customers`(`customer_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`products` (
`product_id` INT(11) NOT NULL AUTO_INCREMENT,
`product_name` VARCHAR(300) NOT NULL,
`cost` DECIMAL(6,2) NOT NULL,
PRIMARY KEY(`product_id`) 
);

CREATE TABLE IF NOT EXISTS `ims`.`order_item` (
`order_item_id` INT(11) NOT NULL AUTO_INCREMENT,
`order_id` INT NOT NULL,
`product_id` INT NOT NULL,
`quantity` INT NOT NULL,
PRIMARY KEY(`order_item_id`),
FOREIGN KEY(`order_id`) REFERENCES `ims`.`orders`(`order_id`),
FOREIGN KEY(`product_id`) REFERENCES `ims`.`products`(`product_id`)
);

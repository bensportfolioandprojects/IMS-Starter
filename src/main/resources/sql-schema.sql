drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS orders;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`items` (
`id` INT(11) NOT NULL AUTO_INCREMENT,
`item_name` VARCHAR(40) NOT NULL,
`item_price` DOUBLE(11) DEFAULT NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
`order_id` INT(11) NOT NULL AUTO_INCREMENT,
`order_items` VARCHAR(40) NOT NULL,
`total_price` DOUBLE(11) DEFAULT NULL,
`customer_id` INT(11) NOT NULL AUTO_INCREMENT,
PRIMARY KEY (`order_id`)

);
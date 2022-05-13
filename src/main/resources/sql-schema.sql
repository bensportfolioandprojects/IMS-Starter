drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS items;
DROP TABLE IF EXISTS orders;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`items` (
`id` INT NOT NULL AUTO_INCREMENT,
`item_name` VARCHAR(40) NOT NULL,
`item_price` DOUBLE NOT NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
`id` INT NOT NULL AUTO_INCREMENT,
`customer_id` INT NOT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`customer_id`) REFERENCES customers (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`order_items` (
`id` INT AUTO_INCREMENT,
`order_id` INT NOT NULL,
`item_id` INT NOT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`order_id`) REFERENCES orders (`id`),
FOREIGN KEY (`item_id`) REFERENCES items (`id`)
);

SET @@global.time_zone = '+00:00';
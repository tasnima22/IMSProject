USE IMS; 

INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Jordan', 'Harrison');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Emily', 'Williams');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Jane', 'Smith');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Tasnima', 'Monaf');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('Muhammed', 'Ali');

-- SELECT * FROM `ims`.`customers`

INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total cost`, `date_of_order`) VALUES ('1','1','25.50','2022-02-17 12:27:30.1111');
INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total cost`, `date_of_order`) VALUES ('2','2', '28.99','2022-02-17 15:54:23.1111');
INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total cost`, `date_of_order`) VALUES ('3','3', '32.45','2022-02-18 10:09:12.1111');
INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total cost`, `date_of_order`) VALUES ('4','4', '34.99','2022-02-18 10:57:01.1111');
INSERT INTO `ims`.`orders`(`order_id`, `customer_id`, `total cost`, `date_of_order`) VALUES ('5','5', '38.00','2022-02-18 13:00:00.0001');

-- SELECT * FROM `ims`.`customers` JOIN `ims`.`orders` ON `ims`.`customers`.customer_id = `ims`.`orders`.customer_id;

-- SELECT * FROM `ims`.`products`;

INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('1','CALL OF DUTY', '25.50');
INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('2','FIFA22', '28.99');
INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('3','ASSASSINS CREED', '32.45');
INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('4','MARVELS AVENGERS', '34.99');
INSERT INTO `ims`.`products`(`product_id`, `product_name`, `cost`) VALUES ('5','GRAND THEFT AUTO 5', '38.00');

-- SELECT * FROM `ims`.`order_item` ;

INSERT INTO `ims`.`order_item`(`order_item_id`, `order_id`, `product_id`, `quantity`) VALUES ('1','1', '1', '2');
INSERT INTO `ims`.`order_item`(`order_item_id`, `order_id`, `product_id`, `quantity`) VALUES ('2','2', '2', '1');
INSERT INTO `ims`.`order_item`(`order_item_id`, `order_id`, `product_id`, `quantity`) VALUES ('3','3', '3', '3');
INSERT INTO `ims`.`order_item`(`order_item_id`, `order_id`, `product_id`, `quantity`) VALUES ('4','4', '4', '1');
INSERT INTO `ims`.`order_item`(`order_item_id`, `order_id`, `product_id`, `quantity`) VALUES ('5','5', '5', '2');

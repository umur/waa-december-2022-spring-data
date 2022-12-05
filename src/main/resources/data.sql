INSERT INTO address (id, street, city,  zip_code) VALUES (1, '123 Main St', 'New York', '12345');
INSERT INTO address (id, street, city, zip_code) VALUES (2,'54 2nd St', 'Fairfield',  '34512');

INSERT INTO main_user (id,first_name, last_name, address_id, email, password) VALUES (1, 'Henry', 'Ford',1,'test@email.com', '1');
INSERT INTO main_user (id,first_name, last_name,address_id, email, password) VALUES (2,'James', 'Gosling',2, 'james@email.com', '123456');

update address set user_id = 1 where id = 1;
update address set user_id = 2 where id = 2;

insert INTO category (id,name) VALUES (1,'Mobile');
insert INTO category (id,name) VALUES (2,'Laptop');

insert INTO product (id,name, price, rating,category_id) VALUES (1,'Iphone', 1200, 4,1);
insert INTO product (id,name, price, rating,category_id) VALUES (2,'Samsung', 1100, 5,1);
insert INTO product (id,name, price, rating,category_id) VALUES (3,'Acer', 1500,  3,2);

insert into review(id,comment, user_id, product_id) values (1,'Good', 1, 1);
insert into review(id,comment, user_id, product_id) values (2,'I love the product', 2, 1);
insert into review(id,comment, user_id, product_id) values (3,'Bad Product', 1, 3);



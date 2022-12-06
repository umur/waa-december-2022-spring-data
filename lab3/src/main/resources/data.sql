
-- address

INSERT INTO address (city, street, zip)
VALUES ('Fairfield', '1000N 4th St', '52557');

INSERT INTO address (city, street, zip)
VALUES ('Fairfield', '507 W Burlington Ave', '52557');

INSERT INTO address (city, street, zip)
VALUES ('Fairfield', '104 W Adams Ave', '52557');

INSERT INTO address (city, street, zip)
VALUES ('Fairfield', '117 N Court St', '52557');

-- users

INSERT INTO users (email, password, firstname, lastname, address_id)
VALUES ('diptesh.shrestha@miu.edu', 'Dip123', 'Diptesh', 'Shrestha', (SELECT id FROM address WHERE street = '117 N Court St'));

INSERT INTO users (email, password, firstname, lastname, address_id)
VALUES ('santosh.manandhar@miu.edu', 'San123', 'Santosh', 'Manandhar', (SELECT id FROM address WHERE street = '1000N 4th St'));

INSERT INTO users (email, password, firstname, lastname, address_id)
VALUES ('bipul.ranjitkar@miu.edu', 'Bip123', 'Bipul', 'Ranjitkar', (SELECT id FROM address WHERE street = '507 W Burlington Ave'));

INSERT INTO users (email, password, firstname, lastname, address_id)
VALUES ('sunit.bajracharya@miu.edu', 'Sun123', 'Sunit', 'Bajracharya', (SELECT id FROM address WHERE street = '104 W Adams Ave'));

-- category

INSERT INTO category (name)
VALUES ('Sports');

INSERT INTO category (name)
VALUES ('Electronics');

INSERT INTO category (name)
VALUES ('Groceries');

INSERT INTO category (name)
VALUES ('Clothing');

-- product

INSERT INTO product (name, price, rating, category_id)
VALUES ('Mac Pro 14 inch.', 1849, 9.0, (SELECT id FROM category WHERE name = 'Electronics'));

INSERT INTO product (name, price, rating, category_id)
VALUES ('Blue Medium Polo Shirt', 28, 5.75, (SELECT id FROM category WHERE name = 'Clothing'));

INSERT INTO product (name, price, rating, category_id)
VALUES ('Football Shoes Size 42', 80, 6.5, (SELECT id FROM category WHERE name = 'Sports'));

INSERT INTO product (name, price, rating, category_id)
VALUES ('Planters Mixed Nuts 500gm', 9, 4.25, (SELECT id FROM category WHERE name = 'Groceries'));

-- review

INSERT INTO review (comment, user_id, product_id)
VALUES ('Average quality and not very delicious', (SELECT id FROM users WHERE email = 'bipul.ranjitkar@miu.edu'), (SELECT id FROM product WHERE name = 'Planters Mixed Nuts 500gm'));

INSERT INTO review (comment, user_id, product_id)
VALUES ('Okay and comfortable', (SELECT id FROM users WHERE email = 'sunit.bajracharya@miu.edu'), (SELECT id FROM product WHERE name = 'Football Shoes Size 42'));

INSERT INTO review (comment, user_id, product_id)
VALUES ('Good style and fitting', (SELECT id FROM users WHERE email = 'diptesh.shrestha@miu.edu'), (SELECT id FROM product WHERE name = 'Blue Medium Polo Shirt'));

INSERT INTO review (comment, user_id, product_id)
VALUES ('Excellent device', (SELECT id FROM users WHERE email = 'santosh.manandhar@miu.edu'), (SELECT id FROM product WHERE name = 'Mac Pro 14 inch.'));

INSERT INTO category(name) VALUES ('Phone');
INSERT INTO category(name) VALUES ('Laptop');

INSERT INTO product(name, price, rating, category_id) VALUES ('Iphone X', 900, 4, 1);
INSERT INTO product(name, price, rating, category_id) VALUES ('Iphone XI', 1000, 5, 1);
INSERT INTO product(name, price, rating, category_id) VALUES ('Iphone XII', 1100, 3, 1);
INSERT INTO product(name, price, rating, category_id) VALUES ('Macbook air', 2000, 5, 2);

INSERT INTO user1(email, first_name, lastname, password) VALUES ('john@miu.edu', 'John', 'Lennon', 'hahahahah');
INSERT INTO user1(email, first_name, lastname, password) VALUES ('ann@miu.edu', 'Ann', 'Marie', 'hahaffffhahah');
INSERT INTO user1(email, first_name, lastname, password) VALUES ('josh@miu.edu', 'Josh', 'Joshua', 'ttt');
INSERT INTO user1(email, first_name, lastname, password) VALUES ('john@miu.edu', 'Joe', 'Jerry', 'ggggg');

-- INSERT INTO review(comment, product_id, user1_id) VALUES ('bad', 1, 1);
-- INSERT INTO review(comment, product_id, user1_id) VALUES ('best', 2, 1);
-- INSERT INTO review(comment, product_id, user1_id) VALUES ('good', 3, 2);
-- INSERT INTO review(comment, product_id, user1_id) VALUES ('very good', 4, 3);

INSERT INTO address(city, street, zip, user1_id) VALUES ('Fairfield', 'Main', 52556, 1);
INSERT INTO address(city, street, zip, user1_id) VALUES ('Fairfield', 'Main North', 52557, 2);
INSERT INTO address(city, street, zip, user1_id) VALUES ('Fairfield', 'North', 52556, 3);
INSERT INTO address(city, street, zip, user1_id) VALUES ('Fairfield', 'South', 52557, 4);
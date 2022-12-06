-- Data For Category

INSERT  INTO  Category (name) VALUES ('Fishing Gear');
INSERT  INTO  Category (name) VALUES ('Boat');
INSERT  INTO  Category (name) VALUES ('Kayak');

--Data For Product

INSERT INTO Product(name,price,rating,category_id) VALUES ('A',200,2.5,1);
INSERT INTO Product(name,price,rating,category_id) VALUES ('B',400,5,1);

INSERT INTO Product(name,price,rating,category_id) VALUES ('C',100,3.5,2);
INSERT INTO Product(name,price,rating,category_id) VALUES ('D',600,4.5,2);

INSERT INTO Product(name,price,rating,category_id) VALUES ('E',800,1.5,3);
INSERT INTO Product(name,price,rating,category_id) VALUES ('F',1000,2.5,3);

--Data for User
INSERT INTO User_table(email,password,first_name,last_name) VALUES ('asd@asd.com','xxxx','asd','asd');
INSERT INTO User_table(email,password,first_name,last_name) VALUES ('sdfs@adasd.com','xxxx','sdf','sdf');

--Data for Address
INSERT INTO Address(street,zip,city,user_id) VALUES ('10NTH','1432','sdf',1);
INSERT INTO Address(street,zip,city,user_id) VALUES ('110STH','9123','sdf',2);





--Data for Review

INSERT INTO Review(comment,user_id,product_id) VALUES ('Good!',1,1);
INSERT INTO Review(comment,user_id,product_id) VALUES ('Wow!',2,2);



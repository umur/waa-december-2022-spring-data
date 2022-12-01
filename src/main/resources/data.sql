-- Data For Category

INSERT  INTO  Category (name) VALUES ('Car');
INSERT  INTO  Category (name) VALUES ('Motorbike');
INSERT  INTO  Category (name) VALUES ('Rocket');

--Data For Product

INSERT INTO Product(name,price,rating,category_id) VALUES ('Corolla',200,2.5,1);
INSERT INTO Product(name,price,rating,category_id) VALUES ('VWPolo',400,5,1);

INSERT INTO Product(name,price,rating,category_id) VALUES ('Harley VRod',100,3.5,2);
INSERT INTO Product(name,price,rating,category_id) VALUES ('Vespa',600,4.5,2);

INSERT INTO Product(name,price,rating,category_id) VALUES ('Falcon9',800,1.5,3);
INSERT INTO Product(name,price,rating,category_id) VALUES ('Saturn5',1000,2.5,3);

--Data for User
INSERT INTO Users(email,password,firstName,lastName) VALUES ('prabesh.kc@miu.edu','asdf','Prabesh','KC');
INSERT INTO Users(email,password,firstName,lastName) VALUES ('karna.shrestha@miu.edu','asdf','Karna','Shrestha');

--Data for Address
INSERT INTO Address(street,zip,city,user_id) VALUES ('1000NTH','52557','FairField',1);
INSERT INTO Address(street,zip,city,user_id) VALUES ('1001N 4th St','52557','Fairfield',2);


--Data for Review

INSERT INTO Review(comment,user_id,product_id) VALUES ('I have seen better cars!',1,1);
INSERT INTO Review(comment,user_id,product_id) VALUES ('The bike is awesome!',2,2);


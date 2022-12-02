insert into address_tbl (id,street,zip,city,user_id)
values('1','Fairfield','1000N 4th St','52557','1'),
      ('2','Fairfield','1000N 4th St','52556','2');

insert into categories_tbl(id,name)
values('1','Smartphone'),
      ('2','Laptop');

insert into product_tbl (id, name, price, rating, category_id)
values ('1', 'Macbook', '1200', '4', '1'),
       ('2','Iphone 12', '900', '4.8', '2');

insert into user_tbl (id, email, first_name, last_name, password)
values (1, 'rich@abc.com', 'richi', 'richi', '1111'),
       (2, 'alazar@abc.com', 'alazar', 'alazar', '2222');

insert into reviews (id, comment, product_id, user_id)
values('1', 'nice course', '1', '1'),
      ('2', 'i like it', '1', '2');
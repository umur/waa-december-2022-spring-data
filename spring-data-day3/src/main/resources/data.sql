insert into addresses (id, city, street, zip)
values(1, 'Fairfield', '1000 N 4th St', 52557),
      (2, 'Fairfield', '1020 N 4th St', 52554);

insert into categories (id, name)
values(1, 'Laptop'),
    (2, 'Phone');

insert into products (id, name, price, rating, category_id)
values (1, 'Macbook', 1200, 4.5, 1),
    (2,'Iphone 12', 900, 4.8, 2);

insert into users (id, email, first_name, last_name, password, address_id)
values (1, 'bipul@abc.com', 'Bipul', 'Ranjtikar', 'pass', 1),
    (2, 'john@abc.com', 'John', 'Doe', 'word', 2);

insert into reviews (id, comment, product_id, user_id)
values(1, 'Test comment', 1, 1),
    (2, 'Good Product', 1, 2);
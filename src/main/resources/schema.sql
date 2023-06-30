create table if not exists netology.CUSTOMERS
(
    id           serial primary key,
    name         varchar(100)          not null,
    surname      varchar(100)          not null,
    age          int check (age < 125) not null,
    phone_number varchar(100)          not null
);

create table if not exists netology.ORDERS
(
    id           serial primary key,
    date         date         not null,
    customer_id  int,
    product_name varchar(100) not null,
    amount       money        not null,
    foreign key (customer_id) references netology.CUSTOMERS (id)
);
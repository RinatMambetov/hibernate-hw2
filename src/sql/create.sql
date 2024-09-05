create table Principal(
    id serial primary key,
    "name" varchar(100) not null,
    age int check (age > 18)
);

create table School(
    id serial primary key,
    school_number int not null,
    principal_id int unique references Principal(id) on delete set null
);


insert into Principal(name, age)
values
('Bob', 28),
('Tom', 35),
('Katy', 39),
('Alice', 45);

insert into School(school_number, principal_id)
values
(7, 3),
(131, 1),
(18, 2),
(39, 4);

/* Inner Join */
create table tbl_customer(id int, name varchar(255), city varchar(255));
create table tbl_order(id int, customer_id int, item_name varchar(255));

insert into tbl_customer(id,name,city) values(1,'AAA','VIZAG');
insert into tbl_customer(id,name,city) values(2,'BBB','HYD');
insert into tbl_customer(id,name,city) values(3,'CCC','VIJ');
insert into tbl_customer(id,name,city) values(4,'DDD','WARANGAL');

select * from tbl_customer;


insert into tbl_order(id,customer_id,item_name) values(111,1,'Pen');
insert into tbl_order(id,customer_id,item_name) values(222,1,'Ball');
insert into tbl_order(id,customer_id,item_name) values(333,2,'Book');
insert into tbl_order(id,customer_id,item_name) values(444,3,'Mobile');
insert into tbl_order(id,customer_id,item_name) values(555,1,'Laptop');

select * from tbl_order;

/* inner join */
select c.id,c.name,o.item_name from tbl_customer c inner join tbl_order o on c.id = o.customer_id;

/* left join */
select c.id,c.name,o.item_name from tbl_customer c left join tbl_order o on c.id = o.customer_id;

/* right join */
select c.id,c.name,o.item_name from tbl_customer c right join tbl_order o on c.id = o.customer_id;

create table persona (
    codper serial primary key,
    nomper varchar(50),
    lnameper varchar(50)
);

create table producto (
    codprod serial primary key,
    nomprod varchar(50),
    priceprod numeric(5,2)
);

select * from persona;
select * from producto;
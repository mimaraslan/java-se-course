CREATE SCHEMA companydb
    AUTHORIZATION postgres;


CREATE TABLE companydb.customers
(
    customer_id serial NOT NULL,
    first_name character varying(50),
    last_name character varying(55),
    PRIMARY KEY (customer_id)
);

ALTER TABLE IF EXISTS companydb.customers
    OWNER to postgres;


  
INSERT INTO companydb.customers (first_name, last_name) VALUES ('Selahattin', 'Dişli');
INSERT INTO companydb.customers (first_name, last_name) VALUES ('Adem', 'Kok');
INSERT INTO companydb.customers (first_name, last_name) VALUES ('Barış', 'Tatar');
INSERT INTO companydb.customers (first_name, last_name) VALUES ('Dilşat', 'Şentürk');
INSERT INTO companydb.customers (first_name, last_name) VALUES ('İlyas', 'Bakır');

SELECT * FROM companydb.customers;

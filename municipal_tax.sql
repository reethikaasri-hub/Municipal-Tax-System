CREATE DATABASE municipal_tax;
SHOW DATABASES;
USE municipal_tax;
CREATE TABLE citizens (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    address VARCHAR(200),
    phone VARCHAR(15)
);
CREATE TABLE property (
    property_id INT PRIMARY KEY AUTO_INCREMENT,
    citizen_id INT,
    property_type VARCHAR(50),
    area DOUBLE,
    FOREIGN KEY (citizen_id) REFERENCES citizens(id)
);
CREATE TABLE tax (
    tax_id INT PRIMARY KEY AUTO_INCREMENT,
    property_id INT,
    tax_amount DOUBLE,
    tax_type VARCHAR(50),
    FOREIGN KEY (property_id) REFERENCES property(property_id)
);
CREATE TABLE payment (
    payment_id INT PRIMARY KEY AUTO_INCREMENT,
    tax_id INT,
    amount_paid DOUBLE,
    payment_date DATE,
    FOREIGN KEY (tax_id) REFERENCES tax(tax_id)
);

INSERT INTO citizens (name, address, phone)
VALUES ('Ree', 'Cbe', '9876543210');
INSERT INTO citizens (name, address, phone)
VALUES ('Ravi', 'Ooty', '0123456789');


SHOW DATABASES;

USE municipal_tax;
SELECT * FROM citizens;

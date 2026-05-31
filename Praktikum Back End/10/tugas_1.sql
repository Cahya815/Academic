USE storedb;

CREATE TABLE IF NOT EXISTS consumer (
    code INT(5) NOT NULL AUTO_INCREMENT,
    name VARCHAR(35),
    address VARCHAR(50),
    phone VARCHAR(15),
    PRIMARY KEY (code)
);

CREATE TABLE IF NOT EXISTS sale (
    code INT(5) NOT NULL AUTO_INCREMENT,
    sale_date DATE,
    consumer_code INT(5),
    product_code INT(5),
    quantity INT(5),
    total_price INT(10),
    PRIMARY KEY (code)
);

INSERT INTO consumer (name, address, phone) VALUES ('Budi Santoso', 'Jl. Merdeka No.1', '081234567890');
INSERT INTO consumer (name, address, phone) VALUES ('Siti Rahayu', 'Jl. Sudirman No.5', '082345678901');
INSERT INTO consumer (name, address, phone) VALUES ('Andi Wijaya', 'Jl. Gatot Subroto No.10', '083456789012');

INSERT INTO sale (sale_date, consumer_code, product_code, quantity, total_price) VALUES ('2026-01-10', 1, 1, 2, 10000);
INSERT INTO sale (sale_date, consumer_code, product_code, quantity, total_price) VALUES ('2026-01-11', 2, 2, 1, 8000000);
INSERT INTO sale (sale_date, consumer_code, product_code, quantity, total_price) VALUES ('2026-01-12', 3, 3, 3, 150000);

DROP TABLE IF EXISTS BENEFITS;
DROP TABLE IF EXISTS PLAN;
CREATE TABLE BENEFITS (
ID INT AUTO_INCREMENT  PRIMARY KEY,
NAME VARCHAR(50) NOT NULL,
DESCRIPTION VARCHAR(100) NOT NULL,
IMAGE_URL VARCHAR(100)
);

CREATE TABLE PLAN (
ID INT AUTO_INCREMENT  PRIMARY KEY,
NAME VARCHAR(50) NOT NULL,
DESCRIPTION VARCHAR(100) NOT NULL,
ACTUAL_PRICE INT,
DISCOUNT_PRICE INT,
MASTER_PLAN BOOLEAN
IS_INDIA BOOLEAN
ACTUAL
);
CREATE TABLE(
CURRENCY VARCHAR
INR DECIMAL
)
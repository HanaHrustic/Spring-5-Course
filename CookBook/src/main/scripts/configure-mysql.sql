# docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

#connect to mysql and run as root user
#Create Databases
CREATE DATABASE ag04_dev;
CREATE DATABASE ag04_prod;

#Create database service accounts
CREATE USER 'ag04_dev_user'@'localhost' IDENTIFIED BY 'hana';
CREATE USER 'ag04_prod_user'@'localhost' IDENTIFIED BY 'hana';
CREATE USER 'ag04_dev_user'@'%' IDENTIFIED BY 'hana';
CREATE USER 'ag04_prod_user'@'%' IDENTIFIED BY 'hana';

#Database grants
GRANT ALL PRIVILEGES ON ag04_dev.* TO 'ag04_dev_user'@'localhost';
FLUSH PRIVILEGES;
GRANT SELECT, INSERT, DELETE, UPDATE ON ag04_prod.* TO 'ag04_prod_user'@'localhost';
FLUSH PRIVILEGES;
GRANT SELECT, INSERT, DELETE, UPDATE ON ag04_dev.* TO 'ag04_dev_user'@'%';
FLUSH PRIVILEGES;
GRANT SELECT, INSERT, DELETE, UPDATE ON ag04_prod.* TO 'ag04_prod_user'@'%';
FLUSH PRIVILEGES;
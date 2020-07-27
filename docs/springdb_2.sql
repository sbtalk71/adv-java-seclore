DROP DATABASE IF EXISTS `springdb`;
CREATE DATABASE `springdb`;
USE `springdb`;
DROP TABLE IF EXISTS `authorities`;


DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `empno` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `address` varchar(20) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  PRIMARY KEY (`empno`)
);

LOCK TABLES `emp` WRITE;

INSERT INTO `emp` VALUES (100,'Amitabh','Mumbai',20000),(101,'Shekhar','Hyderabad',30000),(102,'Rekha','Mumbai',23000),(103,'Kalluram','Delhi',60000),(104,'Ajay','Bangalore',80000);
UNLOCK TABLES;



DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
);

LOCK TABLES `users` WRITE;

INSERT INTO `users` VALUES ('arun','welcome1',0),('pavan','welcome1',1),('shantanu','welcome1',1);
UNLOCK TABLES;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `ix_auth_username` (`username`,`authority`),
  CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
);
--

LOCK TABLES `authorities` WRITE;

INSERT INTO `authorities` VALUES ('arun','ROLE_USER'),('pavan','ROLE_ADMIN'),('shantanu','ROLE_USER');
UNLOCK TABLES;



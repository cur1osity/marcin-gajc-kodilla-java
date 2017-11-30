-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: localhost    Database: kodilla_course
-- ------------------------------------------------------
-- Server version	5.7.20-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ISSUESLISTS`
--

DROP TABLE IF EXISTS `ISSUESLISTS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ISSUESLISTS` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ISSUESLISTS`
--

LOCK TABLES `ISSUESLISTS` WRITE;
/*!40000 ALTER TABLE `ISSUESLISTS` DISABLE KEYS */;
INSERT INTO `ISSUESLISTS` VALUES (1,'ToDo'),(2,'In progress'),(3,'Done');
/*!40000 ALTER TABLE `ISSUESLISTS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ISSUESS`
--

DROP TABLE IF EXISTS `ISSUESS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ISSUESS` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `ISSUESLISTS_ID` bigint(20) unsigned NOT NULL,
  `SUMMARY` varchar(100) DEFAULT NULL,
  `DESCRIPTION` varchar(1024) DEFAULT NULL,
  `USER_ID_ASSIGNEDTO` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ISSUESLISTS_ID` (`ISSUESLISTS_ID`),
  KEY `USER_ID_ASSIGNEDTO` (`USER_ID_ASSIGNEDTO`),
  CONSTRAINT `ISSUESS_ibfk_1` FOREIGN KEY (`ISSUESLISTS_ID`) REFERENCES `ISSUESLISTS` (`ID`),
  CONSTRAINT `ISSUESS_ibfk_2` FOREIGN KEY (`USER_ID_ASSIGNEDTO`) REFERENCES `USERS` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ISSUESS`
--

LOCK TABLES `ISSUESS` WRITE;
/*!40000 ALTER TABLE `ISSUESS` DISABLE KEYS */;
INSERT INTO `ISSUESS` VALUES (1,1,'Zadanie 1','Opis zadania 1',1),(2,1,'Zadanie 2','Opis zadania 2',1),(3,1,'Zadanie 3','Opis zadania 3',1),(4,1,'Zadanie 4','Opis zadania 4',1),(5,1,'Zadanie 5','Opis zadania 5',1),(6,2,'Zadanie 6','Opis zadania 6',2),(7,2,'Zadanie 7','Opis zadania 7',2),(8,2,'Zadanie 8','Opis zadania 8',2),(9,2,'Zadanie 9','Opis zadania 9',2),(10,2,'Zadanie 10','Opis zadania 10',2),(11,3,'Zadanie 11','Opis zadania 11',3),(12,3,'Zadanie 12','Opis zadania 12',3),(13,3,'Zadanie 13','Opis zadania 13',3),(14,3,'Zadanie 14','Opis zadania 14',3),(15,3,'Zadanie 15','Opis zadania 15',3);
/*!40000 ALTER TABLE `ISSUESS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `POSTS`
--

DROP TABLE IF EXISTS `POSTS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `POSTS` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `USER_ID` bigint(20) unsigned NOT NULL,
  `BODY` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `USER_ID` (`USER_ID`),
  CONSTRAINT `POSTS_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `USERS` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `POSTS`
--

LOCK TABLES `POSTS` WRITE;
/*!40000 ALTER TABLE `POSTS` DISABLE KEYS */;
INSERT INTO `POSTS` VALUES (1,1,'This is my first post on this forum!'),(2,2,'This is my first post too!'),(3,2,'How are you?'),(5,4,'Yo all! Here is Thomas!'),(6,1,'Another post!');
/*!40000 ALTER TABLE `POSTS` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `USERS`
--

DROP TABLE IF EXISTS `USERS`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `USERS` (
  `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` varchar(100) DEFAULT NULL,
  `LASTNAME` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `USERS`
--

LOCK TABLES `USERS` WRITE;
/*!40000 ALTER TABLE `USERS` DISABLE KEYS */;
INSERT INTO `USERS` VALUES (1,'John','Smith'),(2,'Zachary','Lee'),(3,'Stephanie','Kovalsky'),(4,'Thomas','Landgren'),(5,'John','Thomson');
/*!40000 ALTER TABLE `USERS` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-30 12:23:06

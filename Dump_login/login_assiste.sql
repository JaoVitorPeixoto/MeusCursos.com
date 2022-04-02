-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: login
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assiste`
--

DROP TABLE IF EXISTS `assiste`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assiste` (
  `id_assiste` int NOT NULL AUTO_INCREMENT,
  `matriculaEst` int DEFAULT NULL,
  `id_cursoEst` int DEFAULT NULL,
  `data_assiste` date NOT NULL,
  PRIMARY KEY (`id_assiste`),
  KEY `matriculaEst` (`matriculaEst`),
  KEY `id_cursoEst` (`id_cursoEst`),
  CONSTRAINT `assiste_ibfk_1` FOREIGN KEY (`matriculaEst`) REFERENCES `usuario` (`matricula`),
  CONSTRAINT `assiste_ibfk_2` FOREIGN KEY (`id_cursoEst`) REFERENCES `cursos` (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assiste`
--

LOCK TABLES `assiste` WRITE;
/*!40000 ALTER TABLE `assiste` DISABLE KEYS */;
INSERT INTO `assiste` VALUES (1,2,3,'2022-03-21'),(2,1,3,'2022-03-21'),(3,1,1,'2022-03-27'),(4,4,1,'2022-03-28'),(5,4,2,'2022-03-28'),(6,1,4,'2022-03-28'),(7,2,4,'2022-03-28'),(8,2,2,'2022-03-28'),(9,6,2,'2022-03-28'),(10,6,1,'2022-03-28'),(11,6,3,'2022-03-28'),(12,13,3,'2022-03-29');
/*!40000 ALTER TABLE `assiste` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-01 21:59:14

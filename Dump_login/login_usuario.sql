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
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `matricula` int NOT NULL AUTO_INCREMENT,
  `usua` varchar(25) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `sexo` enum('M','F','Não informado') DEFAULT 'Não informado',
  `idade` int NOT NULL,
  `datacadastro` date NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`matricula`),
  UNIQUE KEY `usua` (`usua`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'jvrfp15','Jvrfp15#','João Vitor Ferreira Peixoto','M',18,'2022-03-28','joaottvitor04@gmail.com'),(2,'Denaum','123456','Denilson Dias','M',22,'2022-03-21','denilsonDias12@gmail.com'),(4,'Doctor_Altaz','20052012','Edric Guilherme Bahia','M',17,'2022-03-28','edric.guilherme@gmail.com'),(5,'Vitor','lindo15','Vitor Peixoto','M',18,'2022-03-24','joao--vitor04@gmil.com'),(6,'Tazc','515253','Tácio Napomuceno','F',20,'2022-03-28','tacionapomuceno@gmail.com'),(11,'bola15','123456','Bob da Silva','M',28,'2022-03-28','bola1517@gmail.com'),(12,'mariaDaSilva1','654321','Maria da Silva','Não informado',17,'2022-03-28','mariadasilva15@gmail.com'),(13,'Marycate','369715','Marinalva do Santos','F',48,'2022-03-29','marynalva1973@gmail.com');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
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

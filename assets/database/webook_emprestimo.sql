-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: webook
-- ------------------------------------------------------
-- Server version	8.4.0

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
-- Table structure for table `emprestimo`
--

DROP TABLE IF EXISTS `emprestimo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emprestimo` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `data_devolucao` date DEFAULT NULL,
  `data_emprestimo` date NOT NULL,
  `motivo_taxa` varchar(255) DEFAULT NULL,
  `quantidade_livros` int NOT NULL,
  `taxa_extra` decimal(38,2) DEFAULT NULL,
  `valor_emprestimo` decimal(38,2) DEFAULT NULL,
  `valor_multa` decimal(38,2) DEFAULT NULL,
  `usuario_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKn0k2927f8w348cfiahkff1rhk` (`usuario_id`),
  CONSTRAINT `FKn0k2927f8w348cfiahkff1rhk` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emprestimo`
--

LOCK TABLES `emprestimo` WRITE;
/*!40000 ALTER TABLE `emprestimo` DISABLE KEYS */;
INSERT INTO `emprestimo` VALUES (1,'2024-06-11','2024-06-11',NULL,1,NULL,99.99,0.00,1),(2,'2024-06-11','2024-05-11',NULL,1,NULL,345.59,240.00,2),(3,'2024-06-11','2024-06-11',NULL,1,NULL,99.99,0.00,1),(4,'2024-06-11','2024-06-11','Fogo',1,100.00,205.59,0.00,1),(5,'2024-06-11','2024-06-11',NULL,1,NULL,99.99,0.00,1),(6,'2024-06-11','2024-06-11',NULL,1,NULL,99.99,0.00,1),(7,'2024-06-11','2024-06-11',NULL,1,NULL,99.99,0.00,2),(8,'2024-06-11','2024-06-11','txaxa',1,100.00,199.99,0.00,1),(9,'2024-06-11','2024-06-11','dasdas',1,312321.00,312420.99,0.00,2),(10,'2024-06-11','2024-06-11',NULL,1,NULL,232.00,0.00,1),(11,'2024-06-18','2024-05-18',NULL,1,NULL,472.00,240.00,1),(12,'2024-06-18','2024-06-11',NULL,1,NULL,232.00,0.00,1),(13,'2024-06-18','2024-06-04',NULL,1,NULL,302.00,70.00,1),(14,'2024-06-18','2024-06-18',NULL,1,NULL,99.99,0.00,1),(15,'2024-06-18','2024-06-18','Fogo',1,200.00,432.00,0.00,2),(16,'2024-06-18','2024-06-18','dsaoaskoda',1,1.00,100.99,0.00,2);
/*!40000 ALTER TABLE `emprestimo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-24 23:35:05

-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         11.5.2-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.6.0.6765
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para x-genia
DROP DATABASE IF EXISTS `x-genia`;
CREATE DATABASE IF NOT EXISTS `x-genia` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `x-genia`;

-- Volcando estructura para tabla x-genia.clientes
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `nombre` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `apellido` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `usuario` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `contraseña` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  PRIMARY KEY (`usuario`) USING BTREE,
  UNIQUE KEY `Usuario` (`usuario`) USING BTREE,
  UNIQUE KEY `Contraseña` (`contraseña`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla x-genia.clientes: ~0 rows (aproximadamente)
DELETE FROM `clientes`;

-- Volcando estructura para tabla x-genia.mednorefrigerados
DROP TABLE IF EXISTS `mednorefrigerados`;
CREATE TABLE IF NOT EXISTS `mednorefrigerados` (
  `Nombre` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Codigo` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Lote` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Vencimiento` date NOT NULL,
  `Vigencia` char(50) NOT NULL DEFAULT '0',
  `Costo` double NOT NULL DEFAULT 0,
  `PrecioVenta` double NOT NULL DEFAULT 0,
  `Existentes` int(11) NOT NULL DEFAULT 0,
  `Vendidos` int(11) NOT NULL DEFAULT 0,
  `NoAlmacenar1` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `NoAlmacenar2` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `NoAlmacenar3` varchar(50) NOT NULL DEFAULT 'Dato Perdido'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla x-genia.mednorefrigerados: ~0 rows (aproximadamente)
DELETE FROM `mednorefrigerados`;

-- Volcando estructura para tabla x-genia.medrefrigerados
DROP TABLE IF EXISTS `medrefrigerados`;
CREATE TABLE IF NOT EXISTS `medrefrigerados` (
  `Nombre` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Codigo` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Lote` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Vencimiento` date NOT NULL,
  `Vigencia` char(50) NOT NULL DEFAULT '0',
  `Costo` double NOT NULL DEFAULT 0,
  `PrecioVenta` double NOT NULL DEFAULT 0,
  `Existentes` int(11) NOT NULL DEFAULT 0,
  `Vendidos` int(11) NOT NULL DEFAULT 0,
  `TemMax` double NOT NULL DEFAULT 14,
  `TemMin` double NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla x-genia.medrefrigerados: ~0 rows (aproximadamente)
DELETE FROM `medrefrigerados`;

-- Volcando estructura para tabla x-genia.trabajadores
DROP TABLE IF EXISTS `trabajadores`;
CREATE TABLE IF NOT EXISTS `trabajadores` (
  `Nombre` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Apellido` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Usuario` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  `Contraseña` varchar(50) NOT NULL DEFAULT 'Dato Perdido',
  PRIMARY KEY (`Usuario`),
  UNIQUE KEY `Usuario` (`Usuario`),
  UNIQUE KEY `Contraseña` (`Contraseña`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla x-genia.trabajadores: ~2 rows (aproximadamente)
DELETE FROM `trabajadores`;
INSERT INTO `trabajadores` (`Nombre`, `Apellido`, `Usuario`, `Contraseña`) VALUES
	('Manuel', 'Antias', 'Massamanu', 'massa'),
	('Sofia', 'Moreno', 'sgmoreno23', 'sofiguada');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;

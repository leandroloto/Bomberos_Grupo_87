-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 18:46:25
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos_grupo_87`
--
CREATE DATABASE IF NOT EXISTS `bomberos_grupo_87` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bomberos_grupo_87`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `codBombero` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre_ape` varchar(50) NOT NULL,
  `fecha_nac` date NOT NULL,
  `grupo_sang` varchar(3) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `codBrigada` int(11) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`codBombero`, `dni`, `nombre_ape`, `fecha_nac`, `grupo_sang`, `celular`, `codBrigada`, `estado`) VALUES
(1, 9874687, 'Lourdes Maria Juarez', '1999-12-15', 'O-', '038445878', 1, 1),
(2, 32526728, 'Mariano Areas', '1985-10-30', 'AB+', '115722999', 3, 1),
(3, 29125001, 'Gisela Sosa', '2000-09-16', 'A+', '2616664894', 1, 1),
(4, 77548211, 'Simon Orellano Jara', '2024-02-14', 'o+', '2615877521', 1, 1),
(5, 47610454, 'Guillermina Sosa', '2006-10-07', 'O-', '2613754331', 4, 1),
(6, 37459127, 'Ricardo Rojas', '2001-07-25', 'AB+', '117653459', 4, 1),
(7, 27388911, 'Alberto Zarate', '1973-02-20', 'A-', '115722378', 4, 1),
(8, 93711264, 'Olivia Thomson', '1991-05-25', 'B+', '115623482', 4, 1),
(9, 33843555, 'Agustin Ricarte', '1998-09-03', 'A+', '113982733', 4, 1),
(10, 45711511, 'Roberto Magallanes', '1996-12-06', 'AB-', '114822411', 2, 1),
(11, 37199722, 'Walter Rizo', '1988-11-17', 'O+', '114226381', 3, 1),
(12, 34411928, 'Augusto Zapata', '1988-08-08', 'A-', '112943543', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `codCuartel` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombre_br`, `especialidad`, `libre`, `codCuartel`, `estado`) VALUES
(1, 'Brigada A', 'Incendios', 1, 3, 1),
(2, 'Brigada B', 'RescateAccTrafico', 1, 2, 1),
(3, 'Brigada C', 'SalvamentoDerrumbe', 1, 1, 1),
(4, 'Brigada Bravo', 'Incendios', 1, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codCuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`, `estado`) VALUES
(1, 'Cuartel A', '123 Calle Principal', 37, -122, '123-456-7890', 'cuartela@example.com', 1),
(2, 'Cuartel B', '456 Calle Secundaria', 40, -74, '987-654-3210', 'cuartelb@example.com', 1),
(3, 'Cuartel C', '789 Calle Terciaria', 51, -1, '555-123-4567', 'cuartelc@example.com', 1),
(4, 'Cuartel BS.AS.', '9 de Julio 233', 321, -22, '011-42775851', 'bomberosargentina@bomberosar.c', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codSiniestro` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fecha_siniestro` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalles` text NOT NULL,
  `fecha_resol` timestamp NULL DEFAULT NULL,
  `puntuacion` int(11) NOT NULL,
  `codBrigada` int(11) DEFAULT NULL,
  `estado` tinyint(1) NOT NULL,
  `enCurso` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`codBombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codBrigada`),
  ADD UNIQUE KEY `nombre_br` (`nombre_br`),
  ADD KEY `codCuartel` (`codCuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codSiniestro`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `codBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codSiniestro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`codCuartel`) REFERENCES `cuartel` (`codCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

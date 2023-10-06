-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:43:37
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
(1, 32165487, 'Ricardo Lopez', '1990-11-05', 'B+', '01524587', 1, 1),
(2, 12354687, 'Ana Maria Juarez', '1999-12-15', 'O-', '038445878', 1, 1),
(4, 9874687, 'Lourdes Maria Juarez', '1999-12-15', 'O-', '038445878', 1, 0),
(8, 123123, 'ejemplo ejemplo', '1999-01-22', 'A+', '123123', 1, 1);

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
(1, 'Cuartel A', '123 Calle Principal', 37, -122, '123-456-7890', 'cuartela@example.com', 0),
(2, 'Cuartel B', '456 Calle Secundaria', 40, -74, '987-654-3210', 'cuartelb@example.com', 0),
(3, 'Cuartel C', '789 Calle Terciaria', 51, -1, '555-123-4567', 'cuartelc@example.com', 0),
(4, 'Cuartel BSAS', '9 de Julio 233', 321, -22, '011-42775851', 'bomberosargentina@bomberosar.c', 0);

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
  `codBrigada` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `enCurso` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codSiniestro`, `tipo`, `fecha_siniestro`, `coord_X`, `coord_Y`, `detalles`, `fecha_resol`, `puntuacion`, `codBrigada`, `estado`, `enCurso`) VALUES
(1, 'Incendio', '2023-10-05 20:48:11', 23, 22, 'Se inicio un incendio', NULL, 0, 1, 1, 1),
(2, 'Incendios', '2023-10-05 19:17:10', -10, 2540, 'Incendio en una casa, Cordoba 233', NULL, 0, 1, 1, 1);

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
  MODIFY `codBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

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

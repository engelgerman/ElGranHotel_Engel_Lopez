-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-02-2020 a las 16:01:33
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `elgranhotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camas`
--

CREATE TABLE `camas` (
  `IDCAMAS` int(11) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `CAMA` varchar(30) NOT NULL,
  `CODIGOHABITACION` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `camas`
--

INSERT INTO `camas` (`IDCAMAS`, `CANTIDAD`, `CAMA`, `CODIGOHABITACION`) VALUES
(3, 1, 'King Size', 6),
(5, 1, 'Queen', 9),
(6, 1, 'Queen', 10),
(17, 1, 'Queen', 14),
(32, 1, 'Simple', 17),
(33, 1, 'Doble', 17),
(34, 1, 'King Size', 17),
(37, 1, 'King Size', 18);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `NUMEROHABITACION` int(11) NOT NULL,
  `PISO` int(11) NOT NULL,
  `ESTADOHABITACION` int(11) NOT NULL,
  `CODIGOHABITACION` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`NUMEROHABITACION`, `PISO`, `ESTADOHABITACION`, `CODIGOHABITACION`) VALUES
(1, 1, 0, 17),
(2, 1, 0, 14),
(3, 1, 0, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `IDHUESPED` int(11) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `DNI` int(11) NOT NULL,
  `DOMICILIO` varchar(80) NOT NULL,
  `CORREO` varchar(30) NOT NULL,
  `CELULAR` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`IDHUESPED`, `NOMBRE`, `DNI`, `DOMICILIO`, `CORREO`, `CELULAR`) VALUES
(1, 'engel german', 33800812, 'sdasd', 'sdsad', 'sdasdasd'),
(2, 'engel german', 33800812, 'sdasd', 'sdsad', 'sdasdasd'),
(3, 'engel german', 12345678, 'sdasd', 'sdsad', 'sdasdasd'),
(4, 'mariano ', 87654321, 'sdasd', 'sdsad', 'sdasdasd'),
(6, 'clara', 16546461, 'fsffs', 'sff', 'sdfsf'),
(7, 'carlos', 8555561, 'jhskjhsjkh', 'jkshkjs', '8798789789'),
(10, 'Juanito Saez', 28130893, 'Las Catitas 1255', 'jj@gmail.com', '1234567'),
(11, 'Cristina F', 12345678, 'ulp', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `NUMERORESERVA` int(11) NOT NULL,
  `CANTIDADPERSONAS` int(11) NOT NULL,
  `FECHAENTRADA` date NOT NULL,
  `FECHASALIDA` date NOT NULL,
  `CANTIDADDIAS` int(11) NOT NULL,
  `ESTADORESERVA` int(11) NOT NULL,
  `IDHUESPED` int(11) NOT NULL,
  `NUMEROHABITACION` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`NUMERORESERVA`, `CANTIDADPERSONAS`, `FECHAENTRADA`, `FECHASALIDA`, `CANTIDADDIAS`, `ESTADORESERVA`, `IDHUESPED`, `NUMEROHABITACION`) VALUES
(1, 2, '2020-02-01', '2020-02-03', 2, 0, 4, 3),
(13, 2, '2020-02-29', '2020-03-05', 5, 0, 10, 3),
(14, 2, '2020-03-10', '2020-03-15', 5, 0, 10, 3),
(15, 2, '2020-02-29', '2020-03-05', 5, 0, 11, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohabitacion`
--

CREATE TABLE `tipohabitacion` (
  `CODIGOHABITACION` int(11) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `CANTIDADPERSONAS` int(11) NOT NULL,
  `PRECIO` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipohabitacion`
--

INSERT INTO `tipohabitacion` (`CODIGOHABITACION`, `NOMBRE`, `CANTIDADPERSONAS`, `PRECIO`) VALUES
(6, 'Suite', 2, 1800),
(9, 'Matrimonial', 2, 1500),
(10, 'Familiar', 4, 1800),
(14, 'Familiar Big', 5, 2000),
(17, 'big', 5, 2000),
(18, 'big king', 3, 2000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IDUSUARIOS` int(11) NOT NULL,
  `APELLIDO` varchar(30) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `MAIL` varchar(80) NOT NULL,
  `IDHUESPED` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IDUSUARIOS`, `APELLIDO`, `NOMBRE`, `MAIL`, `IDHUESPED`) VALUES
(1, 'engel', 'german', 'ge@gmail.com', 1),
(2, 'saez', 'juanjo', 'jj@gmail.com', 11),
(3, 'sa0', 'juao', 'jj@gml.com', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `camas`
--
ALTER TABLE `camas`
  ADD PRIMARY KEY (`IDCAMAS`) USING BTREE,
  ADD KEY `CODIGOHABITACION` (`CODIGOHABITACION`) USING BTREE;

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`NUMEROHABITACION`),
  ADD UNIQUE KEY `CODIGOHABITACION` (`CODIGOHABITACION`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`IDHUESPED`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`NUMERORESERVA`),
  ADD KEY `NUMEROHABITACION_2` (`NUMEROHABITACION`),
  ADD KEY `IDHUESPED_2` (`IDHUESPED`),
  ADD KEY `IDHUESPED` (`IDHUESPED`) USING BTREE,
  ADD KEY `NUMEROHABITACION` (`NUMEROHABITACION`) USING BTREE;

--
-- Indices de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD PRIMARY KEY (`CODIGOHABITACION`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IDUSUARIOS`),
  ADD KEY `HUESPED` (`IDHUESPED`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `camas`
--
ALTER TABLE `camas`
  MODIFY `IDCAMAS` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `IDHUESPED` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `NUMERORESERVA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  MODIFY `CODIGOHABITACION` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IDUSUARIOS` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `camas`
--
ALTER TABLE `camas`
  ADD CONSTRAINT `camas_ibfk_1` FOREIGN KEY (`CODIGOHABITACION`) REFERENCES `tipohabitacion` (`CODIGOHABITACION`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`CODIGOHABITACION`) REFERENCES `tipohabitacion` (`CODIGOHABITACION`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`IDHUESPED`) REFERENCES `huesped` (`IDHUESPED`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`NUMEROHABITACION`) REFERENCES `habitacion` (`NUMEROHABITACION`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`IDHUESPED`) REFERENCES `huesped` (`IDHUESPED`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

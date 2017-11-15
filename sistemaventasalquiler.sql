-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-11-2016 a las 22:05:49
-- Versión del servidor: 5.7.14
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemaventasalquiler`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `idAdministrador` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`idAdministrador`, `username`, `password`) VALUES
(1, 'majerhua', 'fisi');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alquiler`
--

CREATE TABLE `alquiler` (
  `idAlquiler` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idVendedor` int(11) NOT NULL,
  `fecha` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `alquiler`
--

INSERT INTO `alquiler` (`idAlquiler`, `idCliente`, `idVendedor`, `fecha`) VALUES
(1, 2, 1, '22/27/2016'),
(2, 2, 1, '04/30/2016'),
(3, 1, 1, '04/35/2016'),
(4, 1, 1, '04/43/2016'),
(5, 2, 1, '04/53/2016'),
(6, 2, 1, '03/00/2016'),
(7, 1, 1, '05/03/2016');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `nombre`, `descripcion`) VALUES
(2, 'terror', 'Todo lo concerniente a peliculas de terror'),
(3, 'Anime', 'Dibujos Animados Orientales'),
(4, 'Novela', 'Para hacerte llorar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `dni`, `telefono`, `correo`, `direccion`) VALUES
(1, 'carlos ', '75723309', '3271777', 'javiermajerhua@hotmail.com', 'Mz v lt 5 "El agustino" Lima'),
(2, 'javier', '43434343', '3232322', 'majehrua123', 'asdad');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallealquiler`
--

CREATE TABLE `detallealquiler` (
  `idDetalleAlquiler` int(11) NOT NULL,
  `idAlquiler` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL,
  `precioAlquiler` double NOT NULL,
  `fechaEntrega` varchar(50) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detallealquiler`
--

INSERT INTO `detallealquiler` (`idDetalleAlquiler`, `idAlquiler`, `idPelicula`, `precioAlquiler`, `fechaEntrega`, `cantidad`) VALUES
(1, 6, 1, 3.4, '04/00/2016', 11),
(2, 7, 1, 2.3, '05/03/2016', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `idDetalleVenta` int(11) NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idPelicula` int(11) NOT NULL,
  `precioVenta` double NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalleventa`
--

INSERT INTO `detalleventa` (`idDetalleVenta`, `idVenta`, `idPelicula`, `precioVenta`, `cantidad`) VALUES
(1, 14, 1, 3.4, 1),
(2, 14, 1, 3.5, 23),
(3, 18, 1, 20, 1),
(4, 19, 1, 23, 2),
(5, 19, 1, 23, 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `idPelicula` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `precioCompra` double NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `duracion` varchar(50) NOT NULL,
  `idioma` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`idPelicula`, `idCategoria`, `precioCompra`, `titulo`, `duracion`, `idioma`) VALUES
(1, 3, 2.5, 'Shigatsu Wa kami no usu', '3 horas', 'Ingles, Español');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `descripcion` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `username`, `password`, `descripcion`) VALUES
(1, 'javier', '123', 'jefe general');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `idVendedor` int(11) NOT NULL,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` varchar(50) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `direccion` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`idVendedor`, `codigo`, `nombre`, `dni`, `telefono`, `direccion`) VALUES
(1, 'C001', 'Junior Oncoy Corsino', '76463638', '67678789', 'Jr Ancash "Lima"');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idVendedor` int(11) NOT NULL,
  `fecha` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `idCliente`, `idVendedor`, `fecha`) VALUES
(1, 1, 1, '2012-09-15'),
(2, 1, 1, '12/12/2015'),
(4, 1, 1, '23/44/2016'),
(20, 2, 1, '04/31/2016'),
(21, 2, 1, '04/35/2016'),
(24, 2, 1, '04/44/2016'),
(8, 1, 1, '04/33/2016'),
(9, 1, 1, '04/35/2016'),
(25, 1, 1, '04/24/2016'),
(22, 1, 1, '04/39/2016'),
(12, 2, 1, '04/45/2016'),
(13, 2, 1, '04/47/2016'),
(14, 2, 1, '04/49/2016'),
(23, 2, 1, '04/40/2016'),
(26, 2, 1, '21/23/2016'),
(27, 2, 1, '10/40/2016');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`idAdministrador`);

--
-- Indices de la tabla `alquiler`
--
ALTER TABLE `alquiler`
  ADD PRIMARY KEY (`idAlquiler`),
  ADD KEY `idCliente` (`idCliente`),
  ADD KEY `idVendedor` (`idVendedor`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `detallealquiler`
--
ALTER TABLE `detallealquiler`
  ADD PRIMARY KEY (`idDetalleAlquiler`),
  ADD KEY `idAlquiler` (`idAlquiler`),
  ADD KEY `idPelicula` (`idPelicula`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`idDetalleVenta`),
  ADD KEY `idVenta` (`idVenta`),
  ADD KEY `idPelicula` (`idPelicula`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`idPelicula`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`idVendedor`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `idCliente` (`idCliente`),
  ADD KEY `idVendedor` (`idVendedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `idAdministrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `alquiler`
--
ALTER TABLE `alquiler`
  MODIFY `idAlquiler` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `detallealquiler`
--
ALTER TABLE `detallealquiler`
  MODIFY `idDetalleAlquiler` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  MODIFY `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  MODIFY `idPelicula` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `idVendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

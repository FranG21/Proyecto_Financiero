-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2019 a las 00:28:41
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectofinanciero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `activo`
--

CREATE TABLE `activo` (
  `idAc` int(11) NOT NULL,
  `codAct` varchar(150) NOT NULL,
  `descrip` varchar(150) NOT NULL,
  `idCat` varchar(60) NOT NULL,
  `idSub` varchar(60) NOT NULL,
  `estadoBoton` int(11) NOT NULL,
  `estado` int(11) NOT NULL,
  `idUb` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `activo`
--

INSERT INTO `activo` (`idAc`, `codAct`, `descrip`, `idCat`, `idSub`, `estadoBoton`, `estado`, `idUb`) VALUES
(1, '12056-0035-V0120023-001', 'Toyota Corola 2016', '3', '1', 1, 1, 2),
(2, '12056-0014-H00230036-002', 'Terreno en la costa', '1', '3', 1, 1, 4),
(3, '12056-0025-V0120041-003', 'Tractor', '3', '2', 1, 1, 1),
(4, '12056-0044-A0044B0055-004', 'Computadora Azus', '4', '4', 1, 2, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCat` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `cod` varchar(150) NOT NULL,
  `val` int(100) NOT NULL,
  `vidautil` int(5) NOT NULL,
  `vidaeco` int(5) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCat`, `nombre`, `cod`, `val`, `vidautil`, `vidaeco`, `estado`) VALUES
(1, 'TERRENO', 'H0023', 20, 0, 0, 1),
(2, 'Maquinaria y equipo', 'M003', 10, 5, 8, 1),
(3, 'Transporte', 'V012', 10, 5, 9, 1),
(4, 'Mobiliario y oficina', 'A0021', 10, 2, 5, 1),
(5, 'saf', 'ert', 3, 3, 3, 0),
(6, 'dsf', 'dsf', 3, 4, 3, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clasificaactivo`
--

CREATE TABLE `clasificaactivo` (
  `idClas` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `vida` int(25) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `clasificaactivo`
--

INSERT INTO `clasificaactivo` (`idClas`, `nombre`, `vida`, `estado`) VALUES
(1, 'Terreno', 0, 1),
(2, 'Edificios', 20, 1),
(3, 'Mobiliario', 10, 1),
(4, 'Vehiculos', 5, 1),
(5, 'Maquinaria y herramientas', 10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `apellido` varchar(150) NOT NULL,
  `dui` varchar(150) NOT NULL,
  `nit` varchar(150) NOT NULL,
  `repre` varchar(100) NOT NULL,
  `tel` varchar(150) NOT NULL,
  `ocupacion` varchar(150) NOT NULL,
  `depa` varchar(150) NOT NULL,
  `fecha` date NOT NULL,
  `direc` varchar(200) NOT NULL,
  `estado` int(11) NOT NULL,
  `tipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `apellido`, `dui`, `nit`, `repre`, `tel`, `ocupacion`, `depa`, `fecha`, `direc`, `estado`, `tipo`) VALUES
(1, 'Jose Alberto', 'Morales Arias', '32323235-1', '1125-335644-354-11', '', '235-4512', 'Secretario', 'CuscatlÃ¡n', '2018-01-22', 'Colonia las margaritas pasaje las azucenas #123 cojutepeque,cuscatlan', 1, 2),
(2, 'Juan Carlos', 'Beltran Urias', '3226555-0', '5489-655899-321-1', '', '2315-4578', 'Gerente general', 'La Libertad', '2018-01-22', 'Colonia el chapulin avenida el trovador pasaje6 #123 ', 1, 1),
(3, 'Oscar', 'Peraza', '02060298-1', '0012-19242-652-2', '', '7822-3473', 'Docente', 'San Salvador', '2019-01-21', 'soyapango col. la esperanza', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `idCom` int(11) NOT NULL,
  `idProv` int(10) NOT NULL,
  `fecha` date NOT NULL,
  `condicion` varchar(100) NOT NULL,
  `precioUni` varchar(100) NOT NULL,
  `codAct` int(50) NOT NULL,
  `donado` varchar(100) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`idCom`, `idProv`, `fecha`, `condicion`, `precioUni`, `codAct`, `donado`, `estado`) VALUES
(1, 1, '2018-01-15', 'Nuevo', '5000', 1, 'NO', 1),
(2, 2, '2018-01-22', 'Nuevo', '7500', 2, 'NO', 1),
(3, 1, '2019-01-21', 'Nuevo', '2000', 3, 'NO', 1),
(4, 3, '2019-01-21', 'Nuevo', '500', 4, 'NO', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `creditos`
--

CREATE TABLE `creditos` (
  `idCre` int(10) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `plazom` int(10) NOT NULL,
  `cmax` int(10) NOT NULL,
  `cmin` int(10) NOT NULL,
  `garantia` varchar(50) NOT NULL,
  `interes` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `creditos`
--

INSERT INTO `creditos` (`idCre`, `tipo`, `plazom`, `cmax`, `cmin`, `garantia`, `interes`) VALUES
(1, 'Personal', 72, 10000, 100, 'Aval', 12),
(2, 'Agropecuario', 28, 1500, 200, 'Aval', 10),
(3, 'Hipotecario', 240, 20000, 1000, 'Hipotecaria', 12),
(4, 'Estudiantil', 12, 500, 100, 'Aval', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `idDep` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `codigo` varchar(150) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_activo`
--

CREATE TABLE `detalle_activo` (
  `id` int(20) NOT NULL,
  `serie` varchar(20) NOT NULL,
  `fecha_adqui` date NOT NULL,
  `fecha_inicio` date NOT NULL,
  `valor_historico` double NOT NULL,
  `donado` varchar(6) NOT NULL,
  `vidautil_restante` int(10) NOT NULL,
  `marca_id` int(10) NOT NULL,
  `ubi_id` int(10) NOT NULL,
  `activofijo_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_activo`
--

INSERT INTO `detalle_activo` (`id`, `serie`, `fecha_adqui`, `fecha_inicio`, `valor_historico`, `donado`, `vidautil_restante`, `marca_id`, `ubi_id`, `activofijo_id`) VALUES
(1, 'P128-45', '2018-01-15', '2018-01-22', 5000, 'NO', 5, 1, 2, 1),
(2, 'h2200', '2018-01-22', '2018-01-22', 7500, 'NO', 0, 4, 4, 2),
(3, 'p-25666', '2019-01-21', '2019-01-21', 3000, 'NO', 5, 1, 1, 3),
(4, '000-2', '2019-01-21', '2019-01-21', 600, 'NO', 2, 5, 5, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `institucion`
--

CREATE TABLE `institucion` (
  `idIn` int(11) NOT NULL,
  `codigo` varchar(150) NOT NULL,
  `Nombre` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `institucion`
--

INSERT INTO `institucion` (`idIn`, `codigo`, `Nombre`) VALUES
(1, '12056', 'Institucion Financiera del Pueblo IFP');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `idMarca` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`idMarca`, `nombre`, `estado`) VALUES
(1, 'Toyota2', 1),
(2, 'Honda', 1),
(3, 'Hp', 1),
(4, 'Ninguna', 1),
(5, 'Azuz', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `idMov` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `movimiento`
--

INSERT INTO `movimiento` (`idMov`, `nombre`, `estado`) VALUES
(1, 'Venta de activos', 1),
(2, 'Donacion de activos', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

CREATE TABLE `pagos` (
  `idPag` int(11) NOT NULL,
  `saldo` double NOT NULL,
  `tipo` varchar(100) NOT NULL,
  `numero` int(11) NOT NULL,
  `fechapago` date NOT NULL,
  `atraso` int(10) NOT NULL,
  `mora` double NOT NULL,
  `total` double NOT NULL,
  `idPres` int(10) NOT NULL,
  `cuota` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `idPres` int(10) NOT NULL,
  `monto` double NOT NULL,
  `plazo` int(10) NOT NULL,
  `fechafinan` date NOT NULL,
  `cuota` double NOT NULL,
  `saldo` double NOT NULL,
  `estado` varchar(50) NOT NULL,
  `idCli` int(10) NOT NULL,
  `idCre` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`idPres`, `monto`, `plazo`, `fechafinan`, `cuota`, `saldo`, `estado`, `idCli`, `idCre`) VALUES
(1, 1000, 18, '2018-01-22', 60.98, 1097.64, 'Pendiente', 1, 1),
(2, 300, 12, '2019-01-21', 26.37, 316.44, 'Pendiente', 2, 2),
(3, 5000, 60, '2018-12-18', 111.22, 6673.2, 'Pendiente', 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `ide` int(4) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `nit` varchar(60) NOT NULL,
  `contacto` varchar(100) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `observacion` varchar(150) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`ide`, `nombre`, `direccion`, `nit`, `contacto`, `telefono`, `correo`, `observacion`, `estado`) VALUES
(1, 'Grupo Q2', 'colonia el Centro 3ra calle poniente', '12566655-1', 'Jose Salazar Arias', '2354-4515', 'Jose@hotmail.com', 'es un bue n proveedor', 1),
(2, 'Lotificacion Milenium', 'colonia el progreso pasaje las primaveras avenida El gitano', '11333356-2', 'Maria Celeste Beltran', '2503-5614', 'Maria@gmail.com', 'tiene buenos lotes', 1),
(3, 'omnisport', 'colonia el pericon', '0702-230592-102-4', 'william Barrera castellano', '7521-9265', 'william@gmail.com', 'no tiene', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reevaluar`
--

CREATE TABLE `reevaluar` (
  `idReeval` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `valorAnt` varchar(50) NOT NULL,
  `idAc` int(11) NOT NULL,
  `valor` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `reevaluar`
--

INSERT INTO `reevaluar` (`idReeval`, `fecha`, `valorAnt`, `idAc`, `valor`) VALUES
(1, '2019-01-21', '2000', 3, '3000'),
(2, '2019-01-21', '500', 4, '600');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategoria`
--

CREATE TABLE `subcategoria` (
  `idSub` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `idcat` int(50) NOT NULL,
  `codigo` varchar(100) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `subcategoria`
--

INSERT INTO `subcategoria` (`idSub`, `nombre`, `idcat`, `codigo`, `estado`) VALUES
(1, 'Liviano', 3, 'V0120023', 1),
(2, 'Pesado', 3, 'V0120041', 1),
(3, 'terreno valdio', 1, 'H00230036', 1),
(4, 'Mobiliario informatico', 4, 'A0044B0055', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ubicacion`
--

CREATE TABLE `ubicacion` (
  `idUb` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `estado` int(11) NOT NULL,
  `codU` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ubicacion`
--

INSERT INTO `ubicacion` (`idUb`, `nombre`, `estado`, `codU`) VALUES
(1, 'Departamento de Informatica', 1, '0025'),
(2, 'Departamento de RH', 1, '0035'),
(3, 'Departamento de Finanzas', 1, '0045'),
(4, 'Costa del sol,Departamento de la Paz ', 0, '0014'),
(5, 'Seguridad', 1, '0044');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idusu` int(11) NOT NULL,
  `user` varchar(60) NOT NULL,
  `pass` varchar(60) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `nivel` varchar(80) NOT NULL,
  `dui` varchar(90) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idusu`, `user`, `pass`, `nombre`, `direccion`, `telefono`, `nivel`, `dui`, `estado`) VALUES
(1, 'erick', 'erick', 'Erick vladimir vasquez', 'Colonia jardines de las pavas pasaje 6 #168\r\nCojutepeque -Cuscatlan', '2252-3636', 'Administrador', '1225583-6', 1),
(2, 'josej', 'josej', 'pedro julio Alvarado', 'Colonia el palomo # 8 ', '2322-2562', 'Usuario', '1235256-1', 0),
(3, 'marijose', 'marijose', 'Maria Josefina Lopez', 'colonia la amapolas #258', '2626-1414', 'Usuario', '2565653-2', 0),
(4, 'Rogelia1', 'Rogelia1', 'Rogelia Jazmina  Cruz', 'colonia los pilares del lado #23', '2352-6666', 'Usuario', '53151515-1', 1),
(5, 'erick1', 'erick1', 'Erick vladimir vasquez1', 'Colonia jardines de las pavas pasaje 6 #168\r\nCojutepeque -Cuscatlan', '2252-36361', 'Usuario', '1225583-61', 0),
(6, 'krauli', 'krauly', 'Rina de la Paz', 'muy lejano', '2325-3635', 'Empleado', '2554588-1', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `idActi` int(11) NOT NULL,
  `idMovi` int(11) NOT NULL,
  `factNum` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `precVenta` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `idActi`, `idMovi`, `factNum`, `fecha`, `precVenta`) VALUES
(1, 4, 1, '00004', '2019-01-21', '500');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `activo`
--
ALTER TABLE `activo`
  ADD PRIMARY KEY (`idAc`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCat`);

--
-- Indices de la tabla `clasificaactivo`
--
ALTER TABLE `clasificaactivo`
  ADD PRIMARY KEY (`idClas`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`idCom`);

--
-- Indices de la tabla `creditos`
--
ALTER TABLE `creditos`
  ADD PRIMARY KEY (`idCre`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`idDep`);

--
-- Indices de la tabla `detalle_activo`
--
ALTER TABLE `detalle_activo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `institucion`
--
ALTER TABLE `institucion`
  ADD PRIMARY KEY (`idIn`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`idMarca`);

--
-- Indices de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`idMov`);

--
-- Indices de la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD PRIMARY KEY (`idPag`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`idPres`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`ide`);

--
-- Indices de la tabla `reevaluar`
--
ALTER TABLE `reevaluar`
  ADD PRIMARY KEY (`idReeval`);

--
-- Indices de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  ADD PRIMARY KEY (`idSub`);

--
-- Indices de la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  ADD PRIMARY KEY (`idUb`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idusu`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `activo`
--
ALTER TABLE `activo`
  MODIFY `idAc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `clasificaactivo`
--
ALTER TABLE `clasificaactivo`
  MODIFY `idClas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `idCom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `creditos`
--
ALTER TABLE `creditos`
  MODIFY `idCre` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `idDep` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalle_activo`
--
ALTER TABLE `detalle_activo`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `institucion`
--
ALTER TABLE `institucion`
  MODIFY `idIn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  MODIFY `idMov` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pagos`
--
ALTER TABLE `pagos`
  MODIFY `idPag` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `idPres` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `ide` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `reevaluar`
--
ALTER TABLE `reevaluar`
  MODIFY `idReeval` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  MODIFY `idSub` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  MODIFY `idUb` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idusu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

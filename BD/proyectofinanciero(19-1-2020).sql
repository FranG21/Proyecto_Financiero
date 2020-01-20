-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-01-2020 a las 04:34:35
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
  `idDep` int(60) DEFAULT NULL,
  `idSub` int(60) DEFAULT NULL,
  `estadoBoton` int(11) DEFAULT NULL,
  `estado` int(11) NOT NULL,
  `idMarca` int(10) DEFAULT NULL,
  `descripcionEstado` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `activo`
--

INSERT INTO `activo` (`idAc`, `codAct`, `descrip`, `idDep`, `idSub`, `estadoBoton`, `estado`, `idMarca`, `descripcionEstado`) VALUES
(12, '0001', 'TERRENO DE 23 MANZANAS', 3, 7, NULL, 2, 7, ''),
(13, '0002', 'MANZANAS 2', 3, 7, NULL, 1, 7, ''),
(14, '0003', 'MESAS DE ESCRITORIO PARA PC', 4, 8, NULL, 1, 8, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `amortizacion`
--

CREATE TABLE `amortizacion` (
  `idAmortizacion` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `saldoInicial` double DEFAULT NULL,
  `amortizacion` double DEFAULT NULL,
  `cuotaMensual` double NOT NULL,
  `interes` double DEFAULT NULL,
  `saldoFinal` double DEFAULT NULL,
  `cuotaPagada` double DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `idPrestamo` int(11) DEFAULT NULL,
  `mora` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `amortizacion`
--

INSERT INTO `amortizacion` (`idAmortizacion`, `fecha`, `saldoInicial`, `amortizacion`, `cuotaMensual`, `interes`, `saldoFinal`, `cuotaPagada`, `estado`, `idPrestamo`, `mora`) VALUES
(90, '2020-02-16', 5000, 782.7498553093806, 907.7498553093806, 125, 4217.250144690619, 907.7498553093806, 1, 15, 0),
(91, '2020-03-16', 4217.250144690619, 802.3186016921151, 907.7498553093806, 105.43125361726548, 3414.931542998504, 907.7498553093806, 1, 15, 0),
(92, '2020-04-16', 3414.931542998504, 822.376566734418, 907.7498553093806, 85.3732885749626, 2592.554976264086, 907.7498553093806, 1, 15, 0),
(93, '2020-05-16', 2592.554976264086, 842.9359809027784, 907.7498553093806, 64.81387440660215, 1749.6189953613075, 907.7498553093806, 1, 15, 0),
(94, '2020-06-16', 1749.6189953613075, 864.0093804253479, 907.7498553093806, 43.74047488403269, 885.6096149359596, 907.7498553093806, 1, 15, 0),
(95, '2020-07-16', 885.6096149359596, 885.6096149359815, 907.7498553093806, 22.140240373398992, -0.000000000021941559680271894, 907.7498553093806, 1, 15, 0),
(96, '2020-02-16', 560, 41.558087161122714, 53.22475382778938, 11.666666666666668, 518.4419128388773, 53.22475382778938, 1, 16, 0),
(97, '2020-03-16', 518.4419128388773, 42.4238806436461, 53.22475382778938, 10.80087318414328, 476.0180321952312, 53.22475382778938, 1, 16, 0),
(98, '2020-04-16', 476.0180321952312, 43.307711490388726, 53.22475382778938, 9.917042337400652, 432.7103207048425, 53.22475382778938, 1, 16, 0),
(99, '2020-05-16', 432.7103207048425, 44.20995547977182, 53.22475382778938, 9.014798348017553, 388.5003652250707, 53.22475382778938, 1, 16, 0),
(100, '2020-06-16', 388.5003652250707, 45.13099621893374, 53.22475382778938, 8.093757608855642, 343.369369006137, 53.22475382778938, 1, 16, 0),
(101, '2020-07-16', 343.369369006137, 46.07122530682819, 53.22475382778938, 7.1535285209611885, 297.2981436993088, 53.22475382778938, 1, 16, 0),
(102, '2020-08-16', 297.2981436993088, 47.031042500720446, 53.22475382778938, 6.193711327068934, 250.26710119858836, 53.22475382778938, 1, 16, 0),
(103, '2020-09-16', 250.26710119858836, 48.01085588615212, 53.22475382778938, 5.213897941637258, 202.25624531243625, 53.22475382778938, 1, 16, 0),
(104, '2020-10-16', 202.25624531243625, 49.01108205044696, 53.22475382778938, 4.213671777342422, 153.2451632619893, NULL, 0, 16, 0),
(105, '2020-11-16', 153.2451632619893, 50.032146259831265, 53.22475382778938, 3.1926075679581105, 103.21301700215803, NULL, 0, 16, 0),
(106, '2020-12-16', 103.21301700215803, 51.07448264024442, 53.22475382778938, 2.150271187544959, 52.13853436191361, NULL, 0, 16, 0),
(107, '2021-01-16', 52.13853436191361, 52.13853436191618, 53.22475382778938, 1.0862194658732003, -0.0000000000025721647034515627, NULL, 0, 16, 0),
(108, '2019-11-16', 30000, 1612.997413868642, 2512.997413868642, 900, 28387.00258613136, NULL, 0, 17, 1),
(109, '2020-12-16', 28387.00258613136, 1661.3873362847012, 2512.997413868642, 851.6100775839408, 26725.615249846658, NULL, 0, 17, 0),
(110, '2020-04-16', 26725.615249846658, 1711.2289563732425, 2512.997413868642, 801.7684574953997, 25014.386293473417, 2512.997413868642, 1, 17, 0),
(111, '2020-05-16', 25014.386293473417, 1762.5658250644397, 2512.997413868642, 750.4315888042025, 23251.820468408976, 2512.997413868642, 1, 17, 0),
(112, '2020-06-16', 23251.820468408976, 1815.4427998163728, 2512.997413868642, 697.5546140522692, 21436.377668592602, NULL, 0, 17, 0),
(113, '2020-07-16', 21436.377668592602, 1869.906083810864, 2512.997413868642, 643.091330057778, 19566.47158478174, NULL, 0, 17, 0),
(114, '2020-08-16', 19566.47158478174, 1926.00326632519, 2512.997413868642, 586.9941475434522, 17640.468318456547, NULL, 0, 17, 0),
(115, '2020-09-16', 17640.468318456547, 1983.7833643149456, 2512.997413868642, 529.2140495536964, 15656.684954141601, NULL, 0, 17, 0),
(116, '2020-10-16', 15656.684954141601, 2043.296865244394, 2512.997413868642, 469.70054862424803, 13613.388088897207, NULL, 0, 17, 0),
(117, '2020-11-16', 13613.388088897207, 2104.5957712017257, 2512.997413868642, 408.4016426669162, 11508.792317695481, NULL, 0, 17, 0),
(118, '2020-12-16', 11508.792317695481, 2167.7336443377776, 2512.997413868642, 345.2637695308644, 9341.058673357704, NULL, 0, 17, 0),
(119, '2021-01-16', 9341.058673357704, 2232.765653667911, 2512.997413868642, 280.2317602007311, 7108.293019689792, NULL, 0, 17, 0),
(120, '2021-02-16', 7108.293019689792, 2299.7486232779484, 2512.997413868642, 213.24879059069377, 4808.544396411844, NULL, 0, 17, 0),
(121, '2021-03-16', 4808.544396411844, 2368.7410819762868, 2512.997413868642, 144.25633189235532, 2439.8033144355572, NULL, 0, 17, 0),
(122, '2021-04-16', 2439.8033144355572, 2439.8033144355754, 2512.997413868642, 73.19409943306671, -0.000000000018189894035458565, NULL, 0, 17, 0),
(158, '2019-09-16', 3000, 397.4862889324496, 472.4862889324496, 75, 2602.5137110675505, NULL, 0, 29, 1),
(159, '2019-10-16', 2602.5137110675505, 407.42344615576087, 472.4862889324496, 65.06284277668877, 2195.0902649117897, NULL, 0, 29, 1),
(160, '2019-11-16', 2195.0902649117897, 417.6090323096549, 472.4862889324496, 54.87725662279475, 1777.481232602135, NULL, 0, 29, 1),
(161, '2019-12-16', 1777.481232602135, 428.0492581173962, 472.4862889324496, 44.437030815053376, 1349.4319744847387, NULL, 0, 29, 1),
(162, '2020-06-16', 1349.4319744847387, 438.7504895703311, 472.4862889324496, 33.73579936211847, 910.6814849144075, NULL, 0, 29, 0),
(163, '2020-07-16', 910.6814849144075, 449.7192518095894, 472.4862889324496, 22.767037122860188, 460.9622331048181, NULL, 0, 29, 0),
(164, '2020-08-16', 460.9622331048181, 460.9622331048292, 472.4862889324496, 11.524055827620453, -0.000000000011084466677857563, NULL, 0, 29, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCat` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `cod` varchar(150) NOT NULL,
  `val` double NOT NULL,
  `vidautil` int(5) NOT NULL,
  `vidaeco` int(5) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCat`, `nombre`, `cod`, `val`, `vidautil`, `vidaeco`, `estado`) VALUES
(10, 'TERRENO', 'TE0001', 15, 25, 0, 1),
(11, 'MAQUINARIA Y EQUIPO', 'MA0001', 20, 10, 0, 1);

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
  `repre` varchar(100) DEFAULT NULL,
  `tel` varchar(150) NOT NULL,
  `ocupacion` varchar(150) NOT NULL,
  `depa` varchar(150) NOT NULL,
  `fecha` date NOT NULL,
  `direc` varchar(200) NOT NULL,
  `estado` int(11) NOT NULL,
  `tipo` int(11) NOT NULL,
  `cartera` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `nombre`, `apellido`, `dui`, `nit`, `repre`, `tel`, `ocupacion`, `depa`, `fecha`, `direc`, `estado`, `tipo`, `cartera`) VALUES
(6, 'MIGUEL JOSUE', 'DURAN AYALA', '12345678-0', '1010-121200-103-4', NULL, '2156-1234', 'INGENIERO CIVIL', 'AGUACHAPAN', '2020-01-15', 'COLONIA LAS FLORES', 1, 0, 2),
(7, 'LA MEJOR SA', 'CARLOS GOMEZ BARRERA', '87654321-4', '1012-213490-103-2', NULL, '2222-1245', 'VETAS COMERCIALES', 'SONSONATE', '2020-01-15', 'BARRIO SANTA ELENA', 1, 1, 1),
(9, 'JULIA EMILY', 'CABRERA', '32498510-9', '1010-120891-102-7', NULL, '2213-9787', 'ESTUDIANTE', 'SAN MIGUEL', '2020-01-15', 'CANTON LA GRAN ESTRELLA', 1, 0, 0),
(10, 'Nuevo', 'new', '12345678-9', '1234-545765-234-1', NULL, '2244-4344', 'Estudiante', 'AGUACHAPAN', '2020-01-16', 'Colonia nueva ', 1, 0, 0);

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
  `id_de` int(50) DEFAULT NULL,
  `donado` varchar(100) NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `creditos`
--

CREATE TABLE `creditos` (
  `idCre` int(10) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `plazom` int(10) NOT NULL,
  `cmax` double NOT NULL,
  `cmin` double NOT NULL,
  `garantia` varchar(50) NOT NULL,
  `interes` double NOT NULL,
  `clasificacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `creditos`
--

INSERT INTO `creditos` (`idCre`, `tipo`, `plazom`, `cmax`, `cmin`, `garantia`, `interes`, `clasificacion`) VALUES
(11, 'HIPOTECARIO', 24, 6000, 100, 'HIPOTECATIO', 30, 0),
(12, 'ESTUDIANTE', 12, 700, 300, 'AVAL', 25, 0),
(13, 'INVERSION', 30, 30000, 10000, 'AVAL', 36, 1);

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

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`idDep`, `nombre`, `codigo`, `estado`) VALUES
(3, 'DEPARTAMENTO DE ADMINISTRACION', 'DA0001', 1),
(4, 'DEPARTAMENTO DE RECURSOS HUMANOS', 'DR0002', 1);

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
  `vidautil_restante` int(10) DEFAULT NULL,
  `marca_id` int(10) DEFAULT NULL,
  `ubi_id` int(10) DEFAULT NULL,
  `activofijo_id` int(20) NOT NULL,
  `condicion` varchar(100) DEFAULT NULL,
  `valor_r` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_activo`
--

INSERT INTO `detalle_activo` (`id`, `serie`, `fecha_adqui`, `fecha_inicio`, `valor_historico`, `donado`, `vidautil_restante`, `marca_id`, `ubi_id`, `activofijo_id`, `condicion`, `valor_r`) VALUES
(7, 'LOTIFICACIONES', '2020-01-15', '2020-01-14', 21000, 'NO', 3, NULL, NULL, 12, 'USADO', 11.1),
(8, 'TERRENO ARIDO', '2020-01-16', '2020-01-16', 12000, 'SI', 25, NULL, NULL, 13, 'NUEVO', 15),
(9, 'CREDRON DE ROBLE', '2020-01-16', '2020-01-16', 500, 'NO', 10, NULL, NULL, 14, 'NUEVO', 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fiador`
--

CREATE TABLE `fiador` (
  `id_fiador` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `dui` text NOT NULL,
  `nit` text NOT NULL,
  `fuente` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `fiador`
--

INSERT INTO `fiador` (`id_fiador`, `nombre`, `dui`, `nit`, `fuente`) VALUES
(2, 'MARLON VALENCIA', '12436587-9', '1010-090688-106-4', 'REMESAS FAMILIARES'),
(4, 'ANA ELIZA LAINEZ', '32145687-0', '1010-220387-105-5', 'VENTA DE MUEBLES');

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
  `estado` int(11) NOT NULL,
  `idep` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`idMarca`, `nombre`, `estado`, `idep`) VALUES
(7, 'LOTIFICACIONES', 1, 5),
(8, 'CREDRON', 1, 6),
(9, 'DELL', 1, 6);

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
(1, 'VENTA DE ACTIVOS', 1),
(2, 'DONACION DE ACTIVOS', 1);

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
  `saldo` double DEFAULT NULL,
  `estado` int(11) NOT NULL,
  `idCli` int(10) NOT NULL,
  `idCre` int(10) NOT NULL,
  `idFia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`idPres`, `monto`, `plazo`, `fechafinan`, `cuota`, `saldo`, `estado`, `idCli`, `idCre`, `idFia`) VALUES
(15, 5000, 6, '2020-01-16', 907.7498553093806, NULL, 1, 9, 11, NULL),
(16, 560, 12, '2020-01-16', 53.22475382778938, NULL, 0, 9, 12, 2),
(17, 30000, 15, '2020-01-16', 2512.997413868642, NULL, 0, 7, 13, NULL),
(29, 3000, 7, '2020-01-16', 472.4862889324496, NULL, 0, 6, 11, NULL);

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
(5, 'LOTIFICATIONS', 'CANTON LAS DELICIAS', '1010-112211-098-1', 'JUAN EDENILSON OCHOA', '2123-4512', 'LOTI@GMAIL.COM', 'EXLENTES SERCICIOS', 1),
(6, 'LO MEJOR SA', 'CANTON LOS GIASOLES', '1010-131190-102-2', 'DIEGO LEOPOLDO ANDRADE', '2312-4563', 'LOMEOR@HOTMIL.COM', 'DEDICADO A VENDER EQUIPOS', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reevaluar`
--

CREATE TABLE `reevaluar` (
  `idReeval` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `valorAnt` varchar(50) NOT NULL,
  `idAc` int(11) DEFAULT NULL,
  `valor` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
(7, 'TERRENO AMPLIO', 10, 'TE0001', 1),
(8, 'EQUIPO INFORMATICO', 11, 'EQ0001', 1);

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idusu` int(11) NOT NULL,
  `user` varchar(60) NOT NULL,
  `pass` text NOT NULL,
  `nivel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idusu`, `user`, `pass`, `nivel`) VALUES
(7, 'Edgardo', '2f38ba611ba75d0961a66ae8d637614ff564bbe91c0720bbdd8714ad32b90319', 0),
(10, 'u1', 'bb82030dbc2bcaba32a90bf2e207a84a856fc5f033b77c480836ab6f77f40f19', 0),
(11, 'u2', '6ca202c88e549dff68c09bfafbfc60b2fac074debc1e6777e9ba4b6c703ed114', 1),
(12, 'u3', '011e39efe22590f4a339ad19cd180f4d855e32feba602d1ec8e154780838c99c', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `id_de` int(11) DEFAULT NULL,
  `idMovi` int(11) NOT NULL,
  `factNum` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `precVenta` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`idVenta`, `id_de`, `idMovi`, `factNum`, `fecha`, `precVenta`) VALUES
(4, 7, 1, '00001', '2020-01-15', '21602.56');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `activo`
--
ALTER TABLE `activo`
  ADD PRIMARY KEY (`idAc`),
  ADD KEY `id_sub` (`idSub`),
  ADD KEY `fk_marca` (`idMarca`),
  ADD KEY `id_ub` (`idDep`);

--
-- Indices de la tabla `amortizacion`
--
ALTER TABLE `amortizacion`
  ADD PRIMARY KEY (`idAmortizacion`),
  ADD KEY `fk_pres` (`idPrestamo`);

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
  ADD PRIMARY KEY (`idCom`),
  ADD KEY `fk_id` (`id_de`);

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
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_activo` (`activofijo_id`);

--
-- Indices de la tabla `fiador`
--
ALTER TABLE `fiador`
  ADD PRIMARY KEY (`id_fiador`);

--
-- Indices de la tabla `institucion`
--
ALTER TABLE `institucion`
  ADD PRIMARY KEY (`idIn`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`idMarca`),
  ADD KEY `fk_idp` (`idep`);

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
  ADD PRIMARY KEY (`idPres`),
  ADD KEY `fk_idcli` (`idCli`),
  ADD KEY `fk_cre` (`idCre`),
  ADD KEY `fk_fiador` (`idFia`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`ide`);

--
-- Indices de la tabla `reevaluar`
--
ALTER TABLE `reevaluar`
  ADD PRIMARY KEY (`idReeval`),
  ADD KEY `fk_a` (`idAc`);

--
-- Indices de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  ADD PRIMARY KEY (`idSub`),
  ADD KEY `fk_idcat` (`idcat`);

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
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `fk_idmov` (`idMovi`),
  ADD KEY `fk_idac` (`id_de`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `activo`
--
ALTER TABLE `activo`
  MODIFY `idAc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `amortizacion`
--
ALTER TABLE `amortizacion`
  MODIFY `idAmortizacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=165;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `clasificaactivo`
--
ALTER TABLE `clasificaactivo`
  MODIFY `idClas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `idCom` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `creditos`
--
ALTER TABLE `creditos`
  MODIFY `idCre` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `idDep` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `detalle_activo`
--
ALTER TABLE `detalle_activo`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `fiador`
--
ALTER TABLE `fiador`
  MODIFY `id_fiador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `institucion`
--
ALTER TABLE `institucion`
  MODIFY `idIn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

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
  MODIFY `idPres` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `ide` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `reevaluar`
--
ALTER TABLE `reevaluar`
  MODIFY `idReeval` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  MODIFY `idSub` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  MODIFY `idUb` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idusu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `activo`
--
ALTER TABLE `activo`
  ADD CONSTRAINT `fk_marca` FOREIGN KEY (`idMarca`) REFERENCES `marca` (`idMarca`),
  ADD CONSTRAINT `id_sub` FOREIGN KEY (`idSub`) REFERENCES `subcategoria` (`idSub`),
  ADD CONSTRAINT `id_ub` FOREIGN KEY (`idDep`) REFERENCES `departamento` (`idDep`);

--
-- Filtros para la tabla `amortizacion`
--
ALTER TABLE `amortizacion`
  ADD CONSTRAINT `fk_pres` FOREIGN KEY (`idPrestamo`) REFERENCES `prestamo` (`idPres`);

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `fk_id` FOREIGN KEY (`id_de`) REFERENCES `detalle_activo` (`id`);

--
-- Filtros para la tabla `detalle_activo`
--
ALTER TABLE `detalle_activo`
  ADD CONSTRAINT `fk_activo` FOREIGN KEY (`activofijo_id`) REFERENCES `activo` (`idAc`);

--
-- Filtros para la tabla `marca`
--
ALTER TABLE `marca`
  ADD CONSTRAINT `fk_idp` FOREIGN KEY (`idep`) REFERENCES `proveedor` (`ide`);

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `fk_cre` FOREIGN KEY (`idCre`) REFERENCES `creditos` (`idCre`),
  ADD CONSTRAINT `fk_fiador` FOREIGN KEY (`idFia`) REFERENCES `fiador` (`id_fiador`),
  ADD CONSTRAINT `fk_idcli` FOREIGN KEY (`idCli`) REFERENCES `cliente` (`idCliente`);

--
-- Filtros para la tabla `reevaluar`
--
ALTER TABLE `reevaluar`
  ADD CONSTRAINT `fk_a` FOREIGN KEY (`idAc`) REFERENCES `activo` (`idAc`);

--
-- Filtros para la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  ADD CONSTRAINT `fk_idcat` FOREIGN KEY (`idcat`) REFERENCES `categoria` (`idCat`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `fk_idac` FOREIGN KEY (`id_de`) REFERENCES `detalle_activo` (`id`),
  ADD CONSTRAINT `fk_idmov` FOREIGN KEY (`idMovi`) REFERENCES `movimiento` (`idMov`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

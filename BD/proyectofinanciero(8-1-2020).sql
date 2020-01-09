-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-01-2020 a las 06:20:07
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
(1, '0001', 'Toyota Corola 2016', 1, 1, 1, 2, 1, NULL),
(2, '0002', 'Terreno en la costa', 1, 3, 1, 1, 3, NULL),
(3, '0003', 'Tractor', 1, 2, 1, 1, 6, NULL),
(4, '0004', 'Computadora Azus', 1, 4, 1, 0, 5, NULL),
(5, '0005', 'AAAAAA', 1, 4, NULL, 1, 3, ''),
(6, '0005', 'AAAAAA', 1, 4, NULL, 1, 3, ''),
(7, '0007', 'AAA', 1, 4, NULL, 1, 3, ''),
(8, '0008', 'PRUEVA', 1, 4, NULL, 1, 1, ''),
(9, '0009', 'PRUEVA', 1, 4, NULL, 1, 3, ''),
(10, '0010', 'aaaaa', 1, 4, NULL, 2, 3, ''),
(11, '0011', 'ULTIMO MODELO', 2, 1, NULL, 1, 3, '');

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
(13, '2020-01-30', 5000, 782.7498553093806, 907.7498553093806, 125, 4217.250144690619, NULL, 1, 5, 0),
(14, '2020-02-29', 4217.250144690619, 802.3186016921151, 907.7498553093806, 105.43125361726548, 3414.931542998504, NULL, 1, 5, 0),
(15, '2020-03-29', 3414.931542998504, 822.376566734418, 907.7498553093806, 85.3732885749626, 2592.554976264086, NULL, 1, 5, 0),
(16, '2020-04-29', 2592.554976264086, 842.9359809027784, 907.7498553093806, 64.81387440660215, 1749.6189953613075, NULL, 1, 5, 0),
(17, '2020-05-29', 1749.6189953613075, 864.0093804253479, 907.7498553093806, 43.74047488403269, 885.6096149359596, NULL, 1, 5, 0),
(18, '2020-06-29', 885.6096149359596, 885.6096149359815, 907.7498553093806, 22.140240373398992, -0.000000000021941559680271894, NULL, 1, 5, 0),
(55, '2020-01-30', 1200, 86.98455238600593, 116.98455238600593, 30, 1113.0154476139942, 116.98455238600593, 1, 9, 0),
(56, '2020-02-29', 1113.0154476139942, 89.15916619565607, 116.98455238600593, 27.825386190349857, 1023.8562814183381, 116.98455238600593, 1, 9, 0),
(57, '2020-03-29', 1023.8562814183381, 91.38814535054748, 116.98455238600593, 25.596407035458455, 932.4681360677906, NULL, 0, 9, 0),
(58, '2020-04-29', 932.4681360677906, 93.67284898431116, 116.98455238600593, 23.311703401694768, 838.7952870834795, NULL, 0, 9, 0),
(59, '2020-05-29', 838.7952870834795, 96.01467020891894, 116.98455238600593, 20.969882177086987, 742.7806168745606, NULL, 0, 9, 0),
(60, '2020-06-29', 742.7806168745606, 98.41503696414192, 116.98455238600593, 18.569515421864015, 644.3655799104187, NULL, 0, 9, 0),
(61, '2020-07-29', 644.3655799104187, 100.87541288824546, 116.98455238600593, 16.109139497760466, 543.4901670221732, NULL, 0, 9, 0),
(62, '2020-08-29', 543.4901670221732, 103.3972982104516, 116.98455238600593, 13.58725417555433, 440.0928688117216, NULL, 0, 9, 0),
(63, '2020-09-29', 440.0928688117216, 105.98223066571289, 116.98455238600593, 11.00232172029304, 334.1106381460087, NULL, 0, 9, 0),
(64, '2020-10-29', 334.1106381460087, 108.63178643235571, 116.98455238600593, 8.352765953650218, 225.47885171365297, NULL, 0, 9, 0),
(65, '2020-11-29', 225.47885171365297, 111.3475810931646, 116.98455238600593, 5.6369712928413245, 114.13127062048837, NULL, 0, 9, 0),
(66, '2021-12-29', 114.13127062048837, 114.13127062049372, 116.98455238600593, 2.853281765512209, -0.000000000005357492227631155, NULL, 0, 9, 0),
(67, '2020-02-06', 2000, 330.5663399868352, 337.2330066535019, 6.666666666666666, 1669.4336600131649, NULL, 0, 10, 0),
(68, '2020-03-06', 1669.4336600131649, 331.66822778679136, 337.2330066535019, 5.564778866710549, 1337.7654322263734, NULL, 0, 10, 0),
(69, '2020-04-06', 1337.7654322263734, 332.77378854608065, 337.2330066535019, 4.459218107421244, 1004.9916436802928, NULL, 0, 10, 0),
(70, '2020-05-06', 1004.9916436802928, 333.8830345079009, 337.2330066535019, 3.349972145600976, 671.1086091723919, NULL, 0, 10, 0),
(71, '2020-06-06', 671.1086091723919, 334.99597795626056, 337.2330066535019, 2.237028697241306, 336.1126312161313, NULL, 0, 10, 0),
(72, '2020-07-06', 336.1126312161313, 336.1126312161148, 337.2330066535019, 1.1203754373871044, 0.000000000016541434888495132, NULL, 0, 10, 0);

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
(2, 'Maquinaria y equipo', 'M003', 10, 5, 8, 0),
(3, 'Transporte', 'V012', 10, 5, 9, 1),
(4, 'Mobiliario y oficina', 'A00235', 10, 2, 5, 0),
(5, 'saf', 'ert', 3, 3, 3, 0),
(6, 'ESCRITORIOS', 'dsf', 3, 4, 3, 1),
(7, 'VEHICULO', 'V12', 12, 3, 5, 1),
(8, 'Terricolas', 'T0003', 13, 23, 0, 0),
(9, 'PROPIEDAD EQUIPOS', 'PR0001', 9, 4, 0, 1);

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
(1, 'Jose Alberto', 'Morales Arias', '32323235-1', '1125-335644-354-11', '', '235-4512', 'Secretario', 'CuscatlÃ¡n', '2018-01-22', 'Colonia las margaritas pasaje las azucenas #123 cojutepeque,cuscatlan', 0, 0, 1),
(2, 'Juan Carlos', 'Beltran Urias', '3226555-0', '5489-655899-321-1', '', '2315-4578', 'Gerente general', 'La Libertad', '2018-01-22', 'Colonia el chapulin avenida el trovador pasaje6 #123 ', 1, 1, 0),
(3, 'Oscarito', 'Peraza', '02060298-1', '0012-19242-652-2', '', '7822-3473', 'Docente', 'AGUACHAPAN', '2019-01-21', 'soyapango col. la esperanza', 1, 1, 0),
(4, 'JUAN ALFREDO', 'ORTEZ HERNANDEZ', '234567-9', '1010-123456-106-1', NULL, '2222-3343', 'VENTA DE COSAS', 'AGUACHAPAN', '2019-12-28', 'ESTA DE EJEMPLO', 1, 0, 2),
(5, '', '', '', '', NULL, '', '', 'AGUACHAPAN', '2020-01-02', '', 1, 0, 0);

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

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`idCom`, `idProv`, `fecha`, `condicion`, `precioUni`, `id_de`, `donado`, `estado`) VALUES
(1, 1, '2018-01-15', 'Nuevo', '5000', NULL, 'NO', 1),
(2, 2, '2018-01-22', 'Nuevo', '7500', NULL, 'NO', 1),
(3, 1, '2019-01-21', 'Nuevo', '2000', NULL, 'NO', 1),
(4, 3, '2019-01-21', 'Nuevo', '500', NULL, 'NO', 1);

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
  `interes` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `creditos`
--

INSERT INTO `creditos` (`idCre`, `tipo`, `plazom`, `cmax`, `cmin`, `garantia`, `interes`) VALUES
(1, 'Personal', 72, 10000, 100, 'Aval', 12),
(2, 'Agropecuarios', 21, 1500.01, 200.01, 'AVAL', 11),
(3, 'Hipotecario', 240, 20000, 1000, 'Hipotecaria', 12),
(4, 'Estudiantil', 12, 500, 100, 'Aval', 2),
(5, 'NUEVO DE BASE', 12, 12, 12, 'AVAL', 13),
(6, 'DE BASE', 14, 500, 100, 'HIPOTECATIO', 4),
(7, 'PRUEVA', 36, 6000, 100, 'HIPOTECATIO', 30);

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
(1, 'DEPARTAMENTO DE INFOR', 'DI0001', 1),
(2, 'DEPARTEMENTO DE ADMINISTRACIONES', 'DA0002', 1);

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
  `condicion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalle_activo`
--

INSERT INTO `detalle_activo` (`id`, `serie`, `fecha_adqui`, `fecha_inicio`, `valor_historico`, `donado`, `vidautil_restante`, `marca_id`, `ubi_id`, `activofijo_id`, `condicion`) VALUES
(1, 'P128-45', '2018-01-15', '2018-01-22', 5000, 'NO', 5, 1, 2, 1, NULL),
(2, 'h2200', '2018-01-22', '2018-01-22', 7500, 'NO', 0, 4, 4, 2, NULL),
(3, 'p-25666', '2019-01-21', '2019-01-21', 3000, 'NO', 5, 1, 1, 3, NULL),
(4, '000-2', '2019-01-21', '2019-01-21', 600, 'NO', 2, 5, 5, 4, NULL),
(5, 'AAAAA', '2019-12-26', '2019-12-26', 2222, 'SI', 2, NULL, NULL, 10, 'NUEVO'),
(6, 'LA SERIE', '2020-01-03', '2020-01-03', 2100, 'NO', 5, NULL, NULL, 11, 'NUEVO');

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
(1, 'Toyota2', 1, 1),
(2, 'Honda', 1, 1),
(3, 'Hp', 1, 4),
(4, 'Ninguna', 1, 2),
(5, 'Azuz', 1, 2),
(6, 'PISCINA', 1, 3);

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
  `saldo` double DEFAULT NULL,
  `estado` int(11) NOT NULL,
  `idCli` int(10) NOT NULL,
  `idCre` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`idPres`, `monto`, `plazo`, `fechafinan`, `cuota`, `saldo`, `estado`, `idCli`, `idCre`) VALUES
(5, 5000, 6, '2020-12-30', 907.7498553093806, NULL, 1, 3, 7),
(9, 1200, 12, '2020-12-30', 116.98455238600593, NULL, 0, 4, 7),
(10, 2000, 6, '2020-01-06', 337.2330066535019, NULL, 1, 3, 6);

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
(3, 'omnisport', 'colonia el pericon', '0702-230592-102-4', 'william Barrera castellano', '7521-9265', 'william@gmail.com', 'no tiene', 1),
(4, 'LOS EANOS', 'CANTONES', '1010', 'JUAN PONCHO', '2345-3573', 'ALGO.COM', 'BUENA ONDA', 1);

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
(2, 'Pesado', 3, 'V0120041', 0),
(3, 'terreno valdio', 1, 'H00230036', 1),
(4, 'Mobiliario informatico', 4, 'A0044B0055', 1),
(5, 'kkkkkk', 4, 'aaaa', 1),
(6, 'TERRENO EN ALQUILACION', 1, 'TER123', 0);

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
  `pass` text NOT NULL,
  `nivel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idusu`, `user`, `pass`, `nivel`) VALUES
(1, 'erick', 'erick', 0),
(2, 'josej', 'josej', 0),
(3, 'marijose', 'marijose', 0),
(4, 'Rogelia1', 'Rogelia1', 2),
(5, 'erick1', 'erick1', 0),
(6, 'krauli', 'krauly', 1),
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
(1, 4, 1, '00004', '2019-01-21', '500'),
(2, 5, 1, '00002', '2019-12-27', '2444.2'),
(3, 1, 1, '00003', '2019-12-28', '3602.5');

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
  ADD KEY `fk_cre` (`idCre`);

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
  MODIFY `idAc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `amortizacion`
--
ALTER TABLE `amortizacion`
  MODIFY `idAmortizacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=73;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `clasificaactivo`
--
ALTER TABLE `clasificaactivo`
  MODIFY `idClas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `idCom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `creditos`
--
ALTER TABLE `creditos`
  MODIFY `idCre` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `idDep` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `detalle_activo`
--
ALTER TABLE `detalle_activo`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `institucion`
--
ALTER TABLE `institucion`
  MODIFY `idIn` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

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
  MODIFY `idPres` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `ide` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `reevaluar`
--
ALTER TABLE `reevaluar`
  MODIFY `idReeval` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `subcategoria`
--
ALTER TABLE `subcategoria`
  MODIFY `idSub` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `ubicacion`
--
ALTER TABLE `ubicacion`
  MODIFY `idUb` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idusu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

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

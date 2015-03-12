-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Jun 05, 2014 as 09:48 PM
-- Versão do Servidor: 5.5.8
-- Versão do PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `oficinamecanica`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `atendimento`
--

CREATE TABLE IF NOT EXISTS `atendimento` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `anomalia` varchar(255) DEFAULT NULL,
  `cor` varchar(255) DEFAULT NULL,
  `dataConclusao` datetime DEFAULT NULL,
  `dataEntrada` datetime DEFAULT NULL,
  `dataServico` datetime DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `placa` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Extraindo dados da tabela `atendimento`
--

INSERT INTO `atendimento` (`id`, `anomalia`, `cor`, `dataConclusao`, `dataEntrada`, `dataServico`, `marca`, `modelo`, `placa`) VALUES
(1, 'PROBLEMAS NO FREIO', NULL, NULL, NULL, NULL, 'TOYOTA', 'COROLA', 'AAA 1111'),
(2, '', NULL, NULL, NULL, NULL, '', '', ''),
(3, 'bicos de ingessao', NULL, NULL, NULL, NULL, 'ford', 'fiesta', 'aaa 2222'),
(4, 'ar condicionado', NULL, NULL, NULL, NULL, 'chevrolet', 'vectra', 'aaa 3333'),
(5, 'FALTA CONBUSTIVEL', NULL, NULL, '2014-05-30 21:57:59', NULL, 'VW', 'POLO', 'AAA 4444'),
(6, '', NULL, NULL, '2014-05-30 22:00:05', NULL, '', '', ''),
(7, 'marcha', NULL, NULL, '2014-06-01 18:11:03', NULL, 'chevrolet', 'cruze', 'bbb 1111'),
(8, '', NULL, NULL, '2014-06-01 18:11:18', NULL, '', '', ''),
(9, '', NULL, NULL, '2014-06-01 18:23:56', NULL, '', '', '');

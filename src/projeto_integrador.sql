-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 28-Jul-2022 às 22:19
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `projeto_integrador`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

CREATE TABLE `empresa` (
  `idEmpresa` int(11) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `local` varchar(30) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `user` varchar(30) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `email` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `empresa`
--

INSERT INTO `empresa` (`idEmpresa`, `nome`, `local`, `telefone`, `user`, `senha`, `email`) VALUES
(1, 'teste', 'teste', 'teste', 'teste', 'teste', 'TESTE'),
(2, 'a', 'a', 'a', 'a', 'a', 'a'),
(3, 'a', 'a', 'a', 'a', 'a', 'a'),
(4, 'Wal', 'ali', '123345', 'wal', 'wal', 'wal@gmail');

-- --------------------------------------------------------

--
-- Estrutura da tabela `evento`
--

CREATE TABLE `evento` (
  `idEvento` int(11) NOT NULL,
  `nome` varchar(25) NOT NULL,
  `local` varchar(25) NOT NULL,
  `idEmpresa` int(11) NOT NULL,
  `idIngresso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `evento`
--

INSERT INTO `evento` (`idEvento`, `nome`, `local`, `idEmpresa`, `idIngresso`) VALUES
(3, 'Baile funk', 'tuka', 1, 3),
(4, 'yes', 'Uptaown', 1, 4),
(5, 'Gimas Festa', 'guaiba', 1, 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `ingresso`
--

CREATE TABLE `ingresso` (
  `idIngresso` int(11) NOT NULL,
  `loteUmQuantidade` int(255) NOT NULL,
  `loteDoisQuantidade` int(255) NOT NULL,
  `loteTresQuantidade` int(255) NOT NULL,
  `loteUmValor` decimal(65,0) NOT NULL,
  `loteDoisValor` decimal(65,0) NOT NULL,
  `loteTresValor` decimal(65,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `ingresso`
--

INSERT INTO `ingresso` (`idIngresso`, `loteUmQuantidade`, `loteDoisQuantidade`, `loteTresQuantidade`, `loteUmValor`, `loteDoisValor`, `loteTresValor`) VALUES
(3, 50, 100, 150, '100', '200', '300'),
(4, 123, 133, 143, '112', '113', '14'),
(5, 100, 200, 400, '50', '100', '150');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(20) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `user` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `senha` varchar(15) NOT NULL,
  `telefone` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `nome`, `user`, `email`, `senha`, `telefone`) VALUES
(1, 'a', 'a', 'a@gmail', 'a', 'a');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`idEmpresa`);

--
-- Índices para tabela `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`idEvento`),
  ADD KEY `fk_evento_empresa_idx` (`idEmpresa`) USING BTREE,
  ADD KEY `fk_evento_ingresso_idx` (`idIngresso`) USING BTREE;

--
-- Índices para tabela `ingresso`
--
ALTER TABLE `ingresso`
  ADD PRIMARY KEY (`idIngresso`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `empresa`
--
ALTER TABLE `empresa`
  MODIFY `idEmpresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `evento`
--
ALTER TABLE `evento`
  MODIFY `idEvento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de tabela `ingresso`
--
ALTER TABLE `ingresso`
  MODIFY `idIngresso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

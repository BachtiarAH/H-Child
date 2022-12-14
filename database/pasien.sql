-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2022 at 07:14 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hchild`
--

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` int(11) NOT NULL,
  `nama_anak` varchar(255) NOT NULL,
  `nama_ibu` varchar(255) NOT NULL,
  `tempat_lahir` varchar(255) NOT NULL,
  `jenis_kelamin` varchar(255) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `tinggiBadan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama_anak`, `nama_ibu`, `tempat_lahir`, `jenis_kelamin`, `tanggal_lahir`, `tinggiBadan`) VALUES
(1, 'jan Etes', 'Selvi Ananda', 'surakarta', 'laki laki', '2016-12-14', 100);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

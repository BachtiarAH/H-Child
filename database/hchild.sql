-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2022 at 07:17 AM
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
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `id_akun` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `id_user` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`id_akun`, `username`, `password`, `id_user`) VALUES
(1, 'bachtiar', '1234', 1),
(2, 'zam', '123', 2);

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
(1, 'jan Etes', 'Selvi Ananda', 'surakarta', 'laki laki', '2016-12-14', 100),
(2, 'agasd', 'sdgasdgad', 'aasdg', 'perempuan', '2023-01-05', 100);

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `tempat_lahir` varchar(255) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `umur` int(11) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`id_user`, `nama`, `tempat_lahir`, `tanggal_lahir`, `jenis_kelamin`, `umur`, `alamat`) VALUES
(1, 'Bachtiar Arya Habibie', 'Madiun', '2022-12-14', 'laki-laki', 20, 'Jember'),
(2, 'Muhammad Tajut Zamzami', 'Banyuwangi', '2022-12-22', 'laki-laki', 20, 'Banyuwangi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`id_akun`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `akun`
--
ALTER TABLE `akun`
  MODIFY `id_akun` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pengguna`
--
ALTER TABLE `pengguna`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `akun`
--
ALTER TABLE `akun`
  ADD CONSTRAINT `akun_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `pengguna` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

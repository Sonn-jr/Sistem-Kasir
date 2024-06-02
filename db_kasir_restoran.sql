-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 10:38 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_kasir_restoran`
--

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id_makanan` int(11) NOT NULL,
  `nama_makanan` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id_makanan`, `nama_makanan`, `harga`, `status`) VALUES
(1, 'Nasi Goreng Komplit', 22000, 'Tersedia'),
(2, 'Mie Ayam Spesial', 18000, 'Tersedia'),
(3, 'Bubur Ayam', 15000, 'Habis'),
(4, 'Es Teh Manis', 5000, 'Tersedia'),
(6, 'Rendang', 8000, 'Habis'),
(7, 'Ayam Bakar', 10000, 'Tersedia'),
(8, 'Susu Soda Gembira', 9000, 'Tersedia'),
(9, 'Ayam Penyet', 12000, 'Tersedia'),
(10, 'Capcay Udang', 10000, 'Habis'),
(11, 'Nasi Bakar Spesial', 14000, 'Tersedia'),
(12, 'Nasi Lemak', 7000, 'Tersedia'),
(13, 'Kangkung Cap Gomeh', 13000, 'Tersedia'),
(14, 'Kwetiau Komplit', 15000, 'Habis'),
(15, 'Tumis Tauge', 9000, 'Tersedia'),
(16, 'Es Milo', 5000, 'Tersedia'),
(17, 'Teh Ocha', 5000, 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `nama_pelanggan` varchar(30) NOT NULL,
  `id_makanan` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `nama_makanan` varchar(30) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah_beli` int(11) NOT NULL,
  `total_bayar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `nama_pelanggan`, `id_makanan`, `tanggal`, `nama_makanan`, `harga`, `jumlah_beli`, `total_bayar`) VALUES
(5, 'Rehan', 2, '2024-05-23', 'Mie Ayam Spesial', 18000, 4, 72000),
(6, 'Nabila', 8, '2024-05-23', 'Susu Soda Gembira', 9000, 2, 18000),
(7, 'Mamang', 2, '2024-05-02', 'Mie Ayam Spesial', 18000, 4, 72000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `id_level` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`, `nama_user`, `id_level`) VALUES
(1, 'Admin', 'admin123', 'Administrator', 1),
(2, 'Kasir', 'kasir123', 'KasirBaru', 2),
(3, 'Owner', 'owner123', 'OwnerResto', 3),
(5, 'Pelanggan1', 'pelanggan111', 'Pelanggan1', 4),
(7, 'Pelanggan2', 'pelanggan222', 'Pelanggan2', 4),
(8, 'Kasir2', 'kasir456', 'KasirSepuh', 2),
(9, 'Owner2', 'owner222', 'OwnerBaru', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_makanan`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_makanan` (`id_makanan`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id_makanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_makanan`) REFERENCES `menu` (`id_makanan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

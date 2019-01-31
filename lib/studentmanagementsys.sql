-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 02 Février 2017 à 20:48
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `studentmanagementsys`
--

-- --------------------------------------------------------

--
-- Structure de la table `etudiant_info`
--
DROP DATABASE IF EXISTS g_etudiant_2017;
DROP DATABASE IF EXISTS studentManagementSys;
CREATE DATABASE IF NOT EXISTS studentManagementSys;

USE studentManagementSys;
CREATE TABLE `etudiant_info` (
  `Etudiant_id` int(6) NOT NULL,
  `nom_prenom` varchar(70) DEFAULT NULL,
  `annee_naissance` date DEFAULT NULL,
  `filiere` int(11) DEFAULT NULL,
  `promo` year(4) DEFAULT '2017',
  `genre` varchar(10) DEFAULT NULL,
  `adresse` text,
  `tele` varchar(16) DEFAULT NULL,
  `email` text,
  `photo` text
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `etudiant_info`
--

INSERT INTO `etudiant_info` (`Etudiant_id`, `nom_prenom`, `annee_naissance`, `filiere`, `promo`, `genre`, `adresse`, `tele`, `email`, `photo`) VALUES
(1, 'AMANAR Abderrahim', '1995-08-22', 1, 2016, 'Male', '', '', '', 'lib\\photoEtudiants\\AMANAR Abderrahim.jpg'),
(2, 'Fardane Abdellatif', '1995-08-22', 1, 2017, 'Male', '', '', '', 'lib\\photoEtudiants\\Fardane Abdellatif.jpg'),
(3, 'BOUALAM Youness', '1995-08-22', 1, 2017, 'Male', NULL, NULL, NULL, 'lib\\photoEtudiants\\BOUALAM Youness.jpg'),
(4, 'FIKRI Adil', '1995-08-22', 1, 2017, 'Male', NULL, NULL, NULL, 'lib\\photoEtudiants\\FIKRI Adil.jpg'),
(5, 'Fardane Abdellatif', '1995-08-22', 1, 2016, 'Male', '', '', '', 'lib\\photoEtudiants\\TARIK El Abiari.jpg'),
(6, 'Nawawi Nour Eddine', '1996-01-11', 1, 2017, 'Male', 'AGADIR', '', '', 'lib\\photoEtudiants\\Nawawi Nour Eddine.jpg'),
(7, 'Hizem Shaimae', '1996-01-11', 1, 2017, 'Male', 'OUARZAZATE', '', '', 'lib\\photoEtudiants\\Hizem Shaimae.jpg'),
(8, 'Asmaa Elg', '1994-01-13', 1, 2017, 'Male', '', '', '', 'lib\\photoEtudiants\\Asmaa Elg.jpg'),
(9, 'Sokayna Sosoo El', '1995-01-20', 1, 2016, 'Male', 'OUARZAZATE', '', 'exemple@exemple.com', 'lib\\photoEtudiants\\Sokayna Sosoo El.jpg'),
(10, 'Asma Meziane', '2017-02-08', 1, 2017, 'Male', '', '', '', NULL),
(11, 'Chaima Elhddadi', '2000-01-01', 1, 2017, 'Male', '', '', '', NULL),
(12, 'Bouranja Ikram', '2000-01-01', 1, 2017, 'Male', '', '', '', NULL),
(13, 'Farida Hammouchi', '2000-01-01', 1, 2017, 'Male', '', '', '', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `filiere`
--

CREATE TABLE `filiere` (
  `Filiere_id` int(3) NOT NULL,
  `date_supportée` date DEFAULT NULL,
  `filiere_nom` text
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `filiere`
--

INSERT INTO `filiere` (`Filiere_id`, `date_supportée`, `filiere_nom`) VALUES
(1, NULL, 'DSI'),
(2, NULL, 'MT');

-- --------------------------------------------------------

--
-- Structure de la table `logininfo`
--

CREATE TABLE `logininfo` (
  `login_id` int(3) NOT NULL,
  `username` varchar(50) NOT NULL,
  `pass` varchar(50) DEFAULT NULL,
  `usertype` varchar(50) DEFAULT NULL,
  `GrantedKey` varchar(8) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `logininfo`
--

INSERT INTO `logininfo` (`login_id`, `username`, `pass`, `usertype`, `GrantedKey`) VALUES
(1, 'm\'hamdi', 'ahmed', 'Administrateur', 'Granted'),
(2, 'bakila', 'mbark', 'Administrateur', 'Granted'),
(3, 'fardan', 'abdellatif', 'Etudiant', ''),
(4, 'a', 'a', 'Administrateur', 'Granted');

-- --------------------------------------------------------

--
-- Structure de la table `notation`
--

CREATE TABLE `notation` (
  `Notes_id` int(2) NOT NULL,
  `Etudiant_id` int(11) DEFAULT NULL,
  `note_E2` double(4,2) DEFAULT NULL,
  `note_E3` double(4,2) DEFAULT NULL,
  `note_E4` double(4,2) DEFAULT NULL,
  `note_E5` double(4,2) DEFAULT NULL,
  `note_E11` double(4,2) DEFAULT NULL,
  `note_E12` double(4,2) DEFAULT NULL,
  `note_E13` double(4,2) DEFAULT NULL,
  `note_E61` double(4,2) DEFAULT NULL,
  `note_E62` double(4,2) DEFAULT NULL,
  `moyenne_Generale` double(4,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `notation`
--

INSERT INTO `notation` (`Notes_id`, `Etudiant_id`, `note_E2`, `note_E3`, `note_E4`, `note_E5`, `note_E11`, `note_E12`, `note_E13`, `note_E61`, `note_E62`, `moyenne_Generale`) VALUES
(3, 3, 15.00, 16.00, 17.00, 18.00, 0.00, 0.00, 0.00, 0.00, 0.00, 12.28),
(4, 1, 14.00, 15.00, 16.00, 17.00, 18.00, 19.00, 20.00, 14.00, 14.00, 16.00),
(5, 5, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 14.00),
(6, 4, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 14.00),
(7, 5, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 14.00),
(8, 6, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 14.00),
(9, 7, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 14.00),
(18, 0, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 12.00),
(11, 9, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 12.00),
(12, 10, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 12.00),
(13, 11, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 12.00),
(14, 12, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 12.00),
(15, 13, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 12.00),
(17, 0, 10.00, 11.00, 12.00, 13.00, 14.00, 15.00, 16.00, 17.00, 17.00, 12.00);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `etudiant_info`
--
ALTER TABLE `etudiant_info`
  ADD PRIMARY KEY (`Etudiant_id`),
  ADD KEY `fk_filiere` (`filiere`);

--
-- Index pour la table `filiere`
--
ALTER TABLE `filiere`
  ADD PRIMARY KEY (`Filiere_id`);

--
-- Index pour la table `logininfo`
--
ALTER TABLE `logininfo`
  ADD PRIMARY KEY (`login_id`,`username`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Index pour la table `notation`
--
ALTER TABLE `notation`
  ADD PRIMARY KEY (`Notes_id`),
  ADD KEY `fk_etudient` (`Etudiant_id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `etudiant_info`
--
ALTER TABLE `etudiant_info`
  MODIFY `Etudiant_id` int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT pour la table `filiere`
--
ALTER TABLE `filiere`
  MODIFY `Filiere_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `logininfo`
--
ALTER TABLE `logininfo`
  MODIFY `login_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `notation`
--
ALTER TABLE `notation`
  MODIFY `Notes_id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

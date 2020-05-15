-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 26, 2015 at 05:04 PM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sampledb`
--

DELIMITER $$
--
-- Functions
--
CREATE DEFINER=`root`@`localhost` FUNCTION `studentFound`(`first` VARCHAR(20), `last` VARCHAR(20)) RETURNS int(11)
begin
declare result int;
	select count(*) into result
	from student
	where student.firstName = first and
	student.lastName = last;
	return result;
end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE IF NOT EXISTS `address` (
  `firstname` varchar(25) DEFAULT NULL,
  `mi` char(1) DEFAULT NULL,
  `lastname` varchar(25) DEFAULT NULL,
  `street` varchar(40) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `state` varchar(2) DEFAULT NULL,
  `zip` varchar(5) DEFAULT NULL,
  `telephone` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `count`
--

CREATE TABLE IF NOT EXISTS `count` (
  `countValue` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `count`
--

INSERT INTO `count` (`countValue`) VALUES
(7);

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE IF NOT EXISTS `country` (
  `name` varchar(30) NOT NULL,
  `flag` blob NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `courseId` int(11) NOT NULL,
  `subjectId` varchar(10) NOT NULL,
  `courseNumber` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `numOfCredits` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`courseId`, `subjectId`, `courseNumber`, `title`, `numOfCredits`) VALUES
(11111, 'CSCI', 1301, 'Intro to Java I', 4),
(11112, 'CSCI', 1302, 'Intro to Java II', 3),
(11113, 'CSCI', 4720, 'Database Systems', 3),
(11114, 'CSCI', 4750, 'Rapid Java Application', 3),
(11115, 'MATH', 2750, 'Calculus I', 5),
(11116, 'MATH', 3750, 'Calculus II', 5),
(11117, 'EDUC', 1111, 'Reading', 3),
(11118, 'ITEC', 1344, 'Database Administration', 3);

-- --------------------------------------------------------

--
-- Table structure for table `enrollment`
--

CREATE TABLE IF NOT EXISTS `enrollment` (
  `ssn` int(11) NOT NULL,
  `courseId` int(11) DEFAULT NULL,
  `dateRegistered` date DEFAULT NULL,
  `grade` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enrollment`
--

INSERT INTO `enrollment` (`ssn`, `courseId`, `dateRegistered`, `grade`) VALUES
(444111110, 11111, '2015-05-13', 'A'),
(444111110, 11112, '2015-05-05', 'B'),
(444111110, 11113, '2015-05-01', 'C');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `ssn` int(11) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `middleName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `birthDate` date NOT NULL,
  `street` varchar(50) NOT NULL,
  `zipCode` int(11) NOT NULL,
  `deptID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ssn`, `firstName`, `middleName`, `lastName`, `phone`, `birthDate`, `street`, `zipCode`, `deptID`) VALUES
(444111110, 'Jacob', 'R', 'Smith', '9129219434', '1985-04-09', '99 Kingston Street ', 31435, 'BIOL'),
(444111111, 'John', 'K', 'Stevenson', '9129456434', '1969-04-29', '100 Main Street', 31411, 'BIOL'),
(444111112, 'George', 'K', 'Smith', '9129213454', '1974-10-10', '1200 Abercorn St.', 31419, 'CS');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`courseId`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ssn`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

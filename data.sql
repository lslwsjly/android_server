CREATE DATABASE  IF NOT EXISTS `software_work` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `software_work`;
-- MySQL dump 10.13  Distrib 5.6.17, for osx10.6 (i386)
--
-- Host: localhost    Database: software_work
-- ------------------------------------------------------
-- Server version	5.1.63

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `activity`
--

DROP TABLE IF EXISTS `activity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activity` (
  `idactivity` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL COMMENT '活动标题',
  `person` int(11) NOT NULL COMMENT '发布者id',
  `acttime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `starttime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '活动开始时间',
  `endtime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '活动结束时间',
  `applytime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '报名截止时间',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '当前活动状态',
  `applynum` int(11) NOT NULL DEFAULT '0' COMMENT '申请人数',
  `numlimit` int(11) NOT NULL COMMENT '人员参与数上限',
  `address` varchar(450) NOT NULL COMMENT '活动详细地址',
  `fee` int(11) NOT NULL COMMENT '活动人均费用',
  `benefit` varchar(450) NOT NULL,
  `feature` varchar(450) NOT NULL,
  `description` varchar(450) NOT NULL COMMENT '活动描述',
  `type` int(11) NOT NULL COMMENT '活动类别id',
  `collectnum` int(11) NOT NULL DEFAULT '0' COMMENT '活动收藏数',
  `schoollimit` int(11) NOT NULL COMMENT '学校限制，0为不限制',
  `gradelimit` int(11) NOT NULL COMMENT '年级限制，0为不限制',
  `genderlimit` int(11) NOT NULL COMMENT '性别限制，0为不限制',
  `contact` varchar(200) NOT NULL COMMENT '联系方式',
  `hotvalue` float NOT NULL DEFAULT '0' COMMENT '热度值',
  `watchnum` int(11) NOT NULL DEFAULT '0',
  `image` mediumtext NOT NULL COMMENT '图片，用｜间隔',
  PRIMARY KEY (`idactivity`),
  KEY `person` (`person`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activity`
--

LOCK TABLES `activity` WRITE;
/*!40000 ALTER TABLE `activity` DISABLE KEYS */;
INSERT INTO `activity` VALUES (1,'23333',1,'2014-11-10 15:41:50','2014-11-09 16:00:00','2014-11-09 16:00:00','2014-11-09 16:00:00',1,1,10,'222',0,'222','222','description',2,1,2,3,1,'222',0,8,'head');
/*!40000 ALTER TABLE `activity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `activitytype`
--

DROP TABLE IF EXISTS `activitytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activitytype` (
  `idtype` int(11) NOT NULL AUTO_INCREMENT,
  `typename` varchar(45) NOT NULL COMMENT '类型名称',
  PRIMARY KEY (`idtype`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activitytype`
--

LOCK TABLES `activitytype` WRITE;
/*!40000 ALTER TABLE `activitytype` DISABLE KEYS */;
/*!40000 ALTER TABLE `activitytype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apply`
--

DROP TABLE IF EXISTS `apply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `apply` (
  `idapply` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity` int(11) NOT NULL COMMENT '活动id',
  `person` int(11) NOT NULL COMMENT '申请人id',
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '申请时间',
  `status` int(11) NOT NULL DEFAULT '2' COMMENT '申请状态，2的时候为未处理，1为通过，0为拒绝',
  PRIMARY KEY (`idapply`),
  KEY `activity` (`activity`),
  KEY `candidate` (`person`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apply`
--

LOCK TABLES `apply` WRITE;
/*!40000 ALTER TABLE `apply` DISABLE KEYS */;
INSERT INTO `apply` VALUES (2,1,1,'2014-11-24 12:49:38',2);
/*!40000 ALTER TABLE `apply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collect`
--

DROP TABLE IF EXISTS `collect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collect` (
  `idcollect` int(11) NOT NULL AUTO_INCREMENT,
  `person` int(11) NOT NULL COMMENT '收藏人',
  `activity` int(11) NOT NULL COMMENT '活动id',
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idcollect`),
  KEY `person` (`person`),
  KEY `activity` (`activity`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collect`
--

LOCK TABLES `collect` WRITE;
/*!40000 ALTER TABLE `collect` DISABLE KEYS */;
INSERT INTO `collect` VALUES (2,1,1,'2014-11-29 08:40:10');
/*!40000 ALTER TABLE `collect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data_scope`
--

DROP TABLE IF EXISTS `data_scope`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_scope` (
  `iddata_scope` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键名称',
  `name` varchar(45) NOT NULL COMMENT '数据域名称',
  PRIMARY KEY (`iddata_scope`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_scope`
--

LOCK TABLES `data_scope` WRITE;
/*!40000 ALTER TABLE `data_scope` DISABLE KEYS */;
/*!40000 ALTER TABLE `data_scope` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message` (
  `idmessage` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `activity` int(11) NOT NULL COMMENT '活动id',
  `content` varchar(100) NOT NULL COMMENT '留言内容',
  `person` int(11) NOT NULL COMMENT '留言人id',
  `msgtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idmessage`),
  KEY `activity` (`activity`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` VALUES (1,1,'123123',1,'2014-11-03 15:39:41'),(2,1,'1231311',4,'2014-11-04 05:59:34'),(3,1,'23333',1,'2014-11-23 09:05:00');
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `privilege`
--

DROP TABLE IF EXISTS `privilege`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `privilege` (
  `idprivilege` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '权限名称',
  PRIMARY KEY (`idprivilege`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `privilege`
--

LOCK TABLES `privilege` WRITE;
/*!40000 ALTER TABLE `privilege` DISABLE KEYS */;
INSERT INTO `privilege` VALUES (1,'浏览权限'),(2,'发布权限'),(3,'活动参与权限'),(4,'活动管理'),(5,'用户管理');
/*!40000 ALTER TABLE `privilege` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `idrole` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name` varchar(45) NOT NULL COMMENT '角色名称',
  PRIMARY KEY (`idrole`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'未完善信息用户'),(2,'信息完善用户'),(3,'管理员');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_privilege`
--

DROP TABLE IF EXISTS `role_privilege`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_privilege` (
  `idrole_privilege` int(11) NOT NULL AUTO_INCREMENT,
  `role` int(11) NOT NULL COMMENT '角色id',
  `privilege` int(11) NOT NULL COMMENT '权限id',
  `scope` int(11) NOT NULL COMMENT '数据域',
  PRIMARY KEY (`idrole_privilege`),
  KEY `role` (`role`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_privilege`
--

LOCK TABLES `role_privilege` WRITE;
/*!40000 ALTER TABLE `role_privilege` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_privilege` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `university`
--

DROP TABLE IF EXISTS `university`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `university` (
  `iduniversity` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(45) NOT NULL COMMENT ' 大学名称',
  PRIMARY KEY (`iduniversity`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `university`
--

LOCK TABLES `university` WRITE;
/*!40000 ALTER TABLE `university` DISABLE KEYS */;
/*!40000 ALTER TABLE `university` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `uid` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `mail` varchar(45) NOT NULL COMMENT '邮箱',
  `pwd` varchar(45) NOT NULL COMMENT '密码',
  `phone` varchar(45) NOT NULL COMMENT '联系电话',
  `realname` varchar(45) NOT NULL COMMENT '真实姓名',
  `nickname` varchar(45) NOT NULL COMMENT '昵称',
  `interest` varchar(45) NOT NULL COMMENT '以逗号分割的兴趣id',
  `gender` int(11) NOT NULL DEFAULT '0' COMMENT '性别，2女，1男',
  `school` int(11) NOT NULL DEFAULT '0' COMMENT '学校',
  `department` varchar(45) NOT NULL COMMENT '院系',
  `grade` int(11) NOT NULL DEFAULT '0' COMMENT '年级',
  `stunum` varchar(45) NOT NULL COMMENT '学号',
  `headimg` varchar(100) NOT NULL COMMENT '头像',
  `role` int(11) NOT NULL DEFAULT '1' COMMENT '角色',
  PRIMARY KEY (`uid`),
  UNIQUE KEY `uid_UNIQUE` (`uid`),
  UNIQUE KEY `mail_UNIQUE` (`mail`),
  UNIQUE KEY `nickname_UNIQUE` (`nickname`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'2@2.com','123','123','real','name','2,3',1,2,'123',2,'','head',2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-11-29 23:30:00

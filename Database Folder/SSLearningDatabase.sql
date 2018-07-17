-- MySQL dump 10.13  Distrib 5.7.22, for macos10.13 (x86_64)
--
-- Host: localhost    Database: SSLearning
-- ------------------------------------------------------
-- Server version	5.7.22

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
-- Table structure for table `AdviceInfoList`
--

DROP TABLE IF EXISTS `AdviceInfoList`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AdviceInfoList` (
  `adviceId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `adviceSendTime` datetime DEFAULT NULL,
  `adviceInfo` varchar(100) DEFAULT NULL,
  `adviceReviewStatus` tinyint(1) DEFAULT NULL,
  `adviceReviewAdminId` int(11) DEFAULT NULL,
  PRIMARY KEY (`adviceId`),
  KEY `userId` (`userId`),
  KEY `adviceReviewAdminId` (`adviceReviewAdminId`),
  CONSTRAINT `adviceinfolist_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`),
  CONSTRAINT `adviceinfolist_ibfk_2` FOREIGN KEY (`adviceReviewAdminId`) REFERENCES `User` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AdviceInfoList`
--

LOCK TABLES `AdviceInfoList` WRITE;
/*!40000 ALTER TABLE `AdviceInfoList` DISABLE KEYS */;
/*!40000 ALTER TABLE `AdviceInfoList` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CarouselMap`
--

DROP TABLE IF EXISTS `CarouselMap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CarouselMap` (
  `carouselId` int(11) NOT NULL AUTO_INCREMENT,
  `carouselInstruction` varchar(40) DEFAULT NULL,
  `carouselImgUrl` varchar(40) DEFAULT NULL,
  `carouselLinkUrl` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`carouselId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CarouselMap`
--

LOCK TABLES `CarouselMap` WRITE;
/*!40000 ALTER TABLE `CarouselMap` DISABLE KEYS */;
/*!40000 ALTER TABLE `CarouselMap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DownloadRecording`
--

DROP TABLE IF EXISTS `DownloadRecording`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DownloadRecording` (
  `downloadRecordingId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `courseType` varchar(10) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `downloadRecordingTime` datetime DEFAULT NULL,
  PRIMARY KEY (`downloadRecordingId`),
  KEY `userId` (`userId`),
  CONSTRAINT `downloadrecording_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DownloadRecording`
--

LOCK TABLES `DownloadRecording` WRITE;
/*!40000 ALTER TABLE `DownloadRecording` DISABLE KEYS */;
/*!40000 ALTER TABLE `DownloadRecording` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EvaluationForm`
--

DROP TABLE IF EXISTS `EvaluationForm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EvaluationForm` (
  `evaluationId` int(11) NOT NULL AUTO_INCREMENT,
  `courseType` varchar(10) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `evaluationLevel` int(11) DEFAULT NULL,
  PRIMARY KEY (`evaluationId`),
  KEY `userId` (`userId`),
  CONSTRAINT `evaluationform_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EvaluationForm`
--

LOCK TABLES `EvaluationForm` WRITE;
/*!40000 ALTER TABLE `EvaluationForm` DISABLE KEYS */;
/*!40000 ALTER TABLE `EvaluationForm` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HistoryRecording`
--

DROP TABLE IF EXISTS `HistoryRecording`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `HistoryRecording` (
  `historyRecordingId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `courseType` varchar(10) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `recentRecordingTime` datetime DEFAULT NULL,
  `viewTimes` int(11) DEFAULT NULL,
  PRIMARY KEY (`historyRecordingId`),
  KEY `userId` (`userId`),
  CONSTRAINT `historyrecording_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HistoryRecording`
--

LOCK TABLES `HistoryRecording` WRITE;
/*!40000 ALTER TABLE `HistoryRecording` DISABLE KEYS */;
/*!40000 ALTER TABLE `HistoryRecording` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LanguageType`
--

DROP TABLE IF EXISTS `LanguageType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LanguageType` (
  `languageTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `languageName` varchar(10) DEFAULT NULL,
  `languageIconUrl` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`languageTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LanguageType`
--

LOCK TABLES `LanguageType` WRITE;
/*!40000 ALTER TABLE `LanguageType` DISABLE KEYS */;
/*!40000 ALTER TABLE `LanguageType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ListeningCourse`
--

DROP TABLE IF EXISTS `ListeningCourse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ListeningCourse` (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `languageTypeId` int(11) DEFAULT NULL,
  `rateTypeId` int(11) DEFAULT NULL,
  `courseName` varchar(40) DEFAULT NULL,
  `courseChineseContent` varchar(500) DEFAULT NULL,
  `courseEnglishContent` varchar(500) DEFAULT NULL,
  `courseResourceUrl` varchar(40) DEFAULT NULL,
  `downloadNum` int(11) DEFAULT NULL,
  `instructionImgUrl` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  KEY `languageTypeId` (`languageTypeId`),
  KEY `rateTypeId` (`rateTypeId`),
  CONSTRAINT `listeningcourse_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `LanguageType` (`languageTypeId`),
  CONSTRAINT `listeningcourse_ibfk_2` FOREIGN KEY (`rateTypeId`) REFERENCES `RateType` (`rateTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ListeningCourse`
--

LOCK TABLES `ListeningCourse` WRITE;
/*!40000 ALTER TABLE `ListeningCourse` DISABLE KEYS */;
/*!40000 ALTER TABLE `ListeningCourse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OralCourse`
--

DROP TABLE IF EXISTS `OralCourse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OralCourse` (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `languageTypeId` int(11) DEFAULT NULL,
  `rateTypeId` int(11) DEFAULT NULL,
  `courseName` varchar(40) DEFAULT NULL,
  `courseChineseContent` varchar(500) DEFAULT NULL,
  `courseEnglishContent` varchar(500) DEFAULT NULL,
  `downloadNum` int(11) DEFAULT NULL,
  `instructionImgUrl` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  KEY `languageTypeId` (`languageTypeId`),
  KEY `rateTypeId` (`rateTypeId`),
  CONSTRAINT `oralcourse_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `LanguageType` (`languageTypeId`),
  CONSTRAINT `oralcourse_ibfk_2` FOREIGN KEY (`rateTypeId`) REFERENCES `RateType` (`rateTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OralCourse`
--

LOCK TABLES `OralCourse` WRITE;
/*!40000 ALTER TABLE `OralCourse` DISABLE KEYS */;
/*!40000 ALTER TABLE `OralCourse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `OralCourseScore`
--

DROP TABLE IF EXISTS `OralCourseScore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `OralCourseScore` (
  `oralCourseScoreId` int(11) DEFAULT NULL,
  `courseType` varchar(10) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `oralScore` int(11) DEFAULT NULL,
  KEY `userId` (`userId`),
  CONSTRAINT `oralcoursescore_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OralCourseScore`
--

LOCK TABLES `OralCourseScore` WRITE;
/*!40000 ALTER TABLE `OralCourseScore` DISABLE KEYS */;
/*!40000 ALTER TABLE `OralCourseScore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Question`
--

DROP TABLE IF EXISTS `Question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Question` (
  `questionId` int(11) NOT NULL AUTO_INCREMENT,
  `courseType` varchar(10) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `questionConent` varchar(100) DEFAULT NULL,
  `answerA` varchar(100) DEFAULT NULL,
  `answerB` varchar(100) DEFAULT NULL,
  `answerC` varchar(100) DEFAULT NULL,
  `answerD` varchar(100) DEFAULT NULL,
  `answerReal` int(11) DEFAULT NULL,
  `answerReason` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`questionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Question`
--

LOCK TABLES `Question` WRITE;
/*!40000 ALTER TABLE `Question` DISABLE KEYS */;
/*!40000 ALTER TABLE `Question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `RateType`
--

DROP TABLE IF EXISTS `RateType`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `RateType` (
  `rateTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `rateName` varchar(10) DEFAULT NULL,
  `rateIconUrl` varchar(40) DEFAULT NULL,
  `languageTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`rateTypeId`),
  KEY `languageTypeId` (`languageTypeId`),
  CONSTRAINT `ratetype_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `LanguageType` (`languageTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RateType`
--

LOCK TABLES `RateType` WRITE;
/*!40000 ALTER TABLE `RateType` DISABLE KEYS */;
/*!40000 ALTER TABLE `RateType` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ReadingCourse`
--

DROP TABLE IF EXISTS `ReadingCourse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ReadingCourse` (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `languageTypeId` int(11) DEFAULT NULL,
  `rateTypeId` int(11) DEFAULT NULL,
  `courseName` varchar(40) DEFAULT NULL,
  `courseChineseContent` varchar(500) DEFAULT NULL,
  `courseEnglishContent` varchar(500) DEFAULT NULL,
  `downloadNum` int(11) DEFAULT NULL,
  `instructionImgUrl` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  KEY `languageTypeId` (`languageTypeId`),
  KEY `rateTypeId` (`rateTypeId`),
  CONSTRAINT `readingcourse_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `LanguageType` (`languageTypeId`),
  CONSTRAINT `readingcourse_ibfk_2` FOREIGN KEY (`rateTypeId`) REFERENCES `RateType` (`rateTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ReadingCourse`
--

LOCK TABLES `ReadingCourse` WRITE;
/*!40000 ALTER TABLE `ReadingCourse` DISABLE KEYS */;
/*!40000 ALTER TABLE `ReadingCourse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SignInRecording`
--

DROP TABLE IF EXISTS `SignInRecording`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SignInRecording` (
  `signInId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `totalTimes` int(11) DEFAULT NULL,
  `recentMark` datetime DEFAULT NULL,
  PRIMARY KEY (`signInId`),
  KEY `userId` (`userId`),
  CONSTRAINT `signinrecording_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SignInRecording`
--

LOCK TABLES `SignInRecording` WRITE;
/*!40000 ALTER TABLE `SignInRecording` DISABLE KEYS */;
/*!40000 ALTER TABLE `SignInRecording` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SimulatedTest`
--

DROP TABLE IF EXISTS `SimulatedTest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SimulatedTest` (
  `simulatedTestId` int(11) NOT NULL AUTO_INCREMENT,
  `languageTypeId` int(11) DEFAULT NULL,
  `rateTypeId` int(11) DEFAULT NULL,
  `testName` varchar(20) DEFAULT NULL,
  `instructionImgUrl` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`simulatedTestId`),
  KEY `languageTypeId` (`languageTypeId`),
  KEY `rateTypeId` (`rateTypeId`),
  CONSTRAINT `simulatedtest_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `LanguageType` (`languageTypeId`),
  CONSTRAINT `simulatedtest_ibfk_2` FOREIGN KEY (`rateTypeId`) REFERENCES `RateType` (`rateTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SimulatedTest`
--

LOCK TABLES `SimulatedTest` WRITE;
/*!40000 ALTER TABLE `SimulatedTest` DISABLE KEYS */;
/*!40000 ALTER TABLE `SimulatedTest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SubscriptionRecording`
--

DROP TABLE IF EXISTS `SubscriptionRecording`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SubscriptionRecording` (
  `subscriptionRecordingId` int(11) NOT NULL AUTO_INCREMENT,
  `subscriptionTime` datetime DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `courseType` varchar(10) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  PRIMARY KEY (`subscriptionRecordingId`),
  KEY `userId` (`userId`),
  CONSTRAINT `subscriptionrecording_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SubscriptionRecording`
--

LOCK TABLES `SubscriptionRecording` WRITE;
/*!40000 ALTER TABLE `SubscriptionRecording` DISABLE KEYS */;
/*!40000 ALTER TABLE `SubscriptionRecording` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TestQuestion`
--

DROP TABLE IF EXISTS `TestQuestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TestQuestion` (
  `testQuestionId` int(11) NOT NULL AUTO_INCREMENT,
  `testQuestionName` varchar(50) DEFAULT NULL,
  `simulatedTestId` int(11) DEFAULT NULL,
  `courseType` varchar(10) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  PRIMARY KEY (`testQuestionId`),
  KEY `simulatedTestId` (`simulatedTestId`),
  CONSTRAINT `testquestion_ibfk_1` FOREIGN KEY (`simulatedTestId`) REFERENCES `SimulatedTest` (`simulatedTestId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TestQuestion`
--

LOCK TABLES `TestQuestion` WRITE;
/*!40000 ALTER TABLE `TestQuestion` DISABLE KEYS */;
/*!40000 ALTER TABLE `TestQuestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TestQuestionResult`
--

DROP TABLE IF EXISTS `TestQuestionResult`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TestQuestionResult` (
  `testQuestionResultId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `simulatedTestId` int(11) DEFAULT NULL,
  `resultScore` int(11) DEFAULT NULL,
  PRIMARY KEY (`testQuestionResultId`),
  KEY `userId` (`userId`),
  KEY `simulatedTestId` (`simulatedTestId`),
  CONSTRAINT `testquestionresult_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `User` (`userId`),
  CONSTRAINT `testquestionresult_ibfk_2` FOREIGN KEY (`simulatedTestId`) REFERENCES `SimulatedTest` (`simulatedTestId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TestQuestionResult`
--

LOCK TABLES `TestQuestionResult` WRITE;
/*!40000 ALTER TABLE `TestQuestionResult` DISABLE KEYS */;
/*!40000 ALTER TABLE `TestQuestionResult` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userSex` char(2) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `userPassword` varchar(64) NOT NULL,
  `userAvatarUrl` varchar(300) NOT NULL,
  `userPhoneNumber` char(11) NOT NULL,
  `userPermission` int(11) NOT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `userPhoneNumber` (`userPhoneNumber`),
  UNIQUE KEY `userPhoneNumber_2` (`userPhoneNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'男','Jack','481f6cc0511143ccdd7e2d1b1b94faf0a700a8b49cd13922a70b5ae28acaa8c5','www.baidu.com','13998434328',1),(2,'男','Daming','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcfb6747-5ef4-47fe-8e7e-ff1b4b6e05c615842685420Avatar.png','15842685420',0),(3,'女','Amy','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/616b55f8-8df9-49ac-9247-a1bd1780391918041168030Avatar.png','18041168030',0),(4,'男','Sam','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/c6cbcce3-790f-4fdb-962a-4df4470ef58818041168031Avatar.png','18041168031',0),(5,'男','辛俊桥','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/8d1c8fca-7af1-4457-bfe7-2ad92e6901ef18041168032Avatar.png','18041168032',0),(6,'男','苏凯','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fcdcc255-d591-4291-ae86-da0ae493abef18041168033Avatar.png','18041168033',0),(7,'男','孙浩','8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92','/Users/wangzhe/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/SSLearningTeam/AvatarImgs/fca86384-b581-4cf7-8242-2a75eddeeb4918041168034Avatar.png','18041168034',0);
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

-- Dump completed on 2018-07-17 23:37:18

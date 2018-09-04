/*
Navicat MySQL Data Transfer

Source Server         : SSLearning
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : sslearning

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2018-09-04 16:40:26
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `adviceinfolist`
-- ----------------------------
DROP TABLE IF EXISTS `adviceinfolist`;
CREATE TABLE `adviceinfolist` (
  `adviceId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `adviceSendTime` datetime DEFAULT NULL,
  `adviceInfo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`adviceId`),
  KEY `userId` (`userId`),
  CONSTRAINT `adviceinfolist_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of adviceinfolist
-- ----------------------------
INSERT INTO adviceinfolist VALUES ('1', '3', '2018-09-01 01:34:01', '日语课程有待加强');
INSERT INTO adviceinfolist VALUES ('2', '3', '2018-09-02 01:34:23', '口语课程最好能多点');
INSERT INTO adviceinfolist VALUES ('3', '2', '2018-09-02 01:34:26', '听力课程音质不清楚');
INSERT INTO adviceinfolist VALUES ('4', '2', '2018-09-03 01:34:30', '张老师的日语课有点拖拉');
INSERT INTO adviceinfolist VALUES ('5', '3', '2018-09-03 01:34:33', '车老师的口语课发音不标准');
INSERT INTO adviceinfolist VALUES ('6', '2', '2018-09-04 01:34:36', '辛老师的口语课有点大舌头');
INSERT INTO adviceinfolist VALUES ('7', '3', '2018-09-04 01:34:40', '辛老师的口语课真是有点大舌头');
INSERT INTO adviceinfolist VALUES ('8', '4', '2018-09-04 01:34:50', '建议把辛老师的课程去掉');
INSERT INTO adviceinfolist VALUES ('9', '5', '2018-09-04 01:34:54', '辛老师真的不行');
INSERT INTO adviceinfolist VALUES ('10', '4', '2018-09-04 01:34:57', '可以多点孟加拉语de课程吗');

-- ----------------------------
-- Table structure for `carouselmap`
-- ----------------------------
DROP TABLE IF EXISTS `carouselmap`;
CREATE TABLE `carouselmap` (
  `carouselId` int(11) NOT NULL AUTO_INCREMENT,
  `carouselInstruction` varchar(40) DEFAULT NULL,
  `carouselImgUrl` varchar(300) DEFAULT NULL,
  `carouselLinkUrl` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`carouselId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carouselmap
-- ----------------------------
INSERT INTO carouselmap VALUES ('1', '英语发音30天', '\\SSLearningTeam\\CarouselMaps\\5bdf3f5c-1786-4b13-9423-5c4b944e5212_carouselMap1.png', 'www.baidu.com');
INSERT INTO carouselmap VALUES ('2', '美音速成', '\\SSLearningTeam\\CarouselMaps\\5bdf3f5c-1786-4b13-9423-5c4b944e5212_carouselMap2.png', 'www.baidu.com');
INSERT INTO carouselmap VALUES ('3', '跟我练口语 ', '\\SSLearningTeam\\CarouselMaps\\5bdf3f5c-1786-4b13-9423-5c4b944e5212_carouselMap3.png', 'www.baidu.com');
INSERT INTO carouselmap VALUES ('4', '英语流利说', '\\SSLearningTeam\\CarouselMaps\\5bdf3f5c-1786-4b13-9423-5c4b944e5212_carouselMap4.png', 'www.baidu.com');
INSERT INTO carouselmap VALUES ('5', '标准发音', '\\SSLearningTeam\\CarouselMaps\\5bdf3f5c-1786-4b13-9423-5c4b944e5212_carouselMap5.png', 'www.baidu.com');

-- ----------------------------
-- Table structure for `downloadrecording`
-- ----------------------------
DROP TABLE IF EXISTS `downloadrecording`;
CREATE TABLE `downloadrecording` (
  `downloadRecordingId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `courseType` varchar(30) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `downloadRecordingTime` datetime DEFAULT NULL,
  PRIMARY KEY (`downloadRecordingId`),
  KEY `userId` (`userId`),
  CONSTRAINT `downloadrecording_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of downloadrecording
-- ----------------------------
INSERT INTO downloadrecording VALUES ('1', '3', 'listeningcourse', '1', '2018-08-26 19:25:23');
INSERT INTO downloadrecording VALUES ('2', '2', 'listeningcourse', '1', '2018-08-27 19:25:23');
INSERT INTO downloadrecording VALUES ('3', '2', 'listeningcourse', '2', '2018-08-27 19:25:23');
INSERT INTO downloadrecording VALUES ('4', '3', 'listeningcourse', '3', '2018-08-27 19:25:23');
INSERT INTO downloadrecording VALUES ('5', '4', 'listeningcourse', '3', '2018-08-28 22:22:23');
INSERT INTO downloadrecording VALUES ('6', '5', 'listeningcourse', '6', '2018-08-29 21:22:23');
INSERT INTO downloadrecording VALUES ('7', '6', 'oralcourse', '1', '2018-08-30 19:25:23');
INSERT INTO downloadrecording VALUES ('8', '5', 'oralcourse', '2', '2018-08-30 19:25:23');
INSERT INTO downloadrecording VALUES ('10', '4', 'oralcourse', '2', '2018-08-31 19:25:23');
INSERT INTO downloadrecording VALUES ('11', '2', 'oralcourse', '5', '2018-08-31 19:25:23');
INSERT INTO downloadrecording VALUES ('12', '2', 'readingcourse', '2', '2018-08-31 19:25:23');
INSERT INTO downloadrecording VALUES ('13', '3', 'readingcourse', '4', '2018-08-31 19:25:23');

-- ----------------------------
-- Table structure for `evaluationform`
-- ----------------------------
DROP TABLE IF EXISTS `evaluationform`;
CREATE TABLE `evaluationform` (
  `evaluationId` int(11) NOT NULL AUTO_INCREMENT,
  `courseType` varchar(20) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `evaluationLevel` int(11) DEFAULT NULL,
  PRIMARY KEY (`evaluationId`),
  KEY `userId` (`userId`),
  CONSTRAINT `evaluationform_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluationform
-- ----------------------------
INSERT INTO evaluationform VALUES ('1', 'listeningcourse', '1', '2', '2');
INSERT INTO evaluationform VALUES ('2', 'listeningcourse', '1', '3', '2');
INSERT INTO evaluationform VALUES ('3', 'listeningcourse', '1', '4', '2');
INSERT INTO evaluationform VALUES ('4', 'listeningcourse', '1', '5', '4');
INSERT INTO evaluationform VALUES ('5', 'listeningcourse', '2', '3', '4');
INSERT INTO evaluationform VALUES ('6', 'listeningcourse', '2', '4', '4');
INSERT INTO evaluationform VALUES ('7', 'listeningcourse', '3', '2', '5');
INSERT INTO evaluationform VALUES ('8', 'listeningcourse', '3', '3', '4');
INSERT INTO evaluationform VALUES ('9', 'listeningcourse', '3', '4', '3');
INSERT INTO evaluationform VALUES ('10', 'listeningcourse', '4', '4', '3');
INSERT INTO evaluationform VALUES ('11', 'listeningcourse', '5', '2', '3');
INSERT INTO evaluationform VALUES ('12', 'listeningcourse', '5', '5', '2');
INSERT INTO evaluationform VALUES ('13', 'listeningcourse', '6', '2', '2');
INSERT INTO evaluationform VALUES ('14', 'listeningcourse', '6', '6', '1');
INSERT INTO evaluationform VALUES ('15', 'oralcourse', '1', '3', '2');
INSERT INTO evaluationform VALUES ('16', 'oralcourse', '1', '4', '3');
INSERT INTO evaluationform VALUES ('17', 'oralcourse', '2', '3', '4');
INSERT INTO evaluationform VALUES ('18', 'oralcourse', '2', '4', '3');
INSERT INTO evaluationform VALUES ('19', 'oralcourse', '2', '5', '4');
INSERT INTO evaluationform VALUES ('20', 'oralcourse', '3', '2', '5');
INSERT INTO evaluationform VALUES ('21', 'oralcourse', '4', '6', '3');
INSERT INTO evaluationform VALUES ('22', 'oralcourse', '5', '3', '2');
INSERT INTO evaluationform VALUES ('23', 'oralcourse', '5', '2', '1');
INSERT INTO evaluationform VALUES ('24', 'oralcourse', '5', '5', '4');
INSERT INTO evaluationform VALUES ('25', 'readingcourse', '1', '3', '2');
INSERT INTO evaluationform VALUES ('26', 'readingcourse', '2', '2', '4');
INSERT INTO evaluationform VALUES ('27', 'readingcourse', '2', '3', '5');
INSERT INTO evaluationform VALUES ('28', 'readingcourse', '2', '4', '5');
INSERT INTO evaluationform VALUES ('29', 'readingcourse', '3', '3', '3');
INSERT INTO evaluationform VALUES ('30', 'readingcourse', '3', '4', '2');
INSERT INTO evaluationform VALUES ('31', 'readingcourse', '3', '5', '3');
INSERT INTO evaluationform VALUES ('32', 'readingcourse', '4', '5', '2');
INSERT INTO evaluationform VALUES ('33', 'readingcourse', '4', '6', '5');
INSERT INTO evaluationform VALUES ('34', 'readingcourse', '5', '2', '5');

-- ----------------------------
-- Table structure for `historyrecording`
-- ----------------------------
DROP TABLE IF EXISTS `historyrecording`;
CREATE TABLE `historyrecording` (
  `historyRecordingId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `courseType` varchar(20) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `recentRecordingTime` datetime DEFAULT NULL,
  `viewTimes` int(11) DEFAULT NULL,
  PRIMARY KEY (`historyRecordingId`),
  KEY `userId` (`userId`),
  CONSTRAINT `historyrecording_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of historyrecording
-- ----------------------------
INSERT INTO historyrecording VALUES ('1', '2', 'oralcourse', '2', '2018-09-01 09:50:30', '3');
INSERT INTO historyrecording VALUES ('2', '2', 'listeningcourse', '1', '2018-09-01 09:50:30', '2');
INSERT INTO historyrecording VALUES ('3', '3', 'listeningcourse', '2', '2018-09-01 09:50:54', '1');
INSERT INTO historyrecording VALUES ('4', '3', 'readingcourse', '2', '2018-09-02 09:52:01', '2');
INSERT INTO historyrecording VALUES ('5', '3', 'listeningcourse', '3', '2018-09-03 09:50:30', '7');
INSERT INTO historyrecording VALUES ('6', '4', 'listeningcourse', '3', '2018-09-03 09:50:30', '6');
INSERT INTO historyrecording VALUES ('7', '4', 'readingcourse', '1', '2018-09-04 09:50:30', '5');
INSERT INTO historyrecording VALUES ('8', '4', 'oralcourse', '5', '2018-09-04 09:50:30', '2');
INSERT INTO historyrecording VALUES ('9', '5', 'readingcourse', '3', '2018-09-04 09:50:30', '1');
INSERT INTO historyrecording VALUES ('10', '6', 'listeningcourse', '2', '2018-09-04 09:50:30', '3');
INSERT INTO historyrecording VALUES ('11', '6', 'oralcourse', '1', '2018-09-05 09:50:30', '4');

-- ----------------------------
-- Table structure for `languagetype`
-- ----------------------------
DROP TABLE IF EXISTS `languagetype`;
CREATE TABLE `languagetype` (
  `languageTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `languageName` varchar(10) DEFAULT NULL,
  `languageIconUrl` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`languageTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of languagetype
-- ----------------------------
INSERT INTO languagetype VALUES ('1', '英语', '\\SSLearningTeam\\Languages\\2fe400c5-94fe-48e7-b01c-4531a9228dbe_english.png');
INSERT INTO languagetype VALUES ('2', '日语', '\\SSLearningTeam\\Languages\\2fe400c5-94fe-48e7-b01c-4531a9228dbe_fa.png');
INSERT INTO languagetype VALUES ('3', '法语', '\\SSLearningTeam\\Languages\\2fe400c5-94fe-48e7-b01c-4531a9228dbe_japanese.png');
INSERT INTO languagetype VALUES ('4', '英文', '\\SSLearningTeam\\Languages\\2fe400c5-94fe-48e7-b01c-4531a9228dbe_fa.png');
INSERT INTO languagetype VALUES ('5', '中文', '/SSLearningTeam/Languages/987a7e8a-7815-4b46-82ab-c870eeaf7510_language.png');

-- ----------------------------
-- Table structure for `listeningcourse`
-- ----------------------------
DROP TABLE IF EXISTS `listeningcourse`;
CREATE TABLE `listeningcourse` (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `languageTypeId` int(11) DEFAULT NULL,
  `rateTypeId` int(11) DEFAULT NULL,
  `courseName` varchar(40) DEFAULT NULL,
  `courseChineseContent` varchar(500) DEFAULT NULL,
  `courseEnglishContent` varchar(500) DEFAULT NULL,
  `courseResourceUrl` varchar(300) DEFAULT NULL,
  `downloadNum` int(11) DEFAULT NULL,
  `instructionImgUrl` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  KEY `languageTypeId` (`languageTypeId`),
  KEY `rateTypeId` (`rateTypeId`),
  CONSTRAINT `listeningcourse_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `languagetype` (`languageTypeId`),
  CONSTRAINT `listeningcourse_ibfk_2` FOREIGN KEY (`rateTypeId`) REFERENCES `ratetype` (`rateTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of listeningcourse
-- ----------------------------
INSERT INTO listeningcourse VALUES ('1', '1', '1', '英语四级听力课程1', '英语四级听力课程1。英语四级听力课程1。英语四级听力课程1。英语四级听力课程1。英语四级听力课程1。英语四级听力课程1。英语四级听力课程1。英语四级听力课程1。英语四级听力课程1。英语四级听力课程1。', 'yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.', '\\SSLearningTeam\\ListeningCourseResource\\521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9_listeningresource_1.mp3', '2', '\\SSLearningTeam\\ListeningCourseResource\\10520d9e-06c2-46bc-a218-2d42382ea384_listening1.png');
INSERT INTO listeningcourse VALUES ('2', '1', '1', '英语四级听力课程2', '英语四级听力课程2。英语四级听力课程2。英语四级听力课程2。英语四级听力课程2。英语四级听力课程2。英语四级听力课程2。英语四级听力课程2。英语四级听力课程2。英语四级听力课程2。英语四级听力课程2。', 'yingyusijikecheng2.yingyusijikecheng2.yingyusijikecheng2.yingyusijikecheng2.yingyusijikecheng2.yingyusijikecheng2.yingyusijikecheng2.yingyusijikecheng2.yingyusijikecheng2.yingyusijikecheng2.', '\\SSLearningTeam\\ListeningCourseResource\\521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9_listeningresource_2.mp3', '1', '\\SSLearningTeam\\ListeningCourseResource\\10520d9e-06c2-46bc-a218-2d42382ea384_listening2.png');
INSERT INTO listeningcourse VALUES ('3', '1', '2', '英语六级听力课程1', '英语六级听力课程1。英语六级听力课程1。英语六级听力课程1。英语六级听力课程1。英语六级听力课程1。英语六级听力课程1。英语六级听力课程1。英语六级听力课程1。英语六级听力课程1。英语六级听力课程1。', 'yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.', '\\SSLearningTeam\\ListeningCourseResource\\521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9_listeningresource_3.mp3', '3', '\\SSLearningTeam\\ListeningCourseResource\\10520d9e-06c2-46bc-a218-2d42382ea384_listening3.png');
INSERT INTO listeningcourse VALUES ('4', '1', '2', '英语六级听力课程2', '英语六级听力课程2。英语六级听力课程2。英语六级听力课程2。英语六级听力课程2。英语六级听力课程2。英语六级听力课程2。英语六级听力课程2。英语六级听力课程2。英语六级听力课程2。英语六级听力课程2。', 'yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.', '\\SSLearningTeam\\ListeningCourseResource\\521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9_listeningresource_4.mp3', '2', '\\SSLearningTeam\\ListeningCourseResource\\10520d9e-06c2-46bc-a218-2d42382ea384_listening4.png');
INSERT INTO listeningcourse VALUES ('5', '1', '3', '专业四级听力课程1', '专业四级听力课程1。专业四级听力课程1。专业四级听力课程1。专业四级听力课程1。专业四级听力课程1。专业四级听力课程1。专业四级听力课程1。专业四级听力课程1。专业四级听力课程1。专业四级听力课程1。', 'zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.', '\\SSLearningTeam\\ListeningCourseResource\\521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9_listeningresource_5.mp3', '4', '\\SSLearningTeam\\ListeningCourseResource\\10520d9e-06c2-46bc-a218-2d42382ea384_listening5.png');
INSERT INTO listeningcourse VALUES ('6', '1', '4', '专业八级听力课程2', '专业八级听力课程2。专业八级听力课程2。专业八级听力课程2。专业八级听力课程2。专业八级听力课程2。专业八级听力课程2。专业八级听力课程2。专业八级听力课程2。专业八级听力课程2。专业八级听力课程2。', 'zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.', '\\SSLearningTeam\\ListeningCourseResource\\521bc7f2-c9c5-41b6-96a5-fe6b2c7839f9_listeningresource_6.mp3', '5', '\\SSLearningTeam\\ListeningCourseResource\\10520d9e-06c2-46bc-a218-2d42382ea384_listening6.png');

-- ----------------------------
-- Table structure for `oralcourse`
-- ----------------------------
DROP TABLE IF EXISTS `oralcourse`;
CREATE TABLE `oralcourse` (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `languageTypeId` int(11) DEFAULT NULL,
  `rateTypeId` int(11) DEFAULT NULL,
  `courseName` varchar(40) DEFAULT NULL,
  `courseChineseContent` varchar(500) DEFAULT NULL,
  `courseEnglishContent` varchar(500) DEFAULT NULL,
  `downloadNum` int(11) DEFAULT NULL,
  `instructionImgUrl` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  KEY `languageTypeId` (`languageTypeId`),
  KEY `rateTypeId` (`rateTypeId`),
  CONSTRAINT `oralcourse_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `languagetype` (`languageTypeId`),
  CONSTRAINT `oralcourse_ibfk_2` FOREIGN KEY (`rateTypeId`) REFERENCES `ratetype` (`rateTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oralcourse
-- ----------------------------
INSERT INTO oralcourse VALUES ('1', '1', '1', '英语四级口语课程1', '英语四级口语课程1。英语四级口语课程1。英语四级口语课程1。英语四级口语课程1。英语四级口语课程1。英语四级口语课程1。英语四级口语课程1。英语四级口语课程1。英语四级口语课程1。英语四级口语课程1。', 'yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.', '1', '\\SSLearningTeam\\OralCourseResource\\e428d718-73cb-411a-9fe9-2e7a3b3f5013_oralcourse_1.png');
INSERT INTO oralcourse VALUES ('2', '1', '2', '英语六级口语课程1', '英语六级口语课程1。英语六级口语课程1。英语六级口语课程1。英语六级口语课程1。英语六级口语课程1。英语六级口语课程1。英语六级口语课程1。英语六级口语课程1。英语六级口语课程1。英语六级口语课程1。', 'yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.', '3', '\\SSLearningTeam\\OralCourseResource\\e428d718-73cb-411a-9fe9-2e7a3b3f5013_oralcourse_2.png');
INSERT INTO oralcourse VALUES ('3', '1', '3', '专业四级口语课程1', '专业四级口语课程1。专业四级口语课程1。专业四级口语课程1。专业四级口语课程1。专业四级口语课程1。专业四级口语课程1。专业四级口语课程1。专业四级口语课程1。专业四级口语课程1。专业四级口语课程1', 'zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.zhuanyesijikecheng1.', '2', '\\SSLearningTeam\\OralCourseResource\\e428d718-73cb-411a-9fe9-2e7a3b3f5013_oralcourse_3.png');
INSERT INTO oralcourse VALUES ('4', '1', '4', '专业八级口语课程1', '专业八级口语课程1。专业八级口语课程1。专业八级口语课程1。专业八级口语课程1。专业八级口语课程1。专业八级口语课程1。专业八级口语课程1。专业八级口语课程1。专业八级口语课程1专业八级口语课程1。', 'zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.', '2', '\\SSLearningTeam\\OralCourseResource\\e428d718-73cb-411a-9fe9-2e7a3b3f5013_oralcourse_4.png');
INSERT INTO oralcourse VALUES ('5', '1', '3', '专业四级口语课程2', '专业四级口语课程2。专业四级口语课程2。专业四级口语课程2。专业四级口语课程2。专业四级口语课程2。专业四级口语课程2。专业四级口语课程2。专业四级口语课程2。专业四级口语课程2。专业四级口语课程2。', 'zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.', '3', '\\SSLearningTeam\\OralCourseResource\\e428d718-73cb-411a-9fe9-2e7a3b3f5013_oralcourse_5.png');

-- ----------------------------
-- Table structure for `oralcoursescore`
-- ----------------------------
DROP TABLE IF EXISTS `oralcoursescore`;
CREATE TABLE `oralcoursescore` (
  `oralCourseScoreId` int(11) NOT NULL AUTO_INCREMENT,
  `courseType` varchar(20) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `oralScore` int(11) DEFAULT NULL,
  PRIMARY KEY (`oralCourseScoreId`),
  KEY `userId` (`userId`),
  CONSTRAINT `oralcoursescore_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oralcoursescore
-- ----------------------------

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `questionId` int(11) NOT NULL AUTO_INCREMENT,
  `courseType` varchar(20) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  `questionContent` varchar(100) DEFAULT NULL,
  `answerA` varchar(100) DEFAULT NULL,
  `answerB` varchar(100) DEFAULT NULL,
  `answerC` varchar(100) DEFAULT NULL,
  `answerD` varchar(100) DEFAULT NULL,
  `answerReal` int(11) DEFAULT NULL,
  `answerReason` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`questionId`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------
INSERT INTO question VALUES ('1', 'listeningcourse', '1', '听力课程1的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '1', '这是答案原因');
INSERT INTO question VALUES ('2', 'listeningcourse', '2', '听力课程2的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '1', '这是答案原因');
INSERT INTO question VALUES ('3', 'listeningcourse', '2', '听力课程2的问题题目2', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '1', '这是答案原因');
INSERT INTO question VALUES ('4', 'listeningcourse', '3', '听力课程3的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '2', '这是答案原因');
INSERT INTO question VALUES ('5', 'listeningcourse', '4', '听力课程4的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '3', '这是答案原因');
INSERT INTO question VALUES ('6', 'listeningcourse', '4', '听力课程4的问题题目2', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '4', '这是答案原因');
INSERT INTO question VALUES ('7', 'listeningcourse', '4', '听力课程4的问题题目3', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '2', '这是答案原因');
INSERT INTO question VALUES ('8', 'listeningcourse', '5', '听力课程5的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '3', '这是答案原因');
INSERT INTO question VALUES ('9', 'listeningcourse', '6', '听力课程6的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '4', '这是答案原因');
INSERT INTO question VALUES ('10', 'oralcourse', '1', '口语课程1的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '2', '这是答案原因');
INSERT INTO question VALUES ('11', 'oralcourse', '1', '口语课程1的问题题目2', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '3', '这是答案原因');
INSERT INTO question VALUES ('12', 'oralcourse', '1', '口语课程1的问题题目3', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '2', '这是答案原因');
INSERT INTO question VALUES ('13', 'oralcourse', '2', '口语课程2的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '2', '这是答案原因');
INSERT INTO question VALUES ('14', 'oralcourse', '4', '口语课程4的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '3', '这是答案原因');
INSERT INTO question VALUES ('15', 'oralcourse', '5', '口语课程5的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '2', '这是答案原因');
INSERT INTO question VALUES ('16', 'oralcourse', '5', '口语课程5的问题题目2', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '4', '这是答案原因');
INSERT INTO question VALUES ('17', 'readingcourse', '2', '阅读课程2的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '1', '这是答案原因');
INSERT INTO question VALUES ('18', 'readingcourse', '2', '阅读课程2的问题题目2', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '4', '这是答案原因');
INSERT INTO question VALUES ('19', 'readingcourse', '2', '阅读课程2的问题题目3', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '1', '这是答案原因');
INSERT INTO question VALUES ('20', 'readingcourse', '4', '阅读课程4的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '2', '这是答案原因');
INSERT INTO question VALUES ('21', 'readingcourse', '5', '阅读课程4的问题题目1', '答案选项A', '答案选项B', '答案选项C', '答案选项D', '3', '这是答案原因');

-- ----------------------------
-- Table structure for `ratetype`
-- ----------------------------
DROP TABLE IF EXISTS `ratetype`;
CREATE TABLE `ratetype` (
  `rateTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `rateName` varchar(10) DEFAULT NULL,
  `rateIconUrl` varchar(300) DEFAULT NULL,
  `languageTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`rateTypeId`),
  KEY `languageTypeId` (`languageTypeId`),
  CONSTRAINT `ratetype_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `languagetype` (`languageTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ratetype
-- ----------------------------
INSERT INTO ratetype VALUES ('1', '英语四级', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_english_4.png', '1');
INSERT INTO ratetype VALUES ('2', '英语六级', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_english_6.png', '1');
INSERT INTO ratetype VALUES ('3', '专业四级', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_english_zhuan4.png', '1');
INSERT INTO ratetype VALUES ('4', '专业八级', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_english_zhuan8.png', '1');
INSERT INTO ratetype VALUES ('5', '日语N1', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_japanese_1.png', '2');
INSERT INTO ratetype VALUES ('6', '日语N2', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_japanese_2.png', '2');
INSERT INTO ratetype VALUES ('7', '日语N3', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_japanese_3.png', '2');
INSERT INTO ratetype VALUES ('8', '法语四级', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_franch_4.png', '3');
INSERT INTO ratetype VALUES ('9', '法语六级', '\\SSLearningTeam\\Ratetypes\\28b165d6-7441-4af4-beb0-916939e90614_franch_8.png', '3');

-- ----------------------------
-- Table structure for `readingcourse`
-- ----------------------------
DROP TABLE IF EXISTS `readingcourse`;
CREATE TABLE `readingcourse` (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `languageTypeId` int(11) DEFAULT NULL,
  `rateTypeId` int(11) DEFAULT NULL,
  `courseName` varchar(40) DEFAULT NULL,
  `courseChineseContent` varchar(500) DEFAULT NULL,
  `courseEnglishContent` varchar(500) DEFAULT NULL,
  `downloadNum` int(11) DEFAULT NULL,
  `instructionImgUrl` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`courseId`),
  KEY `languageTypeId` (`languageTypeId`),
  KEY `rateTypeId` (`rateTypeId`),
  CONSTRAINT `readingcourse_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `languagetype` (`languageTypeId`),
  CONSTRAINT `readingcourse_ibfk_2` FOREIGN KEY (`rateTypeId`) REFERENCES `ratetype` (`rateTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of readingcourse
-- ----------------------------
INSERT INTO readingcourse VALUES ('1', '1', '1', '英语四级阅读课程1', '英语四级阅读课程1。英语四级阅读课程1。英语四级阅读课程1。英语四级阅读课程1。英语四级阅读课程1。英语四级阅读课程1。英语四级阅读课程1。英语四级阅读课程1。英语四级阅读课程1。英语四级阅读课程1。', 'yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.yingyusijikecheng1.', '2', '\\SSLearningTeam\\ReadingCourseResource\\43edaca2-f178-4b6e-baee-d82adaa5d2d11_reading_1.png');
INSERT INTO readingcourse VALUES ('2', '1', '2', '英语六级阅读课程1', '英语六级阅读课程1。英语六级阅读课程1。英语六级阅读课程1。英语六级阅读课程1。英语六级阅读课程1。英语六级阅读课程1英语六级阅读课程1。英语六级阅读课程1。英语六级阅读课程1。', 'yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.yingyuliujikecheng1.', '2', '\\SSLearningTeam\\ReadingCourseResource\\43edaca2-f178-4b6e-baee-d82adaa5d2d11_reading_2.png');
INSERT INTO readingcourse VALUES ('3', '1', '2', '英语六级阅读课程2', '英语六级阅读课程2。英语六级阅读课程2。英语六级阅读课程2。英语六级阅读课程2。英语六级阅读课程2。英语六级阅读课程2。英语六级阅读课程2。英语六级阅读课程2。英语六级阅读课程2。英语六级阅读课程2。', 'yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.yingyuliujikecheng2.', '3', '\\SSLearningTeam\\ReadingCourseResource\\43edaca2-f178-4b6e-baee-d82adaa5d2d11_reading_3.png');
INSERT INTO readingcourse VALUES ('4', '1', '3', '专业四级阅读课程1', '专业四级阅读课程1。专业四级阅读课程1。专业四级阅读课程1。专业四级阅读课程1。专业四级阅读课程1。专业四级阅读课程1。专业四级阅读课程1。专业四级阅读课程1。专业四级阅读课程1。专业四级阅读课程1。', 'zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.zhuanyebajikecheng1.', '4', '\\SSLearningTeam\\ReadingCourseResource\\43edaca2-f178-4b6e-baee-d82adaa5d2d11_reading_4.png');
INSERT INTO readingcourse VALUES ('5', '1', '4', '专业八级阅读课程1', '专业八级阅读课程1。专业八级阅读课程1。专业八级阅读课程1。专业八级阅读课程1。专业八级阅读课程1。专业八级阅读课程1。专业八级阅读课程1。专业八级阅读课程1。专业八级阅读课程1。专业八级阅读课程1。', 'zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.zhuanyesijikecheng2.', '1', '\\SSLearningTeam\\ReadingCourseResource\\43edaca2-f178-4b6e-baee-d82adaa5d2d11_reading_5.png');

-- ----------------------------
-- Table structure for `signinrecording`
-- ----------------------------
DROP TABLE IF EXISTS `signinrecording`;
CREATE TABLE `signinrecording` (
  `signInId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `totalTimes` int(11) DEFAULT NULL,
  `recentMark` datetime DEFAULT NULL,
  PRIMARY KEY (`signInId`),
  KEY `userId` (`userId`),
  CONSTRAINT `signinrecording_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of signinrecording
-- ----------------------------
INSERT INTO signinrecording VALUES ('1', '3', '1', '2018-09-02 02:13:25');
INSERT INTO signinrecording VALUES ('2', '6', '3', '2018-09-02 02:13:25');
INSERT INTO signinrecording VALUES ('3', '2', '4', '2018-09-03 03:13:25');
INSERT INTO signinrecording VALUES ('4', '4', '2', '2018-09-03 03:13:25');
INSERT INTO signinrecording VALUES ('5', '5', '2', '2018-09-04 03:19:25');

-- ----------------------------
-- Table structure for `simulatedtest`
-- ----------------------------
DROP TABLE IF EXISTS `simulatedtest`;
CREATE TABLE `simulatedtest` (
  `simulatedTestId` int(11) NOT NULL AUTO_INCREMENT,
  `languageTypeId` int(11) DEFAULT NULL,
  `rateTypeId` int(11) DEFAULT NULL,
  `testName` varchar(20) DEFAULT NULL,
  `instructionImgUrl` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`simulatedTestId`),
  KEY `languageTypeId` (`languageTypeId`),
  KEY `rateTypeId` (`rateTypeId`),
  CONSTRAINT `simulatedtest_ibfk_1` FOREIGN KEY (`languageTypeId`) REFERENCES `languagetype` (`languageTypeId`),
  CONSTRAINT `simulatedtest_ibfk_2` FOREIGN KEY (`rateTypeId`) REFERENCES `ratetype` (`rateTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of simulatedtest
-- ----------------------------
INSERT INTO simulatedtest VALUES ('1', '1', '1', '测试四级1', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_1.png');
INSERT INTO simulatedtest VALUES ('2', '1', '1', '测试四级2', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_2.png');
INSERT INTO simulatedtest VALUES ('3', '1', '2', '测试六级1', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_3.png');
INSERT INTO simulatedtest VALUES ('4', '1', '2', '测试六级2', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_4.png');
INSERT INTO simulatedtest VALUES ('5', '1', '2', '测试六级3', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_5.png');
INSERT INTO simulatedtest VALUES ('6', '1', '2', '测试六级4', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_6.png');
INSERT INTO simulatedtest VALUES ('7', '1', '2', '测试六级5', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_7.png');
INSERT INTO simulatedtest VALUES ('8', '1', '3', '测试专四1', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_8.png');
INSERT INTO simulatedtest VALUES ('9', '1', '3', '测试专四2', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_9.png');
INSERT INTO simulatedtest VALUES ('10', '1', '4', '测试专八1', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_10.png');
INSERT INTO simulatedtest VALUES ('11', '1', '4', '测试专八2', '\\SSLearningTeam\\TrainRecourses\\ad610287-98aa-40d1-a1f6-1b8db33cc93b_train_11.png');

-- ----------------------------
-- Table structure for `subscriptionrecording`
-- ----------------------------
DROP TABLE IF EXISTS `subscriptionrecording`;
CREATE TABLE `subscriptionrecording` (
  `subscriptionRecordingId` int(11) NOT NULL AUTO_INCREMENT,
  `subscriptionTime` datetime DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `courseType` varchar(20) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  PRIMARY KEY (`subscriptionRecordingId`),
  KEY `userId` (`userId`),
  CONSTRAINT `subscriptionrecording_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subscriptionrecording
-- ----------------------------
INSERT INTO subscriptionrecording VALUES ('1', '2018-09-02 05:04:20', '2', 'listeningcourse', '2');
INSERT INTO subscriptionrecording VALUES ('2', '2018-09-02 05:04:33', '3', 'listeningcourse', '2');
INSERT INTO subscriptionrecording VALUES ('3', '2018-09-02 05:04:40', '2', 'listeningcourse', '3');

-- ----------------------------
-- Table structure for `testquestion`
-- ----------------------------
DROP TABLE IF EXISTS `testquestion`;
CREATE TABLE `testquestion` (
  `testQuestionId` int(11) NOT NULL AUTO_INCREMENT,
  `testQuestionName` varchar(50) DEFAULT NULL,
  `simulatedTestId` int(11) DEFAULT NULL,
  `courseType` varchar(20) DEFAULT NULL,
  `courseId` int(11) DEFAULT NULL,
  PRIMARY KEY (`testQuestionId`),
  KEY `simulatedTestId` (`simulatedTestId`),
  CONSTRAINT `testquestion_ibfk_1` FOREIGN KEY (`simulatedTestId`) REFERENCES `simulatedtest` (`simulatedTestId`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testquestion
-- ----------------------------
INSERT INTO testquestion VALUES ('1', '模拟测试题目1', '1', 'listeningcourse', '1');
INSERT INTO testquestion VALUES ('2', '模拟测试题目2', '2', 'listeningcourse', '2');
INSERT INTO testquestion VALUES ('3', '模拟测试题目3', '2', 'listeningcourse', '3');
INSERT INTO testquestion VALUES ('4', '模拟套题题目4', '3', 'listeningcourse', '3');
INSERT INTO testquestion VALUES ('5', '模拟测试题目5', '4', 'oralcourse', '1');
INSERT INTO testquestion VALUES ('6', '模拟测试题目6', '4', 'listeningcourse', '4');
INSERT INTO testquestion VALUES ('7', '模拟测试题目7', '4', 'readingcourse', '2');
INSERT INTO testquestion VALUES ('8', '模拟测试题目8', '5', 'listeningcourse', '5');
INSERT INTO testquestion VALUES ('9', '模拟测试题目9', '6', 'listeningcourse', '6');
INSERT INTO testquestion VALUES ('10', '模拟测试题目10', '6', 'oralcourse', '1');
INSERT INTO testquestion VALUES ('11', '模拟测试题目11', '6', 'readingcourse', '1');
INSERT INTO testquestion VALUES ('12', '模拟测试题目12', '6', 'oralcourse', '2');
INSERT INTO testquestion VALUES ('13', '模拟测试题目13', '7', 'listeningcourse', '4');
INSERT INTO testquestion VALUES ('14', '模拟测试题目14', '8', 'oralcourse', '5');
INSERT INTO testquestion VALUES ('15', '模拟测试题目15', '9', 'oralcourse', '5');
INSERT INTO testquestion VALUES ('16', '模拟测试题目16', '10', 'readingcourse', '2');
INSERT INTO testquestion VALUES ('17', '模拟测试题目17', '11', 'readingcourse', '2');

-- ----------------------------
-- Table structure for `testquestionresult`
-- ----------------------------
DROP TABLE IF EXISTS `testquestionresult`;
CREATE TABLE `testquestionresult` (
  `testQuestionResultId` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `simulatedTestId` int(11) DEFAULT NULL,
  `resultScore` int(11) DEFAULT NULL,
  PRIMARY KEY (`testQuestionResultId`),
  KEY `userId` (`userId`),
  KEY `simulatedTestId` (`simulatedTestId`),
  CONSTRAINT `testquestionresult_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`),
  CONSTRAINT `testquestionresult_ibfk_2` FOREIGN KEY (`simulatedTestId`) REFERENCES `simulatedtest` (`simulatedTestId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testquestionresult
-- ----------------------------
INSERT INTO testquestionresult VALUES ('1', '3', '1', '90');
INSERT INTO testquestionresult VALUES ('2', '2', '2', '90');
INSERT INTO testquestionresult VALUES ('3', '2', '3', '100');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('1', '男', '喆哥', '481f6cc0511143ccdd7e2d1b1b94faf0a700a8b49cd13922a70b5ae28acaa8c5', '\\SSLearningTeam\\AvatarImgs\\fcdcc255-d591-4291-ae86-da0ae493abef18041168033user_photo01.png', '13998434328', '1');
INSERT INTO user VALUES ('2', '男', '车俊林', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '\\SSLearningTeam\\AvatarImgs\\fcdcc255-d591-4291-ae86-da0ae493abef18041168033user_photo02.png', '15842611111', '0');
INSERT INTO user VALUES ('3', '女', '尚冰冰', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '\\SSLearningTeam\\AvatarImgs\\fcdcc255-d591-4291-ae86-da0ae493abef18041168033user_photo03.png', '18041111111', '0');
INSERT INTO user VALUES ('4', '男', '陈丽桦', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '\\SSLearningTeam\\AvatarImgs\\fcdcc255-d591-4291-ae86-da0ae493abef18041168033user_photo04.png', '18041122222', '0');
INSERT INTO user VALUES ('5', '男', '辛俊桥', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '\\SSLearningTeam\\AvatarImgs\\fcdcc255-d591-4291-ae86-da0ae493abef18041168033user_photo05.png', '18041133333', '0');
INSERT INTO user VALUES ('6', '男', '苏凯', '8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92', '\\SSLearningTeam\\AvatarImgs\\fcdcc255-d591-4291-ae86-da0ae493abef18041168033user_photo06.png', '18041144444', '0');

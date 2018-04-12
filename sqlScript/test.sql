/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-04-12 16:48:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course_info`
-- ----------------------------
DROP TABLE IF EXISTS `course_info`;
CREATE TABLE `course_info` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(50) NOT NULL,
  `teacher_no` int(8) NOT NULL,
  `weekday` varchar(20) NOT NULL,
  `start_time` date NOT NULL,
  `end_time` date NOT NULL,
  `classroom` varchar(50) NOT NULL,
  `type` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_info
-- ----------------------------

-- ----------------------------
-- Table structure for `student_info`
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(20) NOT NULL,
  `stu_sex` int(8) DEFAULT NULL,
  `stu_major` varchar(50) NOT NULL,
  `stu_nation` varchar(10) DEFAULT NULL,
  `stu_politics_status` varchar(20) DEFAULT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20180005 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('20180001', '张三', '0', '计算机', '汉', '团员', '654321');
INSERT INTO `student_info` VALUES ('20180002', '李⑤', '1', '计算机', '汉', '团员', '654321');
INSERT INTO `student_info` VALUES ('20180003', '仙洒', '1', '计算机', '汉', '团员', '654321');
INSERT INTO `student_info` VALUES ('20180004', 'aaa@qq.com', '1', '信息管理', '汉', '团员', '654321');

-- ----------------------------
-- Table structure for `stu_schedule`
-- ----------------------------
DROP TABLE IF EXISTS `stu_schedule`;
CREATE TABLE `stu_schedule` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `stu_no` int(8) NOT NULL,
  `course_id` int(8) NOT NULL,
  `score` int(8) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_schedule
-- ----------------------------

-- ----------------------------
-- Table structure for `teacher_info`
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `tea_name` varchar(20) NOT NULL,
  `tea_sex` int(11) DEFAULT NULL,
  `tea_nation` varchar(10) DEFAULT NULL,
  `password` varchar(18) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20189004 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES ('20189001', '大q老师', '0', '汉', '654321');
INSERT INTO `teacher_info` VALUES ('20189002', '大b老师', '1', '汉', '654321');
INSERT INTO `teacher_info` VALUES ('20189003', '大a老师', '0', '汉', '654321');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`),
  UNIQUE KEY `UK_lqjrcobrh9jc8wpcar64q1bfh` (`user_name`),
  UNIQUE KEY `UK_d2ia11oqhsynodbsi46m80vfc` (`nick_name`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2017-08-18 11:10:15', 'qqq', 'aaa', 'ssss', 'xxx');
INSERT INTO `user` VALUES ('3', '2017-08-31 14:21:57', '141', '252', '363', '373');
INSERT INTO `user` VALUES ('7', '2017-08-25 13:37:22', '333', '444', '222', '111');
INSERT INTO `user` VALUES ('11', '2017-08-31 14:08:44', '111', '222', '333', '333');
INSERT INTO `user` VALUES ('12', '2017-08-31 14:09:14', '131', '242', '353', '363');
INSERT INTO `user` VALUES ('13', '2017-09-01 00:00:00', '3363', '4644', '2622', '1631');
INSERT INTO `user` VALUES ('14', '2017-09-01 00:00:00', '4644@qq', 'sd3555as', '3363', '2622');
INSERT INTO `user` VALUES ('19', '2017-09-01 13:38:50', '464422@132', 's5as', '3363', '26222');

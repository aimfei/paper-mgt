/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.1.112
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 192.168.1.112:3306
 Source Schema         : db_graduation_thesis

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 15/05/2019 18:23:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_class
-- ----------------------------
DROP TABLE IF EXISTS `t_class`;
CREATE TABLE `t_class`  (
  `id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deptid` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_class
-- ----------------------------
INSERT INTO `t_class` VALUES ('19181', '信息81班', '191');
INSERT INTO `t_class` VALUES ('19182', '信息82班', '191');
INSERT INTO `t_class` VALUES ('19281', '计科81班', '192');
INSERT INTO `t_class` VALUES ('19282', '计科82班', '192');
INSERT INTO `t_class` VALUES ('19283', '计科83班', '192');
INSERT INTO `t_class` VALUES ('19381', '网工81班', '193');
INSERT INTO `t_class` VALUES ('19382', '网工82班', '193');
INSERT INTO `t_class` VALUES ('30283', '测试班级2', '302');
INSERT INTO `t_class` VALUES ('30181', '测试班级81', '301');
INSERT INTO `t_class` VALUES ('30182', '测试班级82', '301');
INSERT INTO `t_class` VALUES ('30183', '班级83', '301');

-- ----------------------------
-- Table structure for t_college
-- ----------------------------
DROP TABLE IF EXISTS `t_college`;
CREATE TABLE `t_college`  (
  `id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_college
-- ----------------------------
INSERT INTO `t_college` VALUES ('19', '信息科学技术学院');
INSERT INTO `t_college` VALUES ('13', '资源与环境科学学院');
INSERT INTO `t_college` VALUES ('22', '人文社会科学学院');
INSERT INTO `t_college` VALUES ('12', '植物保护学院');
INSERT INTO `t_college` VALUES ('16', '经济管理学院');
INSERT INTO `t_college` VALUES ('15', '动物科技学院');
INSERT INTO `t_college` VALUES ('17', '动物医学院');
INSERT INTO `t_college` VALUES ('20', '公共管理学院');
INSERT INTO `t_college` VALUES ('18', '食品科技学院');
INSERT INTO `t_college` VALUES ('10', '生命科学学院');
INSERT INTO `t_college` VALUES ('21', '外国语学院');
INSERT INTO `t_college` VALUES ('14', '园艺学院');
INSERT INTO `t_college` VALUES ('11', '农学院');
INSERT INTO `t_college` VALUES ('23', '理学院');
INSERT INTO `t_college` VALUES ('24', '工学院');
INSERT INTO `t_college` VALUES ('30', '测试的学院');

-- ----------------------------
-- Table structure for t_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept`  (
  `id` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `collegeid` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('191', '信息管理与信息技术', '19');
INSERT INTO `t_dept` VALUES ('192', '计算机科学与技术', '19');
INSERT INTO `t_dept` VALUES ('193', '网络工程', '19');
INSERT INTO `t_dept` VALUES ('301', '测试专业1', '30');
INSERT INTO `t_dept` VALUES ('302', '测试专业2', '30');

-- ----------------------------
-- Table structure for t_notice
-- ----------------------------
DROP TABLE IF EXISTS `t_notice`;
CREATE TABLE `t_notice`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ntitle` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `scope` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ncontent` varchar(5000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_report
-- ----------------------------
DROP TABLE IF EXISTS `t_report`;
CREATE TABLE `t_report`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `taskid` int(11) NOT NULL,
  `overview` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `goal` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `method` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `innovation` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `progress` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `requirement` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `teaopinion` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deptopinion` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `subtime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `taskid`(`taskid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_topic
-- ----------------------------
DROP TABLE IF EXISTS `t_topic`;
CREATE TABLE `t_topic`  (
  `id` int(11) NOT NULL,
  `topic_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `topic_desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `stu_id` int(11) NULL DEFAULT NULL,
  `tea_id` int(11) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `modify_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_topic
-- ----------------------------
INSERT INTO `t_topic` VALUES (1, '1', '2', 3, 1, '2019-05-15 18:00:11', '2019-05-15 18:00:13');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `lasttime` datetime(0) NULL DEFAULT NULL,
  `realname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `collegeid` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `deptid` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `classid` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `telphone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('admin', 'admin', 'sysadmin', '2014-12-06 21:06:32', 'admin', 'all', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('1928313', '1928313', 'student', '2014-12-14 09:38:10', '张家鸽', '19', '192', '19283', 'pigeon0312@qq.com', '15195985810');
INSERT INTO `t_user` VALUES ('1900101', '1900101', 'teacher', '2014-12-06 21:09:28', '导师1', '19', NULL, NULL, 'daoshi1@gmail.com', '15166666666');
INSERT INTO `t_user` VALUES ('1900001', '1900001', 'deptadmin', '2014-12-14 09:45:12', '信息院管理员', '19', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES ('1928317', '1928317', 'student', '2014-12-07 21:09:26', '沈志兵', '19', '192', '19283', NULL, NULL);
INSERT INTO `t_user` VALUES ('1928311', '1928311', 'student', '2014-12-07 22:23:23', '朱沛', '19', '192', '19283', NULL, NULL);
INSERT INTO `t_user` VALUES ('1928314', '1928314', 'student', '2014-12-09 09:20:30', '李东亮', '19', '192', '19283', NULL, NULL);
INSERT INTO `t_user` VALUES ('3018101', '3018101', 'student', '2014-12-10 18:43:38', '学生1', '30', '301', '30181', NULL, NULL);
INSERT INTO `t_user` VALUES ('3018301', '3018301', 'student', '2014-12-14 09:40:37', '学生2', '30', '301', '30183', NULL, NULL);
INSERT INTO `t_user` VALUES ('1928333', '1928333', 'student', '2014-12-14 09:45:34', '学生5', '19', '192', '19283', NULL, NULL);
INSERT INTO `t_user` VALUES ('wangfei', 'wangfei', 'student', '2014-12-06 21:08:17', '王菲', '19', '191', '19181', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;

/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50642
 Source Host           : 127.0.0.1
 Source Database       : db_gradpro

 Target Server Type    : MySQL
 Target Server Version : 50642
 File Encoding         : utf-8

 Date: 05/20/2019 00:42:04 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `t_class`
-- ----------------------------
DROP TABLE IF EXISTS `t_class`;
CREATE TABLE `t_class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) DEFAULT NULL,
  `deptid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=30285 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_class`
-- ----------------------------
BEGIN;
INSERT INTO `t_class` VALUES ('19181', '信息81班', '191'), ('19182', '信息82班', '191'), ('19281', '计科81班', '192'), ('19282', '计科82班', '192'), ('19283', '计科83班', '192'), ('19381', '网工81班', '193'), ('19382', '网工82班', '193'), ('30283', '测试班级2', '302'), ('30181', '测试班级81', '301'), ('30182', '测试班级82', '301'), ('30183', '班级83', '301'), ('30284', '电风扇D发', null);
COMMIT;

-- ----------------------------
--  Table structure for `t_college`
-- ----------------------------
DROP TABLE IF EXISTS `t_college`;
CREATE TABLE `t_college` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `cname` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_college`
-- ----------------------------
BEGIN;
INSERT INTO `t_college` VALUES ('19', '信息科学技术学院'), ('13', '资源与环境科学学院'), ('22', '人文社会科学学院'), ('12', '植物保护学院'), ('16', '经济管理学院'), ('15', '动物科技学院'), ('17', '动物医学院'), ('20', '公共管理学院'), ('18', '食品科技学院'), ('10', '生命科学学院'), ('21', '外国语学院'), ('14', '园艺学院'), ('11', '农学院'), ('23', '理学院'), ('24', '工学院'), ('30', '测试的学院'), ('31', 'fasd ');
COMMIT;

-- ----------------------------
--  Table structure for `t_dept`
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(20) DEFAULT NULL,
  `collegeid` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=304 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_dept`
-- ----------------------------
BEGIN;
INSERT INTO `t_dept` VALUES ('191', '信息管理与信息技术', '19'), ('192', '计算机科学与技术', '19'), ('193', '网络工程', '19'), ('301', '测试专业1', '30'), ('302', '测试专业2', '30'), ('303', '沙发舒服', '31');
COMMIT;

-- ----------------------------
--  Table structure for `t_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  `menu_url` varchar(255) DEFAULT NULL,
  `menu_name` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Records of `t_menu`
-- ----------------------------
BEGIN;
INSERT INTO `t_menu` VALUES ('1', 'sysadmin', 'http://localhost:18080/papermgt/mgt/1/addPager', '管理学院', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('2', 'sysadmin', 'http://localhost:18080/papermgt/mgt/2/addPager', '管理专业', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('3', 'sysadmin', 'http://localhost:18080/papermgt/mgt/3/addPager', '管理班级', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('4', 'sysadmin', 'http://localhost:18080/papermgt/topic/addPager', '注册用户', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('5', 'sysadmin', 'http://localhost:18080/papermgt/topic/addPager', '发布通知', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('6', 'teacher', 'http://localhost:18080/papermgt/topic/addPager', '发布课题', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('7', 'teacher', null, '课题状态', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('8', 'teacher', null, '消息', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('9', 'student', 'http://localhost:18080/papermgt/user/personalInfo', '个人信息', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('10', 'student', 'http://localhost:18080/papermgt/topic/stuList', '选题信息', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('11', 'student', null, '开题报告', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('12', 'student', null, '中期检查', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('13', 'teacher', 'http://localhost:18080/papermgt/topic/list', '课题列表', '2019-05-16 16:36:43', '2019-05-16 16:36:45'), ('15', 'student', null, '论文', '2019-05-19 22:06:15', '2019-05-19 22:06:17'), ('16', 'student', null, '消息', '2019-05-19 22:06:09', '2019-05-19 22:06:12'), ('17', 'student', 'http://localhost:18080/papermgt/index', '首页', '2019-05-19 23:20:54', '2019-05-19 23:20:57'), ('18', 'teacher', 'http://localhost:18080/papermgt/index', '首页', '2019-05-19 23:20:54', '2019-05-19 23:20:57'), ('19', 'sysadmin', 'http://localhost:18080/papermgt/index', '首页', '2019-05-19 23:20:54', '2019-05-19 23:20:57');
COMMIT;

-- ----------------------------
--  Table structure for `t_notice`
-- ----------------------------
DROP TABLE IF EXISTS `t_notice`;
CREATE TABLE `t_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ntitle` varchar(40) NOT NULL,
  `scope` varchar(20) NOT NULL,
  `ncontent` varchar(5000) NOT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_notice`
-- ----------------------------
BEGIN;
INSERT INTO `t_notice` VALUES ('9', '关于信息学院毕业生照毕业照的通知', '19', '毕业照', '2014-12-05 16:57:12'), ('8', '关于信息学院毕业生工作相关的通知', '19', '工作', '2014-12-05 16:56:53'), ('7', '关于信息学院毕业生中期检查的通知', '19', '中期检查提交报告。\r\n时间****', '2014-12-05 16:55:43'), ('6', '关于信息学院毕业生开题答辩的通知', '19', '答辩时间：****\r\n答辩地点：****', '2014-12-05 16:54:52'), ('5', '关于毕业典礼的通知', 'all', 'blablabla', '2014-12-05 16:42:37'), ('4', '关于毕业生户籍迁移的通知', 'all', '    毕业生户籍在毕业以后需迁离学校', '2014-12-05 16:41:40'), ('3', '关于毕业生毕业证发放的通知', 'all', '关于毕业生毕业证发放是在。。。。。的情况下。。。。才。。。。', '2014-12-05 16:40:22'), ('2', '关于毕业生离校的通知', 'all', '毕业生离校时间:6月**号', '2014-12-05 16:39:25'), ('1', '关于毕业设计的通知', 'all', '请毕业生合理安排时间，按时完成毕业设计', '2014-12-05 16:35:59'), ('10', '关于信息学院毕业生毕业答辩的通知', '19', '毕业答辩', '2014-12-05 17:10:11');
COMMIT;

-- ----------------------------
--  Table structure for `t_report`
-- ----------------------------
DROP TABLE IF EXISTS `t_report`;
CREATE TABLE `t_report` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `taskid` int(11) NOT NULL,
  `overview` varchar(1000) NOT NULL,
  `goal` varchar(1000) NOT NULL,
  `method` varchar(1000) NOT NULL,
  `innovation` varchar(1000) NOT NULL,
  `progress` varchar(1000) NOT NULL,
  `requirement` varchar(1000) NOT NULL,
  `teaopinion` varchar(500) DEFAULT NULL,
  `deptopinion` varchar(500) DEFAULT NULL,
  `subtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `taskid` (`taskid`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `t_stu_tea`
-- ----------------------------
DROP TABLE IF EXISTS `t_stu_tea`;
CREATE TABLE `t_stu_tea` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuname` varchar(255) DEFAULT NULL,
  `teaname` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `t_topic`
-- ----------------------------
DROP TABLE IF EXISTS `t_topic`;
CREATE TABLE `t_topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topic_name` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL,
  `topic_desc` mediumtext COLLATE utf8mb4_bin,
  `stu_id` varchar(64) CHARACTER SET utf8mb4 DEFAULT NULL,
  `tea_id` varchar(64) CHARACTER SET utf8mb4 DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
--  Records of `t_topic`
-- ----------------------------
BEGIN;
INSERT INTO `t_topic` VALUES ('1', '1', '2', '3', '1', '2019-05-15 18:00:11', '2019-05-15 18:00:13'), ('2', 'asdfsdfdf', '                     agagadfgd ', '2', '1', '2019-05-19 07:48:39', '2019-05-19 23:19:31'), ('3', 'adfadgadgagaf', '                     agagadfgd ', null, '9876', '2019-05-19 07:49:49', '2019-05-19 18:51:46'), ('4', 'wreear', 'werqwerqwer erqwerqerq', null, '1', '2019-05-19 07:53:59', '2019-05-19 18:55:57'), ('6', '毕业论文提交管理系统的设计与实现 ', '                    在毕业设计的管理工作中，目前很多高校对于本科学生毕业设计和毕业论文的管理均是采用传统的手工模式，首先，由符合指导资格的教师出题，然后再由教师指导学生选题，学生做完开题报告后，设计和论文的撰写由指导教师指导完成，中途对设计和论文进行中期检查，最后进行论文的批改、答辩以及论文的归档。在这一过程中，每一项工作一般都得教师与学生面对面交流，或者学生所做的设计和论文采用邮寄、E-mail、电话等方式与教师进行交流。这种方式积极的一面在于教师和学生直接面对面的探讨和解决问题，但也存在着很多局限性，对于各种数据和报表，学院老师在处理的过程中，存在着工作量大、指导老师多、灵活性强和进度要求严格等特点，使毕业设计的管理工作难度越来越大[1]。另外，由于大四学生比较分散，在毕业设计期间学生外出实习，没有一个互相交流的平台，这就导致学生交流不够，会给学生自己和学院带来很多不必要的麻烦。因此就需要一个对此流程进行管理的网上系统，使得此过程更加方便，更加透明，更加高效，以节省更多的人力和不必要的工作。\r\n目前此类系统或多或少的存在一些问题：\r\n（1）对于国外的研究现状，由于教育机制的不同，其相应的管理软件不能满足我们的需要，而国内由于各种不同层次的学校管理制度的不同，也缺乏能够满足不同学校需要的管理软件；\r\n', null, '1', '2019-05-19 15:44:03', '2019-05-19 23:44:04'), ('7', '毕业论文提交管理系统的设计与实现 ', '                    完美时间的 额的额 ', null, '1', '2019-05-19 15:44:29', '2019-05-19 23:44:30'), ('8', '毕业论文提交管理系统的设计与实现 1', '                     毕业论文提交管理系统的设计与实现 1', null, '1', '2019-05-19 15:45:47', '2019-05-19 23:45:47'), ('9', '毕业论文提交管理系统的设计与实现 3', '                     毕业论文提交管理系统的设计与实现 1', null, '1', '2019-05-19 15:46:41', '2019-05-19 23:46:29'), ('10', '毕业论文提交管理系统的设计与实现09', '                     哈哈领教了路径', null, '1', '2019-05-19 15:49:45', '2019-05-19 23:49:45'), ('11', null, null, null, 'admin', '2019-05-19 16:16:08', '2019-05-20 00:16:08');
COMMIT;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  `lasttime` datetime DEFAULT NULL,
  `realname` varchar(20) NOT NULL,
  `collegeid` varchar(10) NOT NULL,
  `deptid` varchar(10) DEFAULT NULL,
  `classid` varchar(10) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `telphone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('admin', 'admin', 'sysadmin', '2014-12-06 21:06:32', 'admin', 'all', null, null, null, null), ('1928313', '1928313', 'student', '2014-12-14 09:38:10', '张家鸽', '19', '192', '19283', 'pigeon0312@qq.com', '15195985810'), ('1', '1', 'teacher', '2014-12-06 21:09:28', '导师1', '19', null, null, 'daoshi1@gmail.com', '15166666666'), ('1900001', '1900001', 'deptadmin', '2014-12-14 09:45:12', '信息院管理员', '19', null, null, null, null), ('1928317', '1928317', 'student', '2014-12-07 21:09:26', '沈志兵', '19', '192', '19283', null, null), ('1928311', '1928311', 'student', '2014-12-07 22:23:23', '朱沛', '19', '192', '19283', null, null), ('1928314', '1928314', 'student', '2014-12-09 09:20:30', '李东亮', '19', '192', '19283', null, null), ('3018101', '3018101', 'student', '2014-12-10 18:43:38', '学生1', '30', '301', '30181', null, null), ('3018301', '3018301', 'student', '2014-12-14 09:40:37', '学生2', '30', '301', '30183', null, null), ('1928333', '1928333', 'student', '2014-12-14 09:45:34', '学生5', '19', '192', '19283', null, null), ('2', '2', 'student', '2014-12-06 21:08:17', '王菲', '19', '191', '19181', null, null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

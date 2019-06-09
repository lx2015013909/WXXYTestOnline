/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : testonline

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-05-27 22:45:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `choice`
-- ----------------------------
DROP TABLE IF EXISTS `choice`;
CREATE TABLE `choice` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `textcontent` varchar(200) NOT NULL,
  `choice1` varchar(50) NOT NULL,
  `choice2` varchar(50) NOT NULL,
  `choice3` varchar(50) NOT NULL,
  `choice4` varchar(50) NOT NULL,
  `result` varchar(50) NOT NULL,
  `GMT` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of choice
-- ----------------------------
INSERT INTO `choice` VALUES ('14', '在由3个元素组成的集合上，可以有( )种不同的关系。', '3', '8', '9', '27', '9', '2019-05-10 16:22:01');
INSERT INTO `choice` VALUES ('15', '设A1,2,3,5,8,B1,2,5,7,则AB( )。', '3,8', '3', '8', '3,7', '3,8', '2019-05-10 16:21:54');
INSERT INTO `choice` VALUES ('16', '若X是Y的子集，则一定有( )。', 'X不属于Y', 'X包含于Y', 'X真包含于Y', 'X∩Y=X', 'X包含于Y', '2019-05-10 16:27:17');
INSERT INTO `choice` VALUES ('17', '下列关系中是等价关系的是( )。', '不等关系', '空关系', '全关系', '偏序关系', '空关系', '2019-05-10 16:27:53');
INSERT INTO `choice` VALUES ('18', '对于一个从集合A到集合B的映射，下列表述中错误的是( )。', '对A的每个元素都要有象', '对A的每一个元素都只有一个象', '对B的每一个元素都有原象', '对B的元素可以有不止一个原象', '对B的元素可以有不止一个原象', '2019-05-10 16:28:57');
INSERT INTO `choice` VALUES ('19', '设P：小李努力学习，Q：小李取得好成绩，命题\"除非小李努力学习，否则他不能取得好成绩\"的符号化形式为( )。', 'P—>Q', 'Q—>P', '¬Q—>¬P', '¬P—>¬Q', '¬P—>¬Q', '2019-05-10 16:33:20');
INSERT INTO `choice` VALUES ('20', '设A={a,b,c},则A到A的双射共有( )。', '3', '6', '8', '9', '9', '2019-05-10 16:34:06');
INSERT INTO `choice` VALUES ('21', '一个连通G具有以下何种条件时，能一笔画出：即从某节点出发，经过中每边仅一次回到该结点( )。', 'G没有奇数度结点', 'G有1个奇数度结点', 'G有2个奇数度结点', 'G没有或有2个奇数度结点', 'G没有或有2个奇数度结点', '2019-05-10 16:35:37');
INSERT INTO `choice` VALUES ('22', '设<G,*>时群，且|G|>1,则下列命题不成立的是( )。', 'G中有幺元', 'G中么元是唯一的', 'G中任一元素有逆元', 'G中除了幺元无其他幂等元', 'G中除了幺元无其他幂等元', '2019-05-10 16:36:56');
INSERT INTO `choice` VALUES ('23', '令P：今天下雪了，Q：路滑，则命题“虽然今天下雪了，但是路不滑”可符号化为( )。', 'P—>¬Q', 'P∨¬Q', 'P∧Q', 'P∧¬Q', 'P∧¬Q', '2019-05-10 16:39:03');
INSERT INTO `choice` VALUES ('24', '设G=的节点集为V={v1,v2,v3},边集为E={,}，则G的割(点)集是( )。', '{v1}', '{v2}', '{v3}', '{v2,v3}', '{v2,v3}', '2019-05-10 16:40:31');
INSERT INTO `choice` VALUES ('25', '若R是环，且R中乘法适合消去律，则R是( )。', '无零因子环', '整环', '除环', '域', '域', '2019-05-10 16:41:50');

-- ----------------------------
-- Table structure for `completion`
-- ----------------------------
DROP TABLE IF EXISTS `completion`;
CREATE TABLE `completion` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `textcontent` varchar(200) NOT NULL,
  `result` varchar(50) NOT NULL,
  `GMT` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of completion
-- ----------------------------
INSERT INTO `completion` VALUES ('14', '公式 (P∧R)∨(S∨R)∨¬P的主合取范式是______。', '123', '2019-05-10 16:52:42');
INSERT INTO `completion` VALUES ('15', '求一个公式的主析取或主合取范式的方法有____法和____法。', '123', '2019-05-10 16:52:34');
INSERT INTO `completion` VALUES ('16', '集合X={a,b,c,d}上二元关系R={<a,b>,<a,c>,<a,d>,<b,c>,<b,d>,<c,d>},则R的自反闭包r(R)=________。', '123', '2019-05-10 16:52:24');
INSERT INTO `completion` VALUES ('17', '一个_____且_____的无向图称为树。', '123', '2019-05-10 16:53:04');
INSERT INTO `completion` VALUES ('18', '给定命题公式A、B，若______，则称A和B是逻辑相等的。', '123', '2019-05-10 16:55:21');
INSERT INTO `completion` VALUES ('19', '命题公式¬(P—>Q)的主析取范式为________。', '123', '2019-05-10 16:56:09');

-- ----------------------------
-- Table structure for `judge`
-- ----------------------------
DROP TABLE IF EXISTS `judge`;
CREATE TABLE `judge` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `textcontent` varchar(200) NOT NULL,
  `result` int(50) NOT NULL,
  `GMT` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of judge
-- ----------------------------
INSERT INTO `judge` VALUES ('14', '在命题逻辑中，任何命题公式的主合取范式都是存在的，并且是唯一的。', '0', '2019-05-10 16:42:38');
INSERT INTO `judge` VALUES ('15', '关系的复合运算满足交换律。', '0', '2019-05-10 16:42:54');
INSERT INTO `judge` VALUES ('16', '集合A上任一运算对A是封闭的。', '0', '2019-05-10 16:43:14');
INSERT INTO `judge` VALUES ('17', '0,1,2,3,4，max，min是格。', '0', '2019-05-10 16:43:27');
INSERT INTO `judge` VALUES ('18', '强联通有向一定是单向连通。', '0', '2019-05-10 16:43:43');
INSERT INTO `judge` VALUES ('19', '群中可以有零元(对阶数大于1的群)。', '0', '2019-05-10 16:56:39');
INSERT INTO `judge` VALUES ('20', '循环群一定是Abel群。', '0', '2019-05-10 16:57:07');

-- ----------------------------
-- Table structure for `shortanswer`
-- ----------------------------
DROP TABLE IF EXISTS `shortanswer`;
CREATE TABLE `shortanswer` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `textcontent` varchar(200) NOT NULL,
  `key1` varchar(400) NOT NULL,
  `key2` varchar(400) NOT NULL,
  `key3` varchar(400) NOT NULL,
  `result` varchar(400) NOT NULL,
  `GMT` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of shortanswer
-- ----------------------------
INSERT INTO `shortanswer` VALUES ('7', '设集合A={a,b,c},B={b,d,e},求(1)BA;(2)AB;(3)A-B', 'BA', 'AB', 'A-B', 'A-B', '2019-05-10 16:44:50');
INSERT INTO `shortanswer` VALUES ('8', '设非空集合A，验证(P(A),,,~,,A)是布尔代数', 'A', 'A', 'A', 'A', '2019-05-10 16:45:26');
INSERT INTO `shortanswer` VALUES ('9', '如果他是计算机系本科生或者是计算机系研究生，那么他一定学过DELPHI语言而且学过C++语言。只要他学过DELPHI语言或者C++语言，那么他就会编程序。因此如果他是计算机系本科生，那么他就会编程序。请用命题逻辑推理方法，证明该推理的有效结论。', '1', '2', '3', '1', '2019-05-10 16:45:59');
INSERT INTO `shortanswer` VALUES ('10', '用等值演算法求下面公式的主析取范式，并求其成真赋值(P∨Q)—>R', '1', '2', '3', '1', '2019-05-10 16:58:57');
INSERT INTO `shortanswer` VALUES ('11', '集合A={1,2,3,4}上的关系R={<1,1>,<1,3>,<2,2>,<3,3>,<3,1>,<3,4>,<4,3>,<4,4>}', '1', '2', '3', '4', '2019-05-10 17:00:18');

-- ----------------------------
-- Table structure for `testrecord`
-- ----------------------------
DROP TABLE IF EXISTS `testrecord`;
CREATE TABLE `testrecord` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `sid` varchar(20) NOT NULL,
  `choice` int(5) NOT NULL,
  `completion` int(5) NOT NULL,
  `judge` int(5) NOT NULL,
  `shortanswer` int(5) NOT NULL,
  `score` int(5) NOT NULL,
  `GMT` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of testrecord
-- ----------------------------
INSERT INTO `testrecord` VALUES ('1', '林子迅', '2015013912', '4', '0', '0', '9', '13', '2019-05-10 19:23:06');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sid` varchar(20) NOT NULL,
  `flag` int(2) NOT NULL,
  `GMT` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'admin', '汪淼', '001', '2', '2019-05-04 22:14:03');
INSERT INTO `users` VALUES ('2', 'admin1', 'admin1', '林子迅', '2015013912', '1', '2019-05-10 19:03:10');

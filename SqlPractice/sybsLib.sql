SELECT * FROM emp ORDER BY sal DESC, ename ASC 

SELECT job,COUNT(1) FROM emp
GROUP BY job 



SELECT ename, sal, YEAR(hiredate) years FROM emp WHERE sal>5000 
GROUP BY years

SELECT ename, MAX(sal) m,YEAR(hiredate) years FROM emp
GROUP BY years
HAVING m > 5000

SELECT MAX(sal) FROM emp

SELECT sal FROM emp ORDER BY sal DESC LIMIT 1
SHOW DATABASES
SHOW TABLES
USER

INSERT INTO USER VALUES(
NULL,"Nandi","0000")

UPDATE USER SET pwd = "123" WHERE id = 1 

INSERT INTO  USER VALUES(
NULL,"Ross","456");
UPDATE USER SET NAME = "Jack" WHERE id = 1

INSERT INTO USER VALUES
	(NULL,"Tony","123"),(NULL,"Jerry","456")

CREATE TABLE a(
	id INT PRIMARY KEY AUTO_INCREMENT,
	sex VARCHAR(10) DEFAULT "中性"
	);
SELECT * FROM a;

CREATE TABLE bb(
	id INT PRIMARY KEY AUTO_INCREMENT,
	age INT,
	CHECK(age<200 AND age >0)
	);
INSERT INTO bb VALUES(
	NULL,1000);

CREATE TABLE tb_user(
id INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(20),
age INT,
sex CHAR(10) DEFAULT "男"
)

CREATE TABLE tb_user_address(tb_user
user_id INT PRIMARY KEY,
address VARCHAR(200),
#创建外键
FOREIGN KEY(user_id) REFERENCES tb_user(id)
)
#子表的主键值也不能乱写，必须取自主表的主键值


CREATE TABLE courses
 
(
 
cno VARCHAR(5) NOT NULL,
 
cname VARCHAR(10) NOT NULL,
 
tno VARCHAR(3) NOT NULL,
 
PRIMARY KEY (cno)
 
);


CREATE TABLE scores
 
(
 
sno VARCHAR(3) NOT NULL,
 
cno VARCHAR(5) NOT NULL,
 
degree NUMERIC(10,1) NOT NULL,
 
PRIMARY KEY (sno, cno)
 
);

 
CREATE TABLE students
 
(
 
sno VARCHAR(3) NOT NULL,
 
sname VARCHAR(4) NOT NULL,
 
ssex VARCHAR(2) NOT NULL,
 
sbirthday DATETIME,
 
class VARCHAR(5),
 
PRIMARY KEY (sno)
 
);


CREATE TABLE teachers
 
(
 
tno VARCHAR(3) NOT NULL,
 
tname VARCHAR(4),
 
tsex VARCHAR(2),
 
tbirthday DATETIME,
 
prof VARCHAR(6),
 
depart VARCHAR(10),
 
PRIMARY KEY (tno)
 
)
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (108 ,'曾华' ,'男' ,'1977-09-01',95033);
 
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (105 ,'匡明' ,'男' ,'1975-10-02',95031);
 
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (107 ,'王丽' ,'女' ,'1976-01-23',95033);
 
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (101 ,'李军' ,'男' ,'1976-02-20',95033);
 
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (109 ,'王芳' ,'女' ,'1975-02-10',95031);
 
INSERT INTO STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) VALUES (103 ,'陆君' ,'男' ,'1974-06-03',95031);
 
INSERT INTO TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) VALUES (804,'易天','男','1958-12-02','副教授','计算机系');
 
INSERT INTO TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) VALUES (856,'王旭','男','1969-03-12','讲师','电子工程系');
 
INSERT INTO TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) VALUES (825,'李萍','女','1972-05-05','助教','计算机系');
 
INSERT INTO TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) VALUES (831,'陈冰','女','1977-08-14','助教','电子工程系');
 
INSERT INTO COURSES(CNO,CNAME,TNO)VALUES ('3-105' ,'计算机导论',825);
 
INSERT INTO COURSES(CNO,CNAME,TNO)VALUES ('3-245' ,'操作系统' ,804);
 
INSERT INTO COURSES(CNO,CNAME,TNO)VALUES ('6-166' ,'模拟电路' ,856);
 
INSERT INTO COURSES(CNO,CNAME,TNO)VALUES ('6-106' ,'概率论' ,831);
 
INSERT INTO COURSES(CNO,CNAME,TNO)VALUES ('9-888' ,'高等数学' ,831);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (103,'3-245',86);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (105,'3-245',75);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (109,'3-245',68);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (103,'3-105',92);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (105,'3-105',88);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (109,'3-105',76);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (101,'3-105',64);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (107,'3-105',91);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (108,'3-105',78);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (101,'6-166',85);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (107,'6-106',79);
 
INSERT INTO SCORES(SNO,CNO,DEGREE)VALUES (108,'6-166',81);


#多表联查
#1.笛卡尔积
SELECT * FROM dept,emp
#方式二用join连接多张表
SELECT * FROM dept JOIN emp
WHERE dept.deptno = emp.deptno

SELECT dept.dname,emp.* FROM dept,emp
WHERE dept.deptno = emp.deptno

SELECT dept.*, emp.ename FROM dept, emp
WHERE dept.deptno = emp.deptno  #表关系
AND dept.deptno = 1		#业务条件

SELECT dept.*, emp.* FROM dept,emp
WHERE dept.deptno = emp.deptno
AND dept.deptno >1

SELECT * FROM courses, teachers
WHERE courses.tno = teachers.tno
AND teachers.tname = "易天"

SELECT SUM(degree) FROM scores, courses
WHERE scores.cno = courses.cno
AND scores.cno = "3-105"

#方式2：连接查询 用join链接多张表，很高效
SELECT * FROM dept JOIN emp
ON dept.deptno = emp.deptno

SELECT * FROM dept JOIN emp
ON dept.deptno = emp.deptno

SELECT * FROM dept JOIN emp
ON dept.deptno = emp.deptno
WHERE dept.deptno > 1

SELECT teachers.tname,courses.cname FROM courses JOIN teachers
ON courses.tno = teachers.tno
WHERE teachers.tname LIKE "%天"

SELECT courses.cname, SUM(scores.degree) FROM courses JOIN scores
ON courses.cno = scores.cno
WHERE courses.cname LIKE "%导论"  

#方式3： 
SELECT * FROM dept INNER JOIN
ON dept.deptno = emp.deptno

SELECT * FROM dept LEFT JOIN emp
ON dept.deptno = emp.deptno

SELECT * FROM dept RIGHT JOIN emp
ON dept.deptno = emp.deptno


#小表驱动大表，把结构简单或者数据量小的表放在前面当作左表
#因为左表会查完，右表只差满足了条件的数据

SELECT emp.ename, emp.sal FROM emp

SELECT dept.*, emp.ename FROM dept, emp
WHERE dept.deptno = emp.deptno
AND emp.ename = "jack" 

SELECT dept.*, emp.ename FROM dept, emp
WHERE dept.deptno = emp.deptno
AND emp.job = "总监" 

SELECT sname, AVG(degree) FROM students, scores 
WHERE students.sno = scores.sno
AND students.sname = "李军"

SELECT tname, courses.cname FROM courses,teachers
WHERE courses.tno = teachers.tno
AND teachers.tname = "陈冰"

SELECT dept.*, emp.ename FROM dept INNER JOIN emp
ON dept.deptno = emp.deptno
WHERE emp.ename = "jack" 

SELECT dept.*, emp.ename FROM dept INNER JOIN emp
ON dept.deptno = emp.deptno
WHERE emp.job = "总监" 

SELECT sname, AVG(degree) FROM students INNER JOIN scores 
ON students.sno = scores.sno
WHERE students.sname = "李军"

SELECT tname, courses.cname FROM courses INNER JOIN teachers
ON courses.tno = teachers.tno
WHERE teachers.tname = "陈冰"

SELECT SUM(scores.degree) FROM scores WHERE Scores.cno = (SELECT courses.cno FROM courses WHERE courses.cname LIKE "%导论") 


SELECT courses.cname FROM courses WHERE courses.tno = (SELECT teachers.tno FROM teachers WHERE teachers.tname = "易天")

SELECT emp.ename FROM emp WHERE emp.deptno = (SELECT dept.deptno FROM dept WHERE dept.deptno = 1)

SELECT emp.* FROM emp WHERE sal > (SELECT AVG(sal) FROM emp)

SELECT emp.ename FROM emp WHERE emp.deptno IN (SELECT dept.deptno FROM dept WHERE dept.loc = "二区")


SELECT dept.* FROM dept,emp WHERE emp.deptno = dept.deptno AND emp.ename = 'jack'
SELECT dept.* FROM dept JOIN emp ON emp.deptno = dept.deptno WHERE emp.ename = 'jack'

SELECT dept.* FROM dept WHERE deptno = (SELECT deptno FROM emp WHERE emp.ename = 'jack')


SELECT courses.cname FROM courses WHERE courses.tno = (SELECT teachers.tno FROM teachers WHERE teachers.tname = '陈冰')

SELECT courses.cname FROM courses,teachers
WHERE courses.tno = teachers.tno
AND teachers.tname = '陈冰'

SELECT courses.cname FROM courses JOIN teachers
ON courses.tno = teachers.tno
WHERE teachers.tname = '陈冰'


#index 索引 标签
SHOW INDEX FROM dept;
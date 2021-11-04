INSERT INTO emp VALUES(100,'jack','副总',NULL,'2002-05-1',90000,NULL,1);
INSERT INTO emp VALUES(200,'tony','总监',100,'2015-02-02',10000,2000,2);
INSERT INTO emp VALUES(300,'hana','经理',200,'2017-02-02',8000,1000,2);
INSERT INTO emp VALUES(400,'leo','员工',300,'2019-02-22',3000,200.12,2);
INSERT INTO emp VALUES(500,'liu','员工',300,'2019-03-19',3500,200.58,2);

SELECT * FROM emp;
SELECT empno a FROM emp

SELECT UPPER(ename),LOWER(ename) FROM emp

SELECT ename, LENGTH(ename) FROM emp
SELECT job, LENGTH(job) FROM emp
SELECT sal, LENGTH(sal) FROM emp

SELECT ename, SUBSTR(ename,2,2) FROM emp
SELECT ename, CONCAT(ename," hello",1,2) FROM emp
SELECT ename, REPLACE(ename,"jack","hi") FROM emp

SELECT comm,IFNULL(comm,10) FROM emp;
SELECT sal,comm, sal + IFNULL(comm,0) FROM emp
SELECT comm, ROUND(comm,1) FROM emp

SELECT NOW()
SELECT SUBSTR(NOW(),1,4)
SELECT YEAR (NOW())
SELECT MONTH(NOW())
SELECT DAY(NOW())
SELECT UUID()
SELECT 'xi\'an'

SELECT empdistinct loc FROM dept2
SELECT * FROM emp WHERE empno = 100
SELECT * FROM emp WHERE empno > 100

SELECT ename FROM emp WHERE empno = "400" AND sal = 3000
SELECT * FROM emp WHERE empno < 400
empno IN (100,200,300)

SELECT * FROM emp WHERE
empno IN (100,200,300)

SELECT * FROM emp WHERE ename LIKE "%a%"

#今日的练习
SELECT ename FROM emp WHERE deptno = 2
SELECT ename FROM emp WHERE deptno = 2 AND ename LIKE "%o%"
SELECT DISTINCT ename FROM emp WHERE empno LIKE "1%"

SELECT ename FROM emp WHERE YEAR(hiredate)>=2015 AND YEAR(hiredate)<=2019
SELECT sal*12 + IFNULL(comm,0)*12 FROM emp WHERE job = "副总"

#查询奖金为null的员工信息

SELECT ename FROM emp WHERE IFNULL (comm,0) = 0
SELECT * FROM emp WHERE comm IS NOT NULL
SELECT* FROM emp WHERE YEAR(hiredate) BETWEEN 2019 AND 2020
SELECT * FROM emp LIMIT 1,4

SELECT * FROM emp WHERE job = "员工" LIMIT 1

#从小到大排序
SELECT * FROM emp ORDER BY empno
SELECT * FROM emp ORDER BY sal
SELECT * FROM emp ORDER BY job

SELECT * FROM emp WHERE YEAR(hiredate) BETWEEN 2015 AND 2019 ORDER BY sal LIMIT 2  

#每个员工的年薪
SELECT ename, sal * 12 FROM emp
SELECT * FROM emp WHERE YEAR(hiredate) < 2019


SELECT * ,MAX(sal )FROM emp 
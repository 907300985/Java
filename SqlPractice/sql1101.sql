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
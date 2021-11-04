select * from emp order by sal desc, ename asc 

select job,COUNT(1) from emp
group by job 



select ename, sal, YEAR(hiredate) years from emp where sal>5000 
group by years

select ename, MAX(sal) m,YEAR(hiredate) years from emp
group by years
having m > 5000

select MAX(sal) from emp

select sal from emp order by sal desc limit 1
show databases
show tables
user

insert into user values(
null,"Nandi","0000")

update user set pwd = "123" where id = 1 

insert into  user values(
null,"Ross","456");
update user set name = "Jack" where id = 1

insert into user values
	(null,"Tony","123"),(null,"Jerry","456")

create table a(
	id int primary key auto_increment,
	sex varchar(10) default "中性"
	);
select * from a;

create table bb(
	id int primary key auto_increment,
	age int,
	check(age<200 and age >0)
	);
insert into bb values(
	null,1000);

create table tb_user(
id int primary key auto_increment,
name varchar(20),
age int,
sex CHAR(10) default "男"
)

create table tb_user_address(tb_user
user_id int primary key,
address varchar(200),
#创建外键
foreign key(user_id) references tb_user(id)
)
#子表的主键值也不能乱写，必须取自主表的主键值


create table courses
 
(
 
cno varchar(5) not null,
 
cname varchar(10) not null,
 
tno varchar(3) not null,
 
primary key (cno)
 
);


create table scores
 
(
 
sno varchar(3) not null,
 
cno varchar(5) not null,
 
degree numeric(10,1) not null,
 
primary key (sno, cno)
 
);

 
create table students
 
(
 
sno varchar(3) not null,
 
sname varchar(4) not null,
 
ssex varchar(2) not null,
 
sbirthday datetime,
 
class varchar(5),
 
primary key (sno)
 
);


create table teachers
 
(
 
tno varchar(3) not null,
 
tname varchar(4),
 
tsex varchar(2),
 
tbirthday datetime,
 
prof varchar(6),
 
depart varchar(10),
 
primary key (tno)
 
)
insert into STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values (108 ,'曾华' ,'男' ,'1977-09-01',95033);
 
insert into STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values (105 ,'匡明' ,'男' ,'1975-10-02',95031);
 
insert into STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values (107 ,'王丽' ,'女' ,'1976-01-23',95033);
 
insert into STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values (101 ,'李军' ,'男' ,'1976-02-20',95033);
 
insert into STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values (109 ,'王芳' ,'女' ,'1975-02-10',95031);
 
insert into STUDENTS (SNO,SNAME,SSEX,SBIRTHDAY,CLASS) values (103 ,'陆君' ,'男' ,'1974-06-03',95031);
 
insert into TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) values (804,'易天','男','1958-12-02','副教授','计算机系');
 
insert into TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) values (856,'王旭','男','1969-03-12','讲师','电子工程系');
 
insert into TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) values (825,'李萍','女','1972-05-05','助教','计算机系');
 
insert into TEACHERS(TNO,TNAME,TSEX,TBIRTHDAY,PROF,DEPART) values (831,'陈冰','女','1977-08-14','助教','电子工程系');
 
insert into COURSES(CNO,CNAME,TNO)values ('3-105' ,'计算机导论',825);
 
insert into COURSES(CNO,CNAME,TNO)values ('3-245' ,'操作系统' ,804);
 
insert into COURSES(CNO,CNAME,TNO)values ('6-166' ,'模拟电路' ,856);
 
insert into COURSES(CNO,CNAME,TNO)values ('6-106' ,'概率论' ,831);
 
insert into COURSES(CNO,CNAME,TNO)values ('9-888' ,'高等数学' ,831);
 
insert into SCORES(SNO,CNO,DEGREE)values (103,'3-245',86);
 
insert into SCORES(SNO,CNO,DEGREE)values (105,'3-245',75);
 
insert into SCORES(SNO,CNO,DEGREE)values (109,'3-245',68);
 
insert into SCORES(SNO,CNO,DEGREE)values (103,'3-105',92);
 
insert into SCORES(SNO,CNO,DEGREE)values (105,'3-105',88);
 
insert into SCORES(SNO,CNO,DEGREE)values (109,'3-105',76);
 
insert into SCORES(SNO,CNO,DEGREE)values (101,'3-105',64);
 
insert into SCORES(SNO,CNO,DEGREE)values (107,'3-105',91);
 
insert into SCORES(SNO,CNO,DEGREE)values (108,'3-105',78);
 
insert into SCORES(SNO,CNO,DEGREE)values (101,'6-166',85);
 
insert into SCORES(SNO,CNO,DEGREE)values (107,'6-106',79);
 
insert into SCORES(SNO,CNO,DEGREE)values (108,'6-166',81);


#多表联查
#1.笛卡尔积
select * from dept,emp
#方式二用join连接多张表
select * from dept join emp
where dept.deptno = emp.deptno

select dept.dname,emp.* from dept,emp
where dept.deptno = emp.deptno

select dept.*, emp.ename from dept, emp
where dept.deptno = emp.deptno  #表关系
and dept.deptno = 1		#业务条件

select dept.*, emp.* from dept,emp
where dept.deptno = emp.deptno
and dept.deptno >1

select * from courses, teachers
where courses.tno = teachers.tno
and teachers.tname = "易天"

select SUM(degree) from scores, courses
where scores.cno = courses.cno
and scores.cno = "3-105"

#方式2：连接查询 用join链接多张表，很高效
select * from dept join emp
on dept.deptno = emp.deptno

select * from dept join emp
on dept.deptno = emp.deptno

select * from dept join emp
on dept.deptno = emp.deptno
where dept.deptno > 1

select teachers.tname,courses.cname from courses join teachers
on courses.tno = teachers.tno
where teachers.tname like "%天"

select courses.cname, SUM(scores.degree) from courses join scores
on courses.cno = scores.cno
where courses.cname like "%导论"  

#方式3： 
select * from dept inner join
on dept.deptno = emp.deptno

select * from dept left join emp
on dept.deptno = emp.deptno

select * from dept right join emp
on dept.deptno = emp.deptno


#小表驱动大表，把结构简单或者数据量小的表放在前面当作左表
#因为左表会查完，右表只差满足了条件的数据

select emp.ename, emp.sal from emp

select dept.*, emp.ename from dept, emp
where dept.deptno = emp.deptno
and emp.ename = "jack" 

select dept.*, emp.ename from dept, emp
where dept.deptno = emp.deptno
and emp.job = "总监" 

select sname, AVG(degree) from students, scores 
where students.sno = scores.sno
and students.sname = "李军"

select tname, courses.cname from courses,teachers
where courses.tno = teachers.tno
and teachers.tname = "陈冰"

select dept.*, emp.ename from dept inner join emp
on dept.deptno = emp.deptno
where emp.ename = "jack" 

select dept.*, emp.ename from dept inner join emp
on dept.deptno = emp.deptno
where emp.job = "总监" 

select sname, AVG(degree) from students inner join scores 
on students.sno = scores.sno
where students.sname = "李军"

select tname, courses.cname from courses inner join teachers
on courses.tno = teachers.tno
where teachers.tname = "陈冰"

select SUM(scores.degree) from scores where Scores.cno = (select courses.cno from courses where courses.cname like "%导论") 


select courses.cname from courses where courses.tno = (select teachers.tno from teachers where teachers.tname = "易天")

select emp.ename from emp where emp.deptno = (select dept.deptno from dept where dept.deptno = 1)

select emp.* from emp where sal > (select AVG(sal) from emp)

select emp.ename from emp where emp.deptno in (select dept.deptno from dept where dept.loc = "二区")


select dept.* from dept,emp where emp.deptno = dept.deptno and emp.ename = 'jack'
select dept.* from dept join emp on emp.deptno = dept.deptno where emp.ename = 'jack'

select dept.* from dept where deptno = (select deptno from emp where emp.ename = 'jack')


select courses.cname from courses where courses.tno = (select teachers.tno from teachers where teachers.tname = '陈冰')

select courses.cname from courses,teachers
where courses.tno = teachers.tno
and teachers.tname = '陈冰'

select courses.cname from courses join teachers
on courses.tno = teachers.tno
where teachers.tname = '陈冰'

create index loc_index on dept(loc)
create index name_index on emp(ename) 
show index from emp

select * from emp where ename = 'jack'
#检查sql的执行效率
explain
select * from emp where ename = 'jack'

#创建普通索引
create index teachernames on teachers(tname)

explain 
select * from teachers where tname like "%冰"
show index from teachers
#创建唯一索引
create unique index bindex on dept(loc)

#一个字段索引包含多个字段，用时要遵循最左原则，否则复合索引失效
create index eIndex on emp(ename,sal,empno)
#查看数据库效率
show index from emp

explain
select sal from emp where sal = 90000 and ename = 'jack'

#删除索引

alter table emp drop index name_index
show index from emp

#创建视图： create view 视图名 as select语句，提高了SQL的复用性
#视图
select emp.ename from emp where emp.ename like "%a%" 

create view v2 as 
select * from emp where emp.ename like "%a%" 

select * from v2
#坏处：提高了SQL的复用性+屏蔽了业务表的复杂性+数据共享
#坏处：是一张单独的表存了业务表的数据造成了数据重读+无法优化

#插入一条部门表的数据
insert into dept values(null,"java","洛阳")
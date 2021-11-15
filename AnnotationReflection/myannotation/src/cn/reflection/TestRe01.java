package cn.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @Date:2021/11/13 16:20
 * @Author:NANDI_GUO
 */
public class TestRe01 {
    public static void main(String[] args) throws Exception {
//        Person p = new Person();
//
//        Class c1 = p.getClass();
//        System.out.println(c1.hashCode());
//        Class c2 = Class.forName("cn.reflection.Person");
//        System.out.println(c2.hashCode());
//        Class c3 = Student.class;
//        System.out.println(c3.hashCode());
//
//        Class c5 = c1.getSuperclass();
//        System.out.println(c5);

        Class c1 = Class.forName("cn.reflection.Person");
        Constructor con = c1.getConstructor();
        Object o = con.newInstance();
        Method reeat = c1.getMethod("eat");
        reeat.invoke(o);


    }
}
class Person{
    String name;

    public Person() {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("一郎吃啥都行");
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}
class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}

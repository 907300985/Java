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
        Constructor con = c1.getDeclaredConstructor();
        con.setAccessible(true);
        Object o = con.newInstance();



    }
}
class Person{
    String name;

    private Person() {
        System.out.println("hello world");
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("一郎吃啥都行");
    }
}

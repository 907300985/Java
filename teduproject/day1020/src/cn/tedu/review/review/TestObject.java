package cn.tedu.review.review;

import java.util.Objects;

/**
 * @Date:2021/10/20 9:17
 * @Author:NANDI_GUO
 * 一共三个前提
 * s1对象与s2对象new了两次，地址值不同
 * s1 s2 的类型属性，属性值一模一样
 * toString()是println()方法向下逐级调用到的，不需要我们主动调用
 */
public class TestObject {
    public static void main(String[] args) {
        Student s1 = new Student("海绵宝宝",3);
        Student s2 = new Student("海绵宝宝",3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1);
    }
}
class Student{
    String name;
    int age;

    public Student(){
        System.out.println("无参构造");
    }

    public Student(String name, int age) {
        System.out.println("全参构造");
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

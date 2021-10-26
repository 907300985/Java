package cn.tedu.review.serializable;

import java.io.Serializable;

/**
 * @Date:2021/10/22 10:12
 * @Author:NANDI_GUO
 * 封装学生类
 */
/*如果本类的对象想要被序列化输出，必须实现可序列化接口Serializable
* 否则会报错java.io.NotSerializableException: cn.tedu.serializable.Student
* Serializable 接口是一个空接口，里面没有方法，作用是用作标志，标记这个类的对象可以被序列化*/
public class Student implements Serializable{
    /*JVM会给每个要序列化输出的类分配一个唯一的UID，只要更改了这个类
    * 自动生成的默认UID就会改变*/
    //private static final long serialVersionID = 1L;
    private String name;
    private int age;
    private String addr;
    private char gender;
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Student(){
        System.out.println("父类无参");
    }

    public Student(String name, int age, String addr, char gender) {
        System.out.println("全参构造");
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

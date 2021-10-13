package cn.tedu.oop;

import javax.jws.soap.SOAPBinding;

/**
 * @Date:2021/10/13 15:09
 * @Author:NANDI_GUO
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Teacher t2 = new Teacher(3);
        Teacher t3 = new Teacher("果果","男",22,20000);

        t.setAge(20);
        t.setName("Natasha");
        t.setSalary(99999);
        t.setSexual("女");
        System.out.println(t.getName()+t.getAge()+t.getSexual()+t.getSalary());

        Student s = new Student();
        s.ready();

    }
}
class Teacher{
    private String name;
    private String sexual;
    private int age;
    private double salary;

    //==================================================================
    public Teacher(){
        System.out.println("无参构造");
    }

    public Teacher(int n){
        System.out.println("含餐构造"+n);
    }

    public Teacher(String name, String sexual, int age, double salary) {
        this.name = name;
        this.sexual = sexual;
        this.age = age;
        this.salary = salary;
        System.out.println(name + age + sexual +salary);
    }
    //=================================================================
    //创建普通方法

    public String ready(){
        System.out.println("Preparing course");
        return "Course produced out + 1";
    }

    public void teach(String subject){
        System.out.println("Teaching: " + subject);
    }

    //================================================================

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexual() {
        return sexual;
    }

    public void setSexual(String sexual) {
        this.sexual = sexual;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Student extends Teacher{

}

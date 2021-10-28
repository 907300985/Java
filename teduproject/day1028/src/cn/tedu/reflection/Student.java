package cn.tedu.reflection;

/**
 * @Date:2021/10/28 10:06
 * @Author:NANDI_GUO
 * 本类用于复习反射的物料类
 */
public class Student {
    public String name;
    public int age;
    //提供本类的无参与全参构造

    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play(){
        System.out.println("今天大结局，放学后我要写一万行代码");
    }
    public void eat(int n){
        System.out.println("在忙我也要吃"+n+"碗大米饭");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

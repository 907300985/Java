package cn.tedu.reflection;

/**
 * @Date:2021/10/27 11:28
 * @Author:NANDI_GUO
 * 本类用作测试反射的物料类，假装这个类是别人写的
 */
public class Student {
    String name;
    int age;
    public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play(){
        System.out.println("玩代码");
    }
    public void eat(int n){
        System.out.println("中午吃"+n+"碗大米饭");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

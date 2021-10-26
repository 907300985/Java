package cn.tedu.review.review;

/**
 * @Date:2021/10/14 9:09
 * @Author:NANDI_GUO
 * 复习构造函数
 */
public class TestConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("小明");
        Student s2 = new Student("小红",13,'女');
        LS l = new LS();
    }
}
class Student{
    String name;
    int age;
    char gender;

    public Student(){
        System.out.println("无参构造");
    }
    public Student(String s){
        System.out.println("含参构造"+s);
    }

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("父类全参构造");
    }
}
class LS extends Student{
    int score;
    String sClass;
    public LS(){
        super("早上好",5,'男');
        System.out.println("子类的无参构造");
    }

}
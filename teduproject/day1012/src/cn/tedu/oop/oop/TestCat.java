package cn.tedu.oop.oop;

/**
 * @Date:2021/10/12 11:44
 * @Author:NANDI_GUO
 */
public class TestCat {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.jump();
        c1.miaoMiao();

        Cat c2 = new Cat();
        c2.jump();
        c2.miaoMiao();

        c1.age = 2; c1.name = "大白" ; c1.hosts = "大大白";
        c2.age = 4; c2.name = "小黑" ; c2.hosts = "小小黑";

        System.out.println(c1.age);
        System.out.println(c1.hosts);
        System.out.println(c1.name);
        System.out.println(c2.age);
        System.out.println(c2.hosts);
        System.out.println(c2.name);
    }
}
//通过class关键字描述小猫这一类事物

class Cat{
    //属性和行为
    String name;
    int age;
    String hosts;

    public void jump(){
        System.out.println("只只猫猫跳的很高");
    }
    public void miaoMiao(){
        System.out.println("只只喜欢喵喵叫~");
    }
}
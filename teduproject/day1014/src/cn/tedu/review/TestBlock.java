package cn.tedu.review;

/**
 * @Date:2021/10/14 9:38
 * @Author:NANDI_GUO
 */
public class TestBlock {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person(66);
        p1.eat();

    }
}
class Person{
    //构造代码块
    {
        System.out.println("我是一个构造代码块");
    }
    public Person(){
        System.out.println("无参构造");
    }
    public Person(int n){
        System.out.println("含参构造");
    }
    public void eat(){
        System.out.println("我是EAT方法");
        {
            int i = 100;
            System.out.println("我是一个局部代码块");
            System.out.println(++i);
        }
    }
}

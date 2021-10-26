package cn.tedu.review.oop;

/**
 * @Date:2021/10/15 14:38
 * @Author:NANDI_GUO
 * 抽象类是否有构造方法？有
 * 既然抽象类不能实例化，为什么要有构造方法？
 * 不是为了自己使用，而是为了子类创建对象使用即super();
 */
public class AbstractDemo2 {
    public static void main(String[] args) {
        /**抽象类不可以被实例化*/
        //Animal2 a = new Animal2();
        Pig2 p = new Pig2();
    }
}
abstract class Animal2{
    public Animal2(){
        System.out.println("我是父类的构造方法");
    }
}

class Pig2 extends Animal2{
    public Pig2(){
        System.out.println("我是子类的无参构造");
    }
}
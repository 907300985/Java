package cn.tedu.review.review;

/**
 * @Date:2021/10/18 9:15
 * @Author:NANDI_GUO
 * 复习多态
 */
public class TestDemo {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Animal a = new Dog();
        a.eat(); /*使用的方法是父类的声明，子类的方法体*/
        System.out.println(a.sum);
        a.summm();
    }
}
abstract class Animal {
    int sum = 10;
    public void eat(){
        System.out.println("吃吃吃吃吃");
    }
    abstract public void summm();
}
class Dog extends Animal{
    int sum = 100;
    @Override
    public void eat() {
        System.out.println("小狗爱吃肉包子");
    }
    public void summm(){
        System.out.println(sum);
    }
}

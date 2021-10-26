package cn.tedu.review.oop;

/**
 * @Date:2021/10/15 14:05
 * @Author:NANDI_GUO
 * 本类用于抽象的入门案例/
 */
public class AbstractDemo {
    public static void main(String[] args) {
        /**抽象类不可以被实例化！！！创建对象*/
        //Animal a = new Animal();
        Animal a = new Pig();
        a.eat();
        a.play();
        a.fly();
    }
}
/**如果一个类中包含了抽象方法，那么这个类必须被声明成一个抽象类*/
//将父类声明成一个抽象类
abstract class Animal{
    public void eat(){
        System.out.println("吃啥都行");
    }
    /**被abstract关键字修饰的方法是抽象方法，抽象方法没有方法体*/
    public abstract void play();

    public abstract void fly();

}
/**当一个子类继承了抽象父类以后，有两种解决方案
 * 方案一：变成抽象子类,"躺平，我也不实现"
 * 方案二：变成普通子类,实现所有父类中未实现的抽象方法，父债子偿
 * */

//abstract class Pig extends Animal{
//
//}

class Pig extends Animal{
    @Override
    public void play(){
        System.out.println("儿子替爸爸玩play()");
    }
    public void fly(){
        System.out.println("实现父类为实现的方法2fly()");
    }
}

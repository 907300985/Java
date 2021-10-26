package cn.tedu.review.exec;

/**
 * @Date:2021/10/15 16:14
 * @Author:NANDI_GUO
 */
public class TestAnimal {
    public static void main(String[] args) {
        Ant a = new Ant();
        Bee b = new Bee();
        a.fly(); //特有
        b.makeHoney();//特有
        a.layeggs(); //继承
        b.layeggs();//继承

    }
}
abstract class Animal{
    int legNumbers;
    int eggNumbers;

    public abstract void layeggs();
}
//创建子类蚂蚁类
class Ant extends Animal{
    int eggNumbers = 2;
    //特有功能
    public void fly(){
        System.out.println("蚂蚁飞啦~");
    }
    @Override
    public void layeggs(){
        System.out.println("正在下蛋。。。"+eggNumbers);
    }
}

class Bee extends Animal{
    int eggNumbers = 10;
    //特有功能
    public void makeHoney(){
        System.out.println("蜜蜂在产蜜");
    }
    @Override
    public void layeggs(){
        System.out.println("正在下蛋。。。"+eggNumbers);
    }
}
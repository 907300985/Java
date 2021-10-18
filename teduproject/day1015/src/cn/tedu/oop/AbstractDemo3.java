package cn.tedu.oop;

/**
 * @Date:2021/10/15 15:06
 * @Author:NANDI_GUO
 * 本类用作抽象类中的成员测试
 */
public class AbstractDemo3 {

}

//创建抽象父类
abstract class Animal3{
    //抽象类中可以定义成员变量吗？可以
    int sum = 100;
    /**抽象类可以定义成员常量吗? 可以*/
    final String ANIMAL_NAME = "小黄人";
    /**抽象类中可以定义普通方法吗--可以
     * 抽象类中可以定义抽象方法吗--可以
     * 抽象类中能否全是普通方法？--可以*/

    /*如果抽象类中都是普通方法，为甚么还要是抽象的类？
    * 因为抽象类不可以被实例化，如果不想让外界创建本类的对象，可以声明为抽象类*/
    public void eat(){

    }
    public void eat2(){

    }

    /*可以全抽*/
    /*如果一个类中含有抽象方法，这个类必须被声明称抽象类*/
    abstract public void play();


    abstract public void play2();


}

class Pig3 extends Animal3{

    @Override
    public void play() {

    }

    @Override
    public void play2() {

    }
}
package cn.tedu.review.oop2;

/**
 * @Date:2021/10/14 16:02
 * @Author:NANDI_GUO
 * 本类用作多态的入门案例
 */
public class TestDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        a.eat();
        c.eat();
        d.eat();
        /**父类对象不可以使用子类的特有功能*/
        c.jump();
        d.run();

        //创建多态对象进行测试
        /**口诀：父类引用子类对象
         * 解释：创建出来的子类对象的地址值，交给父类类型的引用变量类型来保存*/
        Animal a2 = new Cat(); //Cat类对象的地址值交给父类型变量a2来保存
        Animal a3 = new Dog(); //Dog类对象的地址值交给父类型变量a3来保存
        /*口诀2： 编译看左边，运行看右边
        *  解释：必须要在父类定义这个方法，才能通过编译，编译时，把多态对象看作父类类型
        * 必须要在子类重写这个方法，才能满足多态，实际干活的是子类
        * */
        a2.eat();//多态对象使用的是父类的定义，子类的方法体

    }
}
/**多态的前提：继承+重写
 * */
class Animal{
    public void eat(){
        System.out.println("小动物Animal吃啥都行~");
    }
}
//创建子类1
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("小猫爱吃小狗干");
    }
    //添加子类的特有功
    public void jump(){
        System.out.println("小猫Cat跳的很高");
    }
}
//创建子类2
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("小狗爱吃猫骨头~");
    }

    public void run(){
        System.out.println("小狗跑的很块");
    }
}
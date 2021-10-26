package cn.tedu.review.oop2;

/**
 * @Date:2021/10/14 17:01
 * @Author:NANDI_GUO
 * 测试多态成员的使用情况
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        System.out.println(d.sum);
        d.eat();
        /*父类引用指向子类对象*/
        /*编译看左边，运行效果看右边*/
        Animal2 a = new Dog2();
        a.eat();
        /**多态中，调用的静态方法是弗雷德，因为多态对象把自己看作是父类类型
         * 直接使用父类静态资源*/
        /**多态中成员变量使用的是父类
         * 多态中，方法的声明使用的是父类的，方法体使用的是子类的*/
        System.out.println(a.sum);//父类10
        //====================================================
        //@Override
        /**这不是一个重写的方法。只是恰巧在两个类中出现了两个静态方法
         * 静态方法属于类资源，只有一份，不存在重写的现象
         * 在那个类里定义，就作为哪个类的资源使用*/
        a.play();
        Animal2.play();
        Dog2.play();
    }
}
class Animal2{
    int sum = 10;
    public void eat(){
        System.out.println("吃啥都行");
    }

    //父类的静态方法
    public static void play(){
        System.out.println("小动物玩啥都行");
    }
}
class Dog2 extends Animal2{

    int sum = 20;
    @Override
    public void eat(){
        System.out.println("小狗爱吃狗肉煲仔");
    }

    public static void play(){
        System.out.println("小狗喜欢玩皮球");
    }

}
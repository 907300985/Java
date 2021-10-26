package cn.tedu.review.oop;

/**
 * @Date:2021/10/14 14:26
 * @Author:NANDI_GUO
 * 本类用于测试代码块
 * 静态代码块，构造代码块，构造方法，普通方法，局部代码块
 */
public class TestBlock {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        a1.clean();
    }
}
class Apple{
    /**
     * 格式：static{}
     * 类里方法外
     * 执行时机：静态代码块也属于静态资源，随着类的加载而加载，优先于对象加载
     * 并且静态资源只会加载一次
     * 作用：用于加载那些需要第一时间加载并且只加载一次的资源
     * */
    static{
        System.out.println("11111111我是静态代码块");
    }
    /**
     * 构造代码块
     * 类里方法外
     * 创建对象时执行，优先于构造方法
     * 用于提取所有构造方法的共性功能
     * */

    {
        System.out.println("222222222我是构造代码块");
    }
    public Apple(){
        System.out.println("3333333333我是无参构造");
    }
    public void clean(){
        System.out.println("444444444我是一个普通方法");

        {
            /**
             * 方法里
             * 每次调用局部代码块所属的方法时才会执行
             * 用于控制变量的作用范围
             * */
            System.out.println("5555555555我是局部代码块");
        }
    }
}

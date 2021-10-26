package cn.tedu.review.review.Constructor.oop;

/**
 * @Date:2021/10/13 11:12
 * @Author:NANDI_GUO
 * 类用于测试代码块
 */

/**构造代码块 -> 构造方法 -> 普通方法 -> 局部代码块*/
/**创建对象时，会触发构造函数
 * 创建对象也会触发构造代码块并且构造代码块优先于构造方法执行
 * 我们创建好对象才能通过对象调用普通方法
 * 如果普通方法里也有局部代码块，才会触发所对应的局部代码块
 * */
public class TestBlock {
    public static void main(String[] args) {
        Pig p = new Pig();
        Pig p2 = new Pig(" 母猪佩奇 ");
        Pig p3 = new Pig("菜叶子",3);
        System.out.println(p3.age+p3.food);

        p.eat();
        p2.eat();
        p3.eat();
    }
}

class Pig {
    String food;
    int age;

    {
        /**构造代码块
         * 类里方法外
         * 执行时期：每次创建对象时都会执行构造代码块，并且构造代码块优先于构造方法执行
         * 作用：用于提取所有构造方法的共性功能
         * */
        System.out.println("=============构造代码块=============");
    }

    public Pig() {
        System.out.println("我是pig类的无参构造");
    }

    public Pig(String s) {
        System.out.println("我是pig类的有参构造" + s);
    }

    //创建全参构造
    public Pig(String food, int age) {
        this.food = food;
        this.age = age;
    }

    public void eat() {
        System.out.println("小猪爱吃菜叶子");
        {
            /**局部代码块
             * 1.位置：方法里
             * 2.执行时机：调用本局部代码块所处的方法是才会执行
             * 3.作用: 用于控制变量的作用范围，变量的作用范围越小越好
             * */
            System.out.println(">>>>>>>>>>>>>>>>>>局部代码块>>>>>>>>>>>>>>>>");
            int i = 100;
            System.out.println(i);
        }
        //System.out.println(i); i只能在局部代码块中使用
    }
}
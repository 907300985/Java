package cn.tedu.review.Constructor.oop.oop;

/**
 * @Date:2021/10/12 10:28
 * @Author:NANDI_GUO
 */

/**
 * 在一个JAVA文件中，可以有多个class
 * 但是只能有一个public class，名字是当前文件的名字
 * */

public class TestClass {
    public static void main(String[] args) {
        phone p1 = new phone();
        p1.brand = "Samsung";
        p1.color = "Blue";
        p1.price = 4999;
        p1.size = 5.8;

        System.out.println(p1.brand);
        System.out.println(p1.color);
        System.out.println(p1.price);
        System.out.println(p1.size);

        p1.call();
        p1.message();
        p1.video();

        //==========================================我是分隔符

        phone p2 = new phone();
        p2.brand = "apple";
        p2.size = 5.5;
        p2.price = 3999;
        p2.color = "black";

        System.out.println(p2.brand);
        System.out.println(p2.color);
        System.out.println(p2.price);
        System.out.println(p2.size);

        p2.call();
        p2.message();
        p2.video();

    }
}

class phone{
    String brand;
    double price;
    double size;
    String color;

    static void call(){
        System.out.println("我在打电话");
    }
    static void message(){
        System.out.println("我在发短信");
    }
    static void video(){
        System.out.println("我在看视频");
    }
}
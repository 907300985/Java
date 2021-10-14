package cn.tedu.review.Constructor.oop2;

/**
 * @Date:2021/10/13 17:27
 * @Author:NANDI_GUO
 * 用于测试继承中构造方法的使用
 * 子类在创建对象时，默认会调用父类的构造方法
 * 原因是子类构造函数中的第一行默认存在super（）--表示调用父类的无参构造函数
 * 当父类没有无参构造时，可以通过super（参数）调用父类其他的含参构造
 * 子类必须调用一个弗雷德构造函数，不管是无参还是含参，选一个即可
 * 构造方法不可以被继承！因为语法：要求构造方法的名字必须是本类类名
 * 不能在子类中出现一个父类名字的构造方法
 */
public class ExtendsDemo2 {
    public static void main(String[] args) {
//        new Father2();
//        new Father2("父亲");

          new Son2();
        //new Son2("儿子");
    }
}
class Father2{
//    public Father2(){
//        System.out.println("我是父类的无参构造");
//    }

    public Father2(String s) {
        System.out.println("我是父类的有参构造" + s);
    }
}


class Son2 extends Father2{

    public Son2(){
        super("你好");
        System.out.println("我是子类的无参构造");
    }

    public Son2(String s){
        super("你好");
        System.out.println("我是子类的有参构造" + s);
    }
}
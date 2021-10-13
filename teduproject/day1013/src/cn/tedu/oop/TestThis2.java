package cn.tedu.oop;

/**
 * @Date:2021/10/13 14:30
 * @Author:NANDI_GUO
 */
public class TestThis2 {
    public static void main(String[] args) {
       Dog d = new Dog();
       //Dog d2 = new Dog("笨笨");
    }
}
//创建类
class Dog{
    //无参构造
    public Dog() {
        /**在无参构造中调用韩餐构造的功能
         * 不能双向调用
         * */
        this("xww");
        System.out.println("无参构造");
    }
    //含参构造
    public Dog(String s) {
        /**含参构造中调用无参构造的功能
         * this 必须在构造函数的第一行
         * */
        //this();
        System.out.println("含参构造"+s);
    }
}

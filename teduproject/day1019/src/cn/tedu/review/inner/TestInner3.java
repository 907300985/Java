package cn.tedu.review.inner;

/**
 * @Date:2021/10/19 11:06
 * @Author:NANDI_GUO
 */
public class TestInner3 {
    public static void main(String[] args) {
//        Outer3.Inner3 oi = new Outer3().new Inner3();
//        oi.show();
//        new Outer3().new Inner3().show();
        /*现象：当成员内部类被static修饰以后，new Outer3()外部类对象会报错
        * 结论：创建静态成员内部类对象时，不要先创建外部类对象，直接通过类名调用*/
        //new Outer3.Inner3().show();
        /*访问静态内部类的静态资源--链式加载*/
        Outer3.Inner3.show2();

    }
}
class Outer3{
    //成员内部类被static修饰，并不常用--浪费内存
   static class Inner3{
        public void show(){
            System.out.println("Inner3的show()");
        }
        //静态方法
        static public void show2(){
            System.out.println("Inner3的show2()");
        }
    }
}
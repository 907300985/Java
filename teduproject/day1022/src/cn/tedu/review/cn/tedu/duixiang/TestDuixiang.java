package cn.tedu.review.cn.tedu.duixiang;

/**
 * @Date:2021/10/23 9:17
 * @Author:NANDI_GUO
 */
public class TestDuixiang {
    public static void main(String[] args) {
        Child c = new Child();
        //Parent p = new Parent();
    }
}
class Parent{
    private int a = 2;
    public Parent() {
        System.out.println("Parent:" + a);
        show();
    }
    public void show(){
        System.out.println("a1:" + a);
    }
}

class Child extends Parent{
 //   private int a = 2;
//    public Parent() {
//        System.out.println("Parent:" + a);
//        show();
//    }
    int a = 3;
    public Child(){
        System.out.println("Child:" + a);
    }
    public void show(){
        System.out.println("a2:" + a);
    }
}
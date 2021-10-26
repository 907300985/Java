package cn.tedu.review.inner;

/**
 * @Date:2021/10/19 11:33
 * @Author:NANDI_GUO
 */
public class TestInner4 {
    public static void main(String[] args) {
        /*局部内部类的资源：直接调用外部类的show方法不行！
        * 要执行局部内部类的功能必须先创建局部内部类的对象*/
        new Outer4().show();

    }
}
class Outer4{
    public void show(){
        System.out.println("Outer4的show()");
        /*局部内部类位置--方法里*/
        class Inner4{
            String name;
            int age;
            public void eat(){
                System.out.println("Outer4的show()的Inner4的eat()");
            }
        }
        //创建局部类对象并调用局部内部类功能
        Inner4 i = new Inner4();
        i.eat();
        System.out.println(i.age);
        System.out.println(i.name);
    }
}

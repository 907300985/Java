package cn.tedu.innerclass;

/**
 * @Date:2021/10/18 17:05
 * @Author:NANDI_GUO
 * 内部类的入门案例
 */
public class TestInnter1 {
    public static void main(String[] args) {
        //创建内部类对象
        Outer o = new Outer();
        /*内部类创建方法：外部类名.内部类名 对象名 = 外部类对象.内部类对象*/
        Outer.Inner oi = new Outer().new Inner();
        oi.delete();
        System.out.println(oi.sum);

        new Outer().find();

    }
}
class Outer{
    String name;
    private int age;
    public void find(){
        System.out.println("Outer...find()");
        //测试外部类能否使用内部类资源
       // System.out.println(sum);
        //delete(); //不能直接使用
        /*外部类如果想要使用内部类资源，必须要先创建内部类的对象，然后通过内部类对象调用*/
        new Inner().delete();
        System.out.println(new Inner().sum);
    }
    //定义内部类--外部类的一个成员
    /*根据内部类所在位置的不同，分为：成员内部类（类里方法外）与局部内部类（方法里）*/
    class Inner{
        int sum = 10;
        public void delete(){
            /*结论：内部类可以直接使用外部类的资源，包括私有资源*/
            System.out.println("Inner...delete()");
            //测试内部类是否可以使用外部类资源
            System.out.println(name);
            System.out.println(age);
            //find();
        }

    }
}
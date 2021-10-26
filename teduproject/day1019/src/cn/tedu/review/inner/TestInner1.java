package cn.tedu.review.inner;

/**
 * @Date:2021/10/19 10:08
 * @Author:NANDI_GUO
 * 复写内部类入门案例
 */
public class TestInner1 {
    public static void main(String[] args) {

        Outer.Inner oi = new Outer().new Inner();
        oi.delete();
        System.out.println(oi.sum);

        Outer o = new Outer();
        o.find();

    }
}
class Outer{
    //创建外部类成员变量
    String name;
    private int age;
    public void find(){
        System.out.println("外部类的find()");
        Inner i = new Inner();
        System.out.println(i.sum);
        i.delete();
    }

    /*成员内部类：类里方法外
    * 局部内部类：方法里*/
    class Inner{
        int sum = 10;
        public void delete(){
            System.out.println("Inner的delete()");
            System.out.println(age);
            System.out.println(name);
            //find();
        }
    }
}

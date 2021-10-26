package cn.tedu.review.review;

/**
 * @Date:2021/10/18 9:34
 * @Author:NANDI_GUO
 * 本类用来复习抽象
 */
public class AbstractTest {
    public static void main(String[] args) {
        Teacher t = new CGBTeacher();
        CGBTeacher t1 = new CGBTeacher();

        t.name = "456";

        System.out.println(t1.name);
    }
}
abstract class Teacher{
    String name;
    int id;



    abstract public void ready();
    abstract public void teach();
}
class CGBTeacher extends Teacher{
    @Override
    public void ready(){
        System.out.println("在准备大数据的课");
    }
    @Override
    public void teach(){
        System.out.println("在教学大数据的课");
    }
}
abstract class ACTTeacher extends Teacher{
    /*只要没有全部实现父类的抽象方法
    * 这个子类就是抽象类*/
    @Override
    public void ready(){
        System.out.println("在准备新课");
    }
}



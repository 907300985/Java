package cn.tedu.review.review;

/**
 * @Date:2021/10/19 9:23
 * @Author:NANDI_GUO
 */
public class TestInter1 {
    public static void main(String[] args) {
        //Inter1 i = new Inter1()

    }
}
interface Inter1{
    int age = 10;
    public static final int sum = 20;

    public abstract void eat();
    void play();
    
}
//abstract class Inter1Imp2 implements Inter1{}
class Inter1Impl implements Inter1{

    @Override
    public void eat() {
        System.out.println("吃早餐");
    }

    @Override
    public void play() {
        System.out.println("玩代码~");
    }
}

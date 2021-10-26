package cn.tedu.review.review;

/**
 * @Date:2021/10/19 9:39
 * @Author:NANDI_GUO
 */
public class TestInter2 {
}
interface Inter2{
    void add();
    void delete();
}
interface Inter3{
    void update();
    void find();
}
interface Inter4 extends Inter1,Inter2{
    void eat();
}
class Inter4Impl implements Inter4{

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }
}
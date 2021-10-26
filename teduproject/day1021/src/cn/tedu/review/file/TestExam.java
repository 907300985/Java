package cn.tedu.review.file;

/**
 * @Date:2021/10/21 19:33
 * @Author:NANDI_GUO
 */
public class TestExam {
    public static void main(String[] args) {
        Test t = new Test();
        t.count();
    }
}
class Parent{
    public int count(){
        return 0;
    }
}
class Test extends Parent{
    private int i;
    @Override
    public int count(){
        return i%9;
    }
}
package cn.tedu.review.inner;

/**
 * @Date:2021/10/19 11:57
 * @Author:NANDI_GUO
 */
public class TestInner5 {
    public static void main(String[] args) {
        new Inter1() {
            @Override
            public void play() {

            }

            @Override
            public void eat() {
                System.out.println("干饭");
            }
        }.eat();
    }
}
interface Inter1{
    void play();
    void eat();
}

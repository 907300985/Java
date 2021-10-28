package cn.tedu.review;

/**
 * @Date:2021/10/27 9:26
 * @Author:NANDI_GUO
 */
public class TestThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class MyThread extends Thread{
    //重写父类的run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"="+getName());
        }
    }
}
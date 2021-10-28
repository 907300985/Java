package cn.tedu.review;

/**
 * @Date:2021/10/27 9:33
 * @Author:NANDI_GUO
 */
public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i+"="+Thread.currentThread().getName());
        }
    }
}

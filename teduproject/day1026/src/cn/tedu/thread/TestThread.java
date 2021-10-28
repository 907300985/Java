package cn.tedu.thread;

/**
 * @Date:2021/10/26 14:06
 * @Author:NANDI_GUO
 */
public class TestThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); /*对应的是线程的新建状态*/
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
//自定义线程类
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println(getName()+"="+i);
        }
    }
}

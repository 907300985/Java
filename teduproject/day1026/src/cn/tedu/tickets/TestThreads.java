package cn.tedu.tickets;

/**
 * @Date:2021/10/26 15:26
 * @Author:NANDI_GUO
 * 设计多线程编程模型
 * 4个窗口共计售票100张
 * 实现方案1 ExtendsThread
 */
public class TestThreads {
    public static void main(String[] args) {
        Tickets t1 = new Tickets();
        Tickets t2 = new Tickets();
        Tickets t3 = new Tickets();
        Tickets t4 = new Tickets();
        Tickets t5 = new Tickets();
        Tickets t6 = new Tickets();
        Tickets t7 = new Tickets();
        Tickets t8 = new Tickets();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
class Tickets extends Thread{
    static int tic = 100;  //设为静态，全局所有对象共享
    @Override
    public void run() {
        while (tic>0){
            System.out.println(getName()+"="+tic--);
        }
    }
}
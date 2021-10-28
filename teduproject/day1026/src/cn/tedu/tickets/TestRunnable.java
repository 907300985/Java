package cn.tedu.tickets;

import java.sql.Statement;

/**
 * @Date:2021/10/26 16:06
 * @Author:NANDI_GUO
 * 售票100张
 */
public class TestRunnable {
    public static void main(String[] args) {
        TicketThread target = new TicketThread();
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        Thread t4 = new Thread(target);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class TicketThread implements Runnable{
    static int tickets = 100;
    @Override
    public void run() {
        while(tickets>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"="+tickets--);
        }
    }
}
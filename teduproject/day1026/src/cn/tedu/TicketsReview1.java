package cn.tedu;

/**
 * @Date:2021/10/26 19:47
 * @Author:NANDI_GUO
 */
public class TicketsReview1 {
    public static void main(String[] args) {
        Ticketsthreads t1 = new Ticketsthreads();
        Ticketsthreads t2 = new Ticketsthreads();
        Ticketsthreads t3 = new Ticketsthreads();
        Ticketsthreads t4 = new Ticketsthreads();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class Ticketsthreads extends Thread{
    static int tickets = 100;
    static Object o = new Object();
    @Override
    public void run() {
            while (true){
                synchronized (o){
                if (tickets>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    System.out.println(getName() + "=" + tickets--);
                }
                if(tickets<=0) break;
                }
            }
    }
}
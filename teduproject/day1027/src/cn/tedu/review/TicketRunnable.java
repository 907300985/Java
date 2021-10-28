package cn.tedu.review;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Date:2021/10/27 9:42
 * @Author:NANDI_GUO
 */
public class TicketRunnable {
    public static void main(String[] args) {
        TicketR target = new TicketR();
//        Thread t1 = new Thread(target);
//        Thread t2 = new Thread(target);
//        Thread t3 = new Thread(target);
//        Thread t4 = new Thread(target);

//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
        /*Excutors是用来辅助创建线程池的工具类
        * 常用方法：newFixedThreadPoll(int)
        * 这个方法可以创建指定数目线程的线程池对象
        * 创建出来的线程池对象就是ExecutorService, 负责：新建/启动/销毁 线程
        *
        * */
        ExecutorService pool = Executors.newFixedThreadPool(16);
        for (int i = 0 ; i < 16; i++){
            /*execute()让线程池中的线程来执行业务，每次调用都会将一个线程加入就绪队列*/
            pool.execute(target);/*本方法的参数就是你要执行的业务，也就是目标业务类对象*/
        }
    }
}
class TicketR implements Runnable{
    int tic = 100;
    @Override
    public void run() {
        while (true){
            synchronized (TicketR.class){
                if (tic>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"="+tic--);
                }
                if (tic<=0) break;
            }

        }
    }
}
package cn.tedu.tickets;

import com.sun.corba.se.spi.ior.ObjectKey;

/**
 * @Date:2021/10/26 17:47
 * @Author:NANDI_GUO
 */
public class TestThreadV2 {
    public static void main(String[] args) {
        TicketsV2 t1 = new TicketsV2();
        TicketsV2 t2 = new TicketsV2();
        TicketsV2 t3 = new TicketsV2();
        TicketsV2 t4 = new TicketsV2();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class TicketsV2 extends Thread{
    //static   Object o = new Object();
    static int tic = 100;  //设为静态，全局所有对象共享
    @Override
    public void run() {
        while (true){
            /*我们每通过class关键字创建一个类，就会在工作空间中生成唯一对应的类名.class字节码文件
            * 这个类名.class对应的对象 ，我们称之为这个类的字节码对象
            * 字节码对象极其重要，是反射技术的基石，字节码对象中包含了当前类所有的关键信息
            * 所以，用这样唯一且明确的对象做为同步代码块的锁对象，很合适了*/
            synchronized (TicketsV2.class){
                if (tic > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"="+tic--);
                }
                if (tic<=0) break;

            }
        }
    }
}


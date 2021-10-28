package cn.tedu.tickets;

/**
 * @Date:2021/10/26 17:19
 * @Author:NANDI_GUO
 */
public class TestRunnableV2 {
    public static void main(String[] args) {
        TicketRunnableV2 target = new TicketRunnableV2();
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
/*同步锁：
* 相当于给容易出现问题的代码加了一把锁，包裹了所有可能会出现数据安全问题的代码
* 枷锁之后，就有了同步（排队）的效果，但是枷锁的范围需要考虑：
* 太大，效率低，都得排队。太小锁不住，还是会有安全隐患*/
class TicketRunnableV2 implements Runnable{
    static int tickets = 100;
    Object o = new Object();
    @Override
    public void run() {
        while(true){
            /*同步代码块：syn(){}*/
            synchronized (o) {
                if(tickets > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "=" + tickets--);
                }
                if (tickets <= 0 ) break;
            }
        }
    }
}

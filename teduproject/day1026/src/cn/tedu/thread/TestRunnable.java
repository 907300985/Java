package cn.tedu.thread;

/**
 * @Date:2021/10/26 14:42
 * @Author:NANDI_GUO
 * 苯类用于多线程变成实现方案二：实现Runnable接口
 */
public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable target = new MyRunnable();
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
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            /*问题：自定义类与父接口Runnable中都没有获取名字的方法
            * 所以还需要从thread里找
            * currentThread（）：静态方法，获取当前正在执行的线程对象
            * getName（）获取当前正在执行的线程对象的名称*/
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
package cn.tedu.review.serializable;

import java.io.*;

/**
 * @Date:2021/10/22 10:23
 * @Author:NANDI_GUO
 * 本类用来测试序列化与反序列化
 * 序列化：ObjectOutputStream
 * 反序列化：ObjectInputStream
 * 推荐大家一次序列化操作对应一次反序列化操作
 */
public class TestSerializable {


    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream("D:\\ready\\1.txt"));

            Object obj = in.readObject();
            System.out.println(obj);
            System.out.println("反序列化读取成功");

        }catch (Exception e){
            System.out.println("反序列化读取失败");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private static void method1() {
        /*序列化输出的数据我们是看不懂的
        * 我们需要后期通过反序列化技术把之前输出的数据重新回复成对象，才能使用*/
        ObjectOutputStream out = null;
        try{
            out = new ObjectOutputStream(new FileOutputStream("D:\\ready\\1.txt"));
            Student obj = new Student("海绵宝宝",3,"sea",'M');
            out.writeObject(obj);
            System.out.println("序列化成功");

        }catch (Exception e){
            System.out.println("序列化失败");
            e.printStackTrace();
        }finally {
            try {
                out.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

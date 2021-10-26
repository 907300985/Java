package cn.tedu.review.file;

import java.io.*;

/**
 * @Date:2021/10/21 10:33
 * @Author:NANDI_GUO
 * 本类用来练习字节输入流
 */
public class TestIn {
    public static void main(String[] args) {
        //method();
        method2();
    }

    private static void method2() {
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
            int b;
            while (((b=in.read())!=-1)){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method() {
        //创建流对象，注意InputStream是抽象父类，不可以实例化
        //注意InputStream是抽象父类，不可以实例化
        //创建一个在本方法中都生效的局部变量
        InputStream in = null;
        try {
            //InputStream in2 = new FileInputStream(new File("D:\\ready\\1.txt"));
            in = new FileInputStream("D:\\ready\\1.txt");
            /*read（）每次调用都会读取一个字节，如果读到了文件数据的末尾，返回-1
            * 这个方法的返回值类型是int，所以会查找指定字符对应的编码打印出来
            * */
//            System.out.println((char)in.read());
//            System.out.println((char)in.read());
//            System.out.println((char)in.read());
//            System.out.println(in.read());
//            System.out.println(in.read());
            int b;
            //循环读取数据，只要不是-1就证明还有数据，继续循环
            while ((b = in.read()) != -1){
                System.out.println(b);
            }
        }catch (Exception e){
            e.printStackTrace() ;
        }finally{
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

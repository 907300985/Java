package cn.tedu.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @Date:2021/10/21 14:04
 * @Author:NANDI_GUO
 * 测试字符输入流Reader的读取操作
 */
public class TestIn2 {
    public static void main(String[] args) {
        //method();//普通字符流
        method2();//高效字符流
    }

    private static void method2() {
        BufferedReader in2 = null;
        int a;
        try {
            in2 = new BufferedReader(new FileReader("D:\\ready\\1.txt"));
            while((a=in2.read())!=-1){
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                in2.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void method() {
        //创建流对象
        FileReader in2 = null;
        int a;
        try {
            in2 = new FileReader("D:\\ready\\1.txt");
            while((a=in2.read())!=-1){
                System.out.println(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try{
                in2.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package cn.tedu.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Date:2021/10/21 20:28
 * @Author:NANDI_GUO
 */
public class ZjReview {
    public static void main(String[] args) {
        //method();
        method1();
    }

    private static void method1(){
        BufferedInputStream a = null;
        try{
            a = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));
            int b;
            while((b = a.read())!=-1){
                System.out.println(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                a.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void method() {
        FileInputStream a = null;
        try{
            a = new FileInputStream("D:\\ready\\1.txt");
            int b;
            while((b = a.read())!=-1){
                System.out.println(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                a.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

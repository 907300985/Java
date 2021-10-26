package cn.tedu.review.serializable;

import java.io.*;

/**
 * @Date:2021/10/22 9:16
 * @Author:NANDI_GUO
 */
public class TestCreateStream {
    public static void main(String[] args) {
        f1();
        //f2();
        //f3();
        f4();
    }

    private static void f4() {
        Writer out = null;
        Writer out2 = null;
        try {
            out = new FileWriter("D:\\ready\\1.txt",true);
            out2 = new BufferedWriter(new FileWriter("D:\\ready\\1.txt",true));

            out.write(99);
            out2.write(100);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
           try {
               out.close();
           }catch (Exception e){
               e.printStackTrace();
           }
           try {
               out2.close();
           }catch (Exception e){
               e.printStackTrace();
           }
        }
    }

    private static void f3() {
        Reader a = null;
        Reader a1 = null;
        try{
            a = new FileReader("D:\\ready\\1.txt");
            a1 = new BufferedReader(new FileReader("D:\\ready\\1.txt"));

            int b;
            while((b=a.read())!=-1){
                System.out.println(b);
            }
            while((b=a1.read())!=-1){
                System.out.println(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                a.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            try {
                a1.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void f2() {
        OutputStream a = null;
        OutputStream a1 = null;
        try {
            a = new FileOutputStream("D:\\ready\\1.txt",true);
            //OutputStream a2 = new FileOutputStream(new File("D:\\ready\\1.txt"),true);
            a1 = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt"));

            a.write(97);
            a1.write(97);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                a.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                a1.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    private static void f1() {
        InputStream a = null;
        InputStream a1 = null;
        try {
            a = new FileInputStream("D:\\ready\\1.txt");
            a1 = new BufferedInputStream(new FileInputStream("D:\\ready\\1.txt"));

            int b;
            while ((b = a.read()) != -1){
                System.out.println(b);
            }
            while ((b = a1.read()) != -1){
                System.out.println(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                a.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                a1.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package cn.tedu.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Date:2021/10/21 15:39
 * @Author:NANDI_GUO
 */
public class TestOut2 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        BufferedWriter a = null;
        try {
            a = new BufferedWriter(new FileWriter("D:\\ready\\1.txt"));
            a.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                a.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    private static void method1() {
        FileWriter a = null;
        try {
            a = new FileWriter("D:\\ready\1.txt",true);
            a.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

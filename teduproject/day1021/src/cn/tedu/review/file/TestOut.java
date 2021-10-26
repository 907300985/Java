package cn.tedu.review.file;

import java.io.*;

/**
 * @Date:2021/10/21 14:37
 * @Author:NANDI_GUO
 */
public class TestOut {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method2() {
        FileOutputStream op = null;
        try {
            op = new FileOutputStream("D:\\ready\\1.txt",true);
            op.write(97);
            op.write(97);
            op.write(97);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                op.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        BufferedOutputStream op = null;
        try {
            op = new BufferedOutputStream(new FileOutputStream("D:\\ready\\1.txt",true));
            op.write(97);
            op.write(97);
            op.write(97);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                op.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

package cn.tedu.review.file;

import java.io.*;
import java.util.Scanner;

/**
 * @Date:2021/10/21 17:11
 * @Author:NANDI_GUO
 */
public class TestCopyFile {
    public static void main(String[] args) {
        System.out.println("请输入源文件路径：");
        String f = new Scanner(System.in).next();
        System.out.println("请输入new文件路径：");
        String t = new Scanner(System.in).next();
        
        ZFCopy(f,t);
        ZJCopy(f,t);
        
    }

    private static void ZJCopy(String f, String t) {
        InputStream in = null;
        OutputStream out = null;
        try{
           in = new BufferedInputStream(new FileInputStream(f));
           out = new BufferedOutputStream(new FileOutputStream(t));
           int b;
           while ((b = in.read())!= -1) {
               out.write(b);
           }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static void ZFCopy(String f, String t) {
        Reader in = null;
        Writer out = null;

        try {
            in = new BufferedReader(new FileReader(f));
            out = new BufferedWriter(new FileWriter(t));

            int b;
            while((b = in.read())!= -1){
                out.write(b);
            }
            System.out.println("文件复制成功");
        }catch (Exception e){
            System.out.println("失败");
            e.printStackTrace();
        }finally {
            /*关流是有顺序的，如果有多个流，最后创建的流最先关闭
            * 多条关流语句需要各自try-catch*/
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

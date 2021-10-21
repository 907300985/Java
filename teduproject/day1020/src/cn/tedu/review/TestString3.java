package cn.tedu.review;

import java.util.Arrays;

/**
 * @Date:2021/10/20 10:30
 * @Author:NANDI_GUO
 */
/*使用操作字符串的方法，还是使用String的API
* 拼接字符串用StringBuffer和StringBuilder*/
public class TestString3 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        //method1(s);
        method2(s); //测试StringBuilder或者StringBuffer的字符串拼接
    }

    private static void method2(String s) {
        //StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb2.append(s);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(sb2);
        System.out.println(t2-t1);
    }

    private static void method1(String s) {
        String result = "";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10000 ; i++) {
            result += s;
        }
        long t2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(t2-t1);
    }
}

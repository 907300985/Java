package cn.tedu.review;

import java.util.Scanner;

/**
 * @Date:2021/10/8 9:45
 * @Author:NANDI_GUO
 */
public class TestBasic {
    public static void main(String[] args) {
        System.out.println("请输入第一个数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第一个数"); 
        int b = new Scanner(System.in).nextInt();

        int helper;
        helper = a;
        a = b;
        b = helper;

        System.out.println("交换后, a = "+ a + " b = " + b);
    }
}

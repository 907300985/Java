package cn.tedu.review;

import java.util.Scanner;

/**
 * @Date:2021/10/8 11:57
 * @Author:NANDI_GUO
 */
public class sanyuan {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int max = a>b? a:b;
        System.out.println(max);
    }
}

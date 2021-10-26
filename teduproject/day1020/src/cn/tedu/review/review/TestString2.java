package cn.tedu.review.review;

import java.util.Arrays;

/**
 * @Date:2021/10/20 10:04
 * @Author:NANDI_GUO
 */
public class TestString2 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());


        String s5 = "a b c d e";
        String[] s = s5.split(" ");
        System.out.println(Arrays.toString(s));
    }
}

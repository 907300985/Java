package cn.tedu.cn.tedu.api;

import java.util.Arrays;

/**
 * @Date:2021/10/19 17:15
 * @Author:NANDI_GUO
 * 测试String类的常用方法
 */
public class TestString2 {
    public static void main(String[] args) {
        String s1 = "abc";

        char[] c = {'a','b','c'};
        String s2 = new String(c);

        System.out.println(s1);
        System.out.println(s2);
        /*String重写了hashcode（），根据字符串的具体内容生成哈希码值
        * 所以s1 s2生成的哈希码值一致*/
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));

        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.startsWith("a"));
        System.out.println(s1.endsWith("c"));

        System.out.println(s1.charAt(2));

        String s3 = "abcdbeba";
        System.out.println(s3.indexOf("b"));
        System.out.println(s3.lastIndexOf("b"));

        System.out.println(s2.concat("cxy"));
        System.out.println(s2);

        String s5 = "   hh hhhhhhh   ";
        System.out.println(s5.trim());//去除两端空格

        String s6 = "abcdefgh";
        System.out.println(s6.substring(3)); //从指定小标出截取
        System.out.println(s6.substring(3,6));//含头不含尾

        String s7 = "afbfcfdfef";   //以指定的字符f分割字符串
        System.out.println(Arrays.toString(s7.split("f")));

        System.out.println(String.valueOf(10));
        System.out.println(String.valueOf(10)+10);//将int类型转为String类型

        byte[] bytes = s3.getBytes();//字符串转bytes
        System.out.println(Arrays.toString(bytes));
    }
}

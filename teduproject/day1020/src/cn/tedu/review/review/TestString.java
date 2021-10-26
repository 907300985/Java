package cn.tedu.review.review;

/**
 * @Date:2021/10/20 9:36
 * @Author:NANDI_GUO
 */
public class TestString {
    public static void main(String[] args) {
        //创建String对象的方式1 -- 存在堆里
        //创建String对象的方式--存在堆中的常量池

        char[] values = {'a','b','c'};
        String s1 = new String(values);
        String s11 = new String(values);
        String s2 = "abc";
        String s22 = "abc";

        System.out.println(s1==s2);
        System.out.println(s1==s11);
        System.out.println(s2==s22);

        String s3 = "aaa";
        //重写，全部围绕字符串的具体内容
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1.equals(s2));
    }
}

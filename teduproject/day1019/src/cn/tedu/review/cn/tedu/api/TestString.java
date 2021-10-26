package cn.tedu.review.cn.tedu.api;

/**
 * @Date:2021/10/19 16:33
 * @Author:NANDI_GUO
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("查看s1"+s1);

        //创建String对象的方式1
        /*1.字符串类型底层维护的是char[].存在堆内存中*/
        char[] values = {'a','b','c'};
        String s2 = new String(values);
        String s22 = new String(values);
        System.out.println("查看"+s2);
        /*此种创建方式不仅写法简单，效率还高，字符串存在堆内存中的常量池
        * 效果：如果第一次创建，会正常放入常量池，但第二次创建就不会在常量池里新建了
        * 使用的是之前创建好的值*/
        String s3 = "abc";
        String s33 = "abc";
        System.out.println("查看"+s3);
        System.out.println(s2 == s22);//false new了两次，两个对象
        System.out.println(s3 == s33);//true，都指向常量池中的abc,只有一份
        System.out.println(s2 == s3);//false，一个堆一个常量池

        System.out.println(s2.equals(s22));//true 比较字符串的具体内容
        String s4 = "hello";
        System.out.println(s4.equals(s2));//false
        /**Object中equals默认使用==比较地址值
         * 但String重写了这个方法，比较的是两个字符串的具体内容
         * 不论创建方式，只要字符串的内容一样，equals（）就返回true*/
    }
}

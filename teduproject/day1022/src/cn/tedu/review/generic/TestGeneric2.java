package cn.tedu.review.generic;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;

/**
 * @Date:2021/10/22 14:36
 * @Author:NANDI_GUO
 */
public class TestGeneric2 {
    public static void main(String[] args) {
        //打印数组中所有元素
        List<Integer> list1 = new ArrayList();
        Integer[] a = {1,2,3,4,5,6,7,8,9,10};
        print(a);
        String[] b = {"大哥","二哥","三哥","四哥"};
        print(b);
        Double[] c = {6.0,6.6,6.66,6.666,6.6666};
        print(c);

        /*高效for循环
        * 好处：简单高效
        * 语法: for（1 2：3）
        * 要遍历的数据 数据类型 变量名：
        * 只能从头到尾遍历*/
//        for(Integer iii : a){
//            System.out.println(iii);
//        }
     }

     /*泛型可以实现通用代码的编写，使用E表示的元素类型是Element元素
     * 泛型的语法要求：如果在方法上使用泛型，必须两处同时出现
     * 一个是传入参数的类型为泛型，一个是返回值前的泛型类型，表示这是一个类型方法*/
     static <E> void print(E[] a) {
//        for (int i = 0; i < a.length ; i++) {
//            System.out.println(a[i]);
//        }
         for (E e1: a) {
             System.out.println(e1);
         }
    }

    private static void print(Integer[] a) {
//        for (int i = 0; i < a.length ; i++) {
//            System.out.println(a[i]);
//        }
        for (Integer a1: a) {
            System.out.println(a1);
        }
    }
    private static void print(String[] a) {
//        for (int i = 0; i < a.length ; i++) {
//            System.out.println(a[i]);
//        }
        for (String s: a) {
            System.out.println(s);
        }
    }
    private static void print(Double[] a) {
//        for (int i = 0; i < a.length ; i++) {
//            System.out.println(a[i]);
//        }
        for (Double d1 : a){
            System.out.println(d1);
        }
    }
}

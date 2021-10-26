package cn.tedu.review.api;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Date:2021/10/20 15:31
 * @Author:NANDI_GUO
 */
public class TestBigDecimal {
    public static void main(String[] args) {
        //f1();
        f2();
    }

    private static void f2() {
        System.out.println("请输入要计算的两个小数：");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        //最好不用double作为构造函数的参数类型，推荐使用String类型参数
        BigDecimal bd1 = new BigDecimal(String.valueOf(a));
        BigDecimal bd2 = new BigDecimal(String.valueOf(b));

        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        //divide()除不尽时爆出算数异常，需要设置保留位数，进位方式
        System.out.println(bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP));
    }

    private static void f1() {
        System.out.println("请输入要计算的两个小数：");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

}

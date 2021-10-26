package cn.tedu.review.api;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * @Date:2021/10/20 16:16
 * @Author:NANDI_GUO
 */
public class TestBig {
    public static void main(String[] args) {
        System.out.println("请输入数据：");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();

        BigDecimal b1 = new BigDecimal(a+"");
        BigDecimal b2 = new BigDecimal(b+"");

        System.out.println("加法"+b1.add(b2));
        System.out.println("减法"+b1.subtract(b2));
        System.out.println("乘法"+b1.multiply(b2));
        System.out.println("除法"+b1.divide(b2,2, RoundingMode.HALF_UP));
    }
}

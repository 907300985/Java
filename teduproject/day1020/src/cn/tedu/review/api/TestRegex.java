package cn.tedu.review.api;

import java.util.Scanner;

/**
 * @Date:2021/10/20 11:37
 * @Author:NANDI_GUO
 * 正则表达式
 */
public class TestRegex {
    static String regex = "[0-9]{17}[0-9X]";
    public static void main(String[] args) {
        String input;
        do {
            System.out.println("请输入身份证号：");
            input = new Scanner(System.in).next();
            if (input.matches(regex)){
                System.out.println("输入正确");
                return;
            }
        }while(!input.matches(regex));
        System.out.println(input);
    }
}

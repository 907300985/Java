package cn.tedu.api;

import java.util.Scanner;

/**
 * @Date:2021/10/20 14:01
 * @Author:NANDI_GUO
 */
public class TestRegex2 {
    public static void main(String[] args) {
    //定义正则表达式
        String regex = "[0-9]{17}[0-9X]";
        String regex2 = "\\d{17}[0-9X]";
        //单个\在java中有特殊的含义，表示转义符号，不认为这是一个单独的斜杠
        //所以如果想要表示一个单独的斜杠，需要在前面多一个斜杠\\

        System.out.println("请输入身份证号：");
        String input = new Scanner(System.in).next();

        if(input.matches(regex2)){
            System.out.println("输入正确！");
        } else {
            System.out.println("输入错误！");
        }
    }

}

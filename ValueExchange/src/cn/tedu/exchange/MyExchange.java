package cn.tedu.exchange;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

/**
 * @Date:2021/9/30 15:27
 * @Author:NANDI_GUO
 */
public class MyExchange {
    public static void main(String[] args) {
        System.out.println("请输入第一个值：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个值：");
        int b = new Scanner(System.in).nextInt();
        change(a,b);
    }

    public static void change(int x,int y){
        int t;
        t = x;
        x = y;
        y = t;
        System.out.println("换完后，第一个数是："+ x + " 第二个数是："+ y);
    }
}

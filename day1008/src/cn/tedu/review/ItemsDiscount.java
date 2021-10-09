package cn.tedu.review;

import java.util.Scanner;

/**
 * @Date:2021/10/8 14:45
 * @Author:NANDI_GUO
 */
public class ItemsDiscount {
    public static void main(String[] args) {
        System.out.println("请输入你的价格：");
        double price = new Scanner(System.in).nextDouble();
        System.out.println("打完折价格是"+discount(price));
    }

    static double discount(double price){
        if(price>=10000){
            return (price*0.5);
        }
        else if (price>=5000){
            return (price*0.8);
        }
        else if (price>=3000){
            return (price*0.9);
        }
        return price;
    }
}

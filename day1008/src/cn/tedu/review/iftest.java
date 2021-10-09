package cn.tedu.review;

import java.util.Scanner;

/**
 * @Date:2021/10/8 14:41
 * @Author:NANDI_GUO
 */
public class iftest {
    public static void main(String[] args) {
        String gender = new Scanner(System.in).next();


        if(gender == "男"){
            System.out.println("可以玩滑板");
        }else{
            System.out.println("女生");
        }
    }
}

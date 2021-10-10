package cn.tedu.review;

import java.util.Arrays;

/**
 * @Date:2021/10/9 10:09
 * @Author:NANDI_GUO
 */
public class TestFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i ; j++) {
                for (int k = 0; k <= j; k++) {
                    for (int l = 0; l < k; l++) {
                        System.out.print("*"+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}

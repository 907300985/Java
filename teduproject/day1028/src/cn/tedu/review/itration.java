package cn.tedu.review;

import java.util.Timer;

/**
 * @Date:2021/11/4 19:34
 * @Author:NANDI_GUO
 */
public class itration {
    public static void main(String[] args) {
       // long s = System.currentTimeMillis();
        //System.out.println(fabona(50));
        //long s1 = System.currentTimeMillis();
        //System.out.println(s1-s);
        System.out.println(add(1000));
    }

    private static long fabona(int number) {
        long sum = 0;
        long a = 1, b = 1;
        for (int j = 3; j <= number; j++) {
            if(j==1 || j==2){
                return 1;
            }else {
               sum = a + b;         //2=1+1  3= 1+2      5 = 2+3     8 = 3+5
               a = b;           // a = 1 b =1   a = 2       a = 3      a = 5
               b = sum;         // b = 2      b = 3        b= 5     b = 8

            }
        }
        return sum;
    }

    private static int add(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum+=i;
        }
        return sum;
    }
}

package TestArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Date:2021/10/11 11:54
 * @Author:NANDI_GUO
 */
public class ArrayCreate {
    public static void main(String[] args) {
//        char[]c1 = {'h','e','l','l','o'};
//        char[]c2 = new char[]{'h','e','l','l','o'};
//
//        char[]c3 = new char[5];
//        for (int i = 0; i < 5 ; i++) {
//            c3[i] = c2[i];
//        }
//
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3 );

        String[] s3 = new String[3];
        String[] s2 = new String[]{"a","b","c"};
        String[] s1 = {"a","b","c"};
        for (int i = 0; i < s3.length ; i++) {
            System.out.println("请输入"+"第"+(i+1)+"个元素:");
            s3[i] = new Scanner(System.in).next();
        }
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
        System.out.println(Arrays.toString(s3));
    }
}


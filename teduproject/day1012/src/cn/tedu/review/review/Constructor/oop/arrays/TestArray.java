package cn.tedu.review.review.Constructor.oop.arrays;

import java.util.Arrays;

/**
 * @Date:2021/10/12 9:13
 * @Author:NANDI_GUO
 */
public class TestArray {
    public static void main(String[] args) {
        //System.out.println("早上好");
        int[] a = {1,2,3,4,5};
        int[] a2 = new int[]{1,2,3,4,5,6};
        int[] a3 = new int[4];
        for (int i = 0; i < a3.length ; i++) {
            a3[i] = i+1;
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
    }
}

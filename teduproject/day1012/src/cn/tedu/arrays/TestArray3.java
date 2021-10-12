package cn.tedu.arrays;

import java.util.Arrays;

/**
 * @Date:2021/10/12 9:40
 * @Author:NANDI_GUO
 */
public class TestArray3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length ; i++) {
            a[i] = i+1;
        }
        System.out.println(Arrays.toString(a));
    }
}

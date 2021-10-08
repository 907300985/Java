package cn.sort;

import java.util.Arrays;

/**
 * @Date:2021/10/2 14:59
 * @Author:NANDI_GUO
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(a));
        ss(a);
        System.out.println(Arrays.toString(a));
    }

    public static void ss(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int helper = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = helper;
                }
            }
        }
    }
}

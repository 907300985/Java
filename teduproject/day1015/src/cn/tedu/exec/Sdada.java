package cn.tedu.exec;

import java.util.Arrays;

/**
 * @Date:2021/10/15 20:12
 * @Author:NANDI_GUO
 */
public class Sdada {
    public static void main(String[] args) {
        int[] arr = {98,7,56,3,2,1};
        System.out.println(Arrays.toString(bs(arr)));
    }
    public static int[] bs(int[] arr){
        for (int i = 1; i <= arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j]>arr[j+1]){
                    int h = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = h;
                }
            }
        }
        return arr;
    }
}

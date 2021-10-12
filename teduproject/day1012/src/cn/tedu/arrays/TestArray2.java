package cn.tedu.arrays;

import java.util.Arrays;

/**
 * @Date:2021/10/12 9:27
 * @Author:NANDI_GUO
 */
public class TestArray2 {
    public static void main(String[] args) {
        int[] from = {1,2,3,4,5};
        int[] to1 = Arrays.copyOf(from,5);
        System.out.println(Arrays.toString(to1));
        //数组的扩容
        int[] to2 = Arrays.copyOf(from,10);
        System.out.println(Arrays.toString(to2));
        //数组的缩容
        int[] to3 = Arrays.copyOf(from,3);
        System.out.println(Arrays.toString(to3));
    }
}

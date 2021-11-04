package cn.tedu.review;

import java.util.Arrays;

/**
 * @Date:2021/11/4 18:45
 * @Author:NANDI_GUO
 */
public class TestArray {
    public static void main(String[] args) {
        String s1 = "123";
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};
        System.out.println("arr1的地址:"+arr1.hashCode());
        arrTest1(arr1);
        System.out.println("================================");

        System.out.println("arr2的地址:"+arr2.hashCode());
        arrTest2(arr2);
        System.out.println("================================");

        System.out.println("S1的地址:" + s1.hashCode());
        sTest(s1);
        System.out.println(s1);

    }
    public static void arrTest1(int[] arr){
        arr[0] = 4;
        System.out.println("传参后arr1的地址:"+arr.hashCode());
    }
    public static void arrTest2(int[] arr){
        arr[0] = 4;
        System.out.println("传参后arr2的地址:"+arr.hashCode());
    }
    public static void sTest(String s){
        s = "456";
        System.out.println("传参后s1的地址:"+s.hashCode());
    }
}

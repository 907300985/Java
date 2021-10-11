package TestArray;

import java.util.Arrays;
import java.util.Random;

/**
 * @Date:2021/10/11 15:10
 * @Author:NANDI_GUO
 */
//数组的遍历
public class ArrayExec {
    public static void main(String[] args) {
        //getMonthday();
        //createArray1();
        createArray2();
    }

    private static void createArray2() {
        int[] a = new int[6];
        for (int i = 0; i < a.length ; i++) {
            a[i] = new Random().nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(a));
    }

    private static void getMonthday(){
        int[]day = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1; i <= day.length ; i++) {
            System.out.println(i+"月有"+day[i-1]+"天");
        }
    }
    private static void createArray1(){
        int[]array1 = new int[10];
        for (int i = 0; i< array1.length; ++i){
            array1[i] = i+1;
        }
        System.out.println(Arrays.toString(array1));
    }
}

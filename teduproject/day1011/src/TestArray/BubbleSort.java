package TestArray;

import java.util.Arrays;

/**
 * @Date:2021/10/11 16:14
 * @Author:NANDI_GUO
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {27,96,73,25,21};
        //Arrays.sort(a);
        System.out.println(Arrays.toString(bubble(a)));
    }
    private static int[] bubble(int[] a){
        for (int i = 1; i < a.length; i++) {
            //System.out.println(i);
            boolean flag = false;
            for (int j = 0; j < a.length - i; j++) {
                //System.out.print(j);
                if (a[j] > a[j + 1]) { //判断左边比右边大
                    int helper = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = helper;
                    flag = true;
                }
            }
            if (flag == false){
                return a;
            }
        }
        return a;
    }
}

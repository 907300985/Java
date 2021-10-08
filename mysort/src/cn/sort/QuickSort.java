package cn.sort;

import java.util.Arrays;

/**
 * @Date:2021/10/2 15:13
 * @Author:NANDI_GUO
 */
public class QuickSort {
    public static void main(String[] args) {
        int[]arr = new int[]{3,4,6,7,8,9,6,0};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[]arr, int start,int end){
        if(start < end){
            //把数组中的第0个数字作为标准数
            int standard = arr[start];

            int low = start;
            int high = end;

            while(low<high){
                while(low<high && standard<=arr[high]){
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && arr[low]<= standard){
                    low++;
                }
                arr[high] = arr[low];

            }
            arr[low]=standard;
            quicksort(arr,start,low);
            quicksort(arr,low+1,end);
        }
        }

}

package cn.leetcode;

import java.util.Arrays;

/**
 * @Date:2021/11/16 20:25
 * @Author:NANDI_GUO
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

        //System.out.println(Arrays.toString(merge(nums1,3,nums2,n)));s
        System.out.println(Arrays.toString(merge1(nums1,3,nums2,n)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2,int n){
        int index1 = m-1, index2 = n-1; //两个数组的最大下标
        int indexMerge = m+n-1;//合并后数组的最大下标
        while(index2 >= 0){
            if (index1<0){
                nums1[indexMerge--] = nums2[index2--];
            }else if (index2<0){
                nums1[indexMerge--] = nums1[index1--];
            }else if (nums1[index1]>nums2[index2]){
                nums1[indexMerge--] = nums1[index2--];
            }else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
        return nums1;                                                                                       
    }
    public static int[] merge1(int[] nums1, int m, int[] nums2,int n){
        for (int i = 0; i < n; ++i) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}

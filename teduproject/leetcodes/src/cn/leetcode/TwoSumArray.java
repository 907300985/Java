package cn.leetcode;

import java.util.Arrays;

/**
 * @Date:2021/10/11 19:26
 * @Author:NANDI_GUO
 */

//给一个任意有序数组，找出和为target的两个数。
public class TwoSumArray {
    public static void main(String[] args) {
        int[] a1 = {2,7,11,15};
        int target = 9;
        int[] answer = twoSum(a1,target); //anser [0,1] answer[0] = 0; answer[1] = 1
        System.out.println("第一个数是" + a1[answer[0]]+" 第二个数是" + a1[answer[1]]); //两个数的下标
    }
    public static int[] twoSum(int[] numbers, int target){
        if (numbers == null) { //数组为空就返回空
            return null;
        }

        int i = 0,j = numbers.length-1;  // i自增，j自减
        while (i<j){
            int sum = numbers[i] + numbers[j]; //数组的第一个数加上数组后的最后一个数
            if(sum == target){
                return new int[]{i+1,j+1};  //如果加起来等于就返回答案
            }else if (sum<target){   //和小于sum就i++
                i++;
            }else{
                j--; //和大于sum就J--
            }
        }
        return null; //找不到答案就返回空
    }
}

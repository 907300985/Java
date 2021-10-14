package cn.leetcode;

/**
 * @Date:2021/10/13 19:23
 * @Author:NANDI_GUO
 */
public class ReverseAEIOU {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverseVowels("leetcode"));

    }
}
class Solution {
    public String reverseVowels(String s) {
        if(s == null){
            return null;                        //传入的字符串为空返回空
        }
                int n = s.length();             // n 为字符串长度
        char[] arr = s.toCharArray();           //将传入的字符串转为char类型数组
        int i = 0, j = s.length() - 1;          //左指针i从数组下标[0]开始，右指针j从数组最后一个元素开始

        while(i<j){                             //当左指针没碰到右指针时
            /**这里为什么需要嵌套循环呢, i<n重复i<j了吧，而且为什么用while不是if*/
            if (!isYY(arr[i])){                 //（当i小于数组长度时） 并且 （没有找到元音字母）
                ++i;                            //左指针++ 相当于左指针右移
            }else if (!isYY(arr[j])){           //（当j大于0时） 并且 （没有找到元音字母）
                --j;                            //右指针-- 相当于右指针左移
            }else {
                swap(arr, i, j);
                ++i;
                --j;
            }
        }
        return new String(arr);
    }

    public boolean isYY(char ch) { //如果有元音字母就返回true
        return "aeiouAEIOU".indexOf(ch) >=0; //传入参数ch
    }

    public void swap(char[] arr, int i, int j ){
        char helper = arr[i];
        arr[i] = arr[j];
        arr[j] = helper;
    }
}
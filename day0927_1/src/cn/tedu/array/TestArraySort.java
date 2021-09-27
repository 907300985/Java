package cn.tedu.array;

import java.util.Arrays;

/**排序*/
public class TestArraySort {
	public static void main(String[]args) {
		//1.创建无序数组
		int[] a = {4,2,3,1,7,6,5};
		//2.利用工具排序
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}

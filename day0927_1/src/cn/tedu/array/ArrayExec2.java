package cn.tedu.array;

import java.util.Arrays;

/**数组的遍历2*/
//需求：遍历数组，依次存入1-10
public class ArrayExec2 {
	public static void main(String[] args) {
		//动态创建数组
		int[]a = new int[10];//长度为10
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		System.out.println(Arrays.toString(a));
	}
}

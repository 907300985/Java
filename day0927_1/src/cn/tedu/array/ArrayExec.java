package cn.tedu.array;

import java.util.Arrays;

/**数组的遍历*/
//需求：输出一年中每一个月的天数，如：1月有31天
public class ArrayExec {

	public static void main(String[] args) {
		//12个月的天数
		int[]a = {31,28,31,30,31,30,31,31,30,31,30,31};
		//输出每一个月的天数
		for (int i = 0; i < 12; i++) {
			//System.out.println(a[i]);
			System.out.println((i+1)+"月"+"有"+a[i]+"天");
		}
	}

}

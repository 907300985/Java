package cn.tedu.array;

import java.util.Arrays;

//本类用来测试数组的Copyof方法
public class TestArrayCopeOf {
	public static void main(String[]args) {
		int[]a = {1,2,3,4,5};
		//数组的普通复制
		//参数：复制哪个数组，长度
		int[]b = Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		//数组的缩容
		/** 先创建长度，在按长度从原来的数组中截取*/
		int[] to2 = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(to2));
		//数组的扩容
		/** 先长度，后复制对应，没复制的为原类型的默认值*/
		int[] to3 = Arrays.copyOf(a, 10);
		System.out.println(Arrays.toString(to3));
		//指定首尾截取
		/**含头不含尾*/
		int[] to4 = Arrays.copyOfRange(a, 2,4);
		System.out.println(Arrays.toString(to4));			
	}		
}

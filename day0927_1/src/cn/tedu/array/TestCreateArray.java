package cn.tedu.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCreateArray {

	public static void main(String[] args) {
		//静态创建--知道了数组中存放的具体元素
		char[] c1 = {'h','e','l','l','o'};
		char[] c2 = new char[] {'h','e','l','l','o'};
		
		//动态创建--先制定类型和长度，后续存自定义的值
		char[] c3 = new char[5];
		c3[0] = 'h';
		c3[1] = 'e';
		c3[2] = 'l';
		c3[3] = 'l';
		c3[4] = 'o';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//创建String类型数组
		String[] s = {"a","b","c"}; 
		System.out.println(s); //s保存的是数组的地址值，s是引用类型的变量，java对char做了底层处理
		System.out.println(Arrays.toString(s));//使用Arrays的toString(数组名)方法
	}

}

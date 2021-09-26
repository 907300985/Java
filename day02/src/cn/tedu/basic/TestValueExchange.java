package cn.tedu.basic;

import java.util.Scanner;

/**
 * 
 * @author 90730
 * 需求：接受用户输入的数据，交换值
 */
public class TestValueExchange {
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Enter second number: ");
		int n2 = new Scanner(System.in).nextInt();
		//switch
		int t;
		t = n; //第一个值传给中间人
		n = n2;//的一个值等于第二个
		n2 = t;//第二个等于中间人
		
		//after
		System.out.println("now,first: "+n);
		System.out.println("now,second: "+n2);
		//System.out.println(3.14/0);
		
	}
}

package cn.tedu.basic;

import java.util.Scanner;

/**
 * 
 * @author 90730
 * ���󣺽����û���������ݣ�����ֵ
 */
public class TestValueExchange {
	public static void main(String[] args) {
		System.out.println("Enter first number: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Enter second number: ");
		int n2 = new Scanner(System.in).nextInt();
		//switch
		int t;
		t = n; //��һ��ֵ�����м���
		n = n2;//��һ��ֵ���ڵڶ���
		n2 = t;//�ڶ��������м���
		
		//after
		System.out.println("now,first: "+n);
		System.out.println("now,second: "+n2);
		//System.out.println(3.14/0);
		
	}
}

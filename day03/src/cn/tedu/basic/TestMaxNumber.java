package cn.tedu.basic;

import java.util.Scanner;

//����û����������ֵ
public class TestMaxNumber {
	public static void main(String[]args){
		/**
		 * if ����
		 */
		/*System.out.println("first:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("second:");
		int b = new Scanner(System.in).nextInt();
		if (a>b) {System.out.println(a);}
		else {System.out.println(b);}*/
		/**
		 * ��Ŀ���������
		 */
		System.out.println("first:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("second:");
		int b = new Scanner(System.in).nextInt();
		
		int max = a>b ? a:b;
		System.out.println(max);
		
		int min = a>b ? b:a;
		System.out.println(min);
	}
}
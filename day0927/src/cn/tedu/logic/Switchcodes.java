package cn.tedu.logic;

import java.util.Scanner;

//���Է�֧�ṹ
public class Switchcodes {
	public static void main(String[] args) {
		//֧��int,byte,short,char,String
		System.out.println("����:");
		int key = new Scanner(System.in).nextInt();
		switch (key) {
		case 0: System.out.println("0");break;
		case 1:	System.out.println("1");break;
		case 2:	System.out.println("2");break;
		case 3:	System.out.println("3");break;
		case 4:	System.out.println("4");break;	
		default: System.out.println("����ô������");break;//���ûƥ�䵽�κ�
		}
	}
}

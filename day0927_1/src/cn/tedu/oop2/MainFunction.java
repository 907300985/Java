package cn.tedu.oop2;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		
		p1.brand = "Samsung";
//		p1.color = "Blue";
//		p1.price = 4999;
//		p1.size = 5.8;
//		System.out.println(p1.brand);
//		System.out.println(p1.color);
//		System.out.println(p1.price);
//		System.out.println(p1.size);
		
		System.out.println("��Ҫ��ƻ������ʲô��Ϣ��");
		String s = new Scanner(System.in).next();
		//p1.call(s);
		//p1.message("�����Ÿ��Ұ�");
		//p1.video("������Ƶ���Ұ�");	
		
		Phone p2 = new Phone();
		p2.brand = "Apple";
//		p2.color = "Black";
//		p2.price = 6000;
//		p2.size = 5.5;
//		System.out.println(p2.brand);
//		System.out.println(p2.color);
//		System.out.println(p2.price);
//		System.out.println(p2.size);
		System.out.print(p2.brand + " �յ��ˣ�" );
		p2.call(s);
		//p2.message("���ڷ�����");
		//p2.video("���ڲ�����Ƶ");	
		
//		System.out.println(p1);
//		System.out.println(p2);
	}
}

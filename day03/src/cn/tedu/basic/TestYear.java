package cn.tedu.basic;

import java.util.Scanner;

public class TestYear {
	public static void main(String[]args) {
		while (true) {
			
			System.out.println("�����������ݣ�");
			int a = new Scanner(System.in).nextInt();
			String b = "��������";
			String c = "����ƽ��";
			int y = a % 4;
			int y1 = a % 100;
			int y2 = a % 400;
			
			String year = (y2 == 0) || ((y == 0) && (y1 != 0)) ? b:c;
			System.out.println(year);			
		}		
	}
}

package cn.tedu.basic;

import java.util.Scanner;

public class TestYear {
	public static void main(String[]args) {
		while (true) {
			
			System.out.println("请输入你的年份：");
			int a = new Scanner(System.in).nextInt();
			String b = "这是润年";
			String c = "这是平年";
			int y = a % 4;
			int y1 = a % 100;
			int y2 = a % 400;
			
			String year = (y2 == 0) || ((y == 0) && (y1 != 0)) ? b:c;
			System.out.println(year);			
		}		
	}
}

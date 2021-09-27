package cn.tedu.logic;

import java.util.Scanner;

public class Iftest1 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入你的价格");
			double price = new Scanner(System.in).nextDouble();
			double x = dazhe(price);
			System.out.println("原价是"+price+", 打折后为"+x);
		}
	}

	public static double dazhe(double price) {
		double afterprice = 0;
		
		if (price >= 5000 ) {
			afterprice = price * 0.5;
			
		}
		else if ( price >= 2000) {
			afterprice = price * 0.8;
		}
		else if (price >= 1000) {
			afterprice = price * 0.9;
			
		}
		else {
			afterprice = price;
			System.out.println("不打折");
		}
		return afterprice;
	}

//	private static void dz(double price, double afterprice) {
//		System.out.println("原价是"+price+", 打折后为"+afterprice);
//	}
}

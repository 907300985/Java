package cn.tedu.review.forwhile;

import java.util.Scanner;
import java.util.Random;

/**本类用来复习while和do while*/
public class ReviewWhile {
	public static void main(String[] args) {
		//f1();//while	
		f2();//do while
	}

	private static void f2() {
		int n;
		do {
			System.out.println("我是循环体");
			n = new Random().nextInt(10);
			System.out.println(n);
			}while (n>100);
	}
	private static void f1() {
		while (true) {
			System.out.println("guess 1:");
			int in = new Scanner(System.in).nextInt();
			if (in == 88) {
				System.out.println("you r right");
				break;//出口
			}
		}	
	}
}


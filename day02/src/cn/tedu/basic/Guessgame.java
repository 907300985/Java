package cn.tedu.basic;

import java.util.Random;
import java.util.Scanner;

public class Guessgame {
	
	public static void main(String[] args) {
		
		System.out.println("请输入你猜的数字吧:\n--------------------");
		
		Random r = new Random();
		int number = r.nextInt(10) + 1;
		//System.out.println(number);
		
		int acc = 5;	
		while (acc > 0) {		
			try {
					int guess = new Scanner(System.in).nextInt();
					if (guess == number) {System.out.println("你可真牛啊!");break;}
					else if (guess < number) {System.out.println("猜大一点! 还剩"+(acc-1)+"次机会");}
					else if (guess > number) {System.out.println("猜小一点!还剩"+(acc-1)+"次机会");}
					acc -= 1;
				
					if (acc == 0) {
						System.out.println("\n你没机会了!");
					}
			} catch (Exception e) {
				System.out.println("你的输入格式错啦! 错误为:\n"+e+"\n请重新回答: ");
			}

		}

	}
}

package cn.tedu.basic;

import java.util.Random;
import java.util.Scanner;

public class Guessgame {
	
	public static void main(String[] args) {
		
		System.out.println("��������µ����ְ�:\n--------------------");
		
		Random r = new Random();
		int number = r.nextInt(10) + 1;
		//System.out.println(number);
		
		int acc = 5;	
		while (acc > 0) {		
			try {
					int guess = new Scanner(System.in).nextInt();
					if (guess == number) {System.out.println("�����ţ��!");break;}
					else if (guess < number) {System.out.println("�´�һ��! ��ʣ"+(acc-1)+"�λ���");}
					else if (guess > number) {System.out.println("��Сһ��!��ʣ"+(acc-1)+"�λ���");}
					acc -= 1;
				
					if (acc == 0) {
						System.out.println("\n��û������!");
					}
			} catch (Exception e) {
				System.out.println("��������ʽ����! ����Ϊ:\n"+e+"\n�����»ش�: ");
			}

		}

	}
}

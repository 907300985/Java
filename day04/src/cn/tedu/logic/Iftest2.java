package cn.tedu.logic;

import java.util.Scanner;

/**���Գɼ�*/
public class Iftest2 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("��������ĳɼ�");
			Double grade = new Scanner(System.in).nextDouble();
			level(grade);
		}
	}
	
	//ע��˳��
	public static void level(Double grade) {
		if (grade > 100 || grade < 0) {
			System.out.println("��������");
		}
		else if (grade >= 90) {
			System.out.println("����");
		}
		else if (grade >= 80) {
			System.out.println("����");
		}
		else if (grade >= 70) {
			System.out.println("�е�");
		}
		else if (grade >= 60) {
			System.out.println("����");
		}
		else {
			System.out.println("������");
		}
	}

}

package cn.tedu.logic;

import java.util.Scanner;

/**���Գɼ�*/
public class Iftest2 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("��������ĳɼ�");
			Double grade = new Scanner(System.in).nextDouble();
			
			String output = level(grade,null);
			System.out.println("�÷�:"+grade+ " ����:"+output);
		}
	}
	
	//ע��˳��
	public static String level(Double grade, String op) {
		
		if (grade > 100 || grade < 0) {
			op = "��������";
		}
		else if (grade >= 90) {
			op = "����";
		}
		else if (grade >= 80) {
			op = "����";
		}
		else if (grade >= 70) {
			op = "�е�";
		}
		else if (grade >= 60) {
			op = "����";
		}
		else {
			op = "������";
		}
		return op;
	}

}

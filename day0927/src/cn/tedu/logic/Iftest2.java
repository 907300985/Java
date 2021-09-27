package cn.tedu.logic;

import java.util.Scanner;

/**测试成绩*/
public class Iftest2 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入你的成绩");
			Double grade = new Scanner(System.in).nextDouble();
			
			String output = level(grade,null);
			System.out.println("得分:"+grade+ " 属于:"+output);
		}
	}
	
	//注意顺序
	public static String level(Double grade, String op) {
		
		if (grade > 100 || grade < 0) {
			op = "分数错误";
		}
		else if (grade >= 90) {
			op = "优秀";
		}
		else if (grade >= 80) {
			op = "良好";
		}
		else if (grade >= 70) {
			op = "中等";
		}
		else if (grade >= 60) {
			op = "及格";
		}
		else {
			op = "不及格";
		}
		return op;
	}

}

package cn.tedu.logic;

import java.util.Scanner;

/**测试成绩*/
public class Iftest2 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("请输入你的成绩");
			Double grade = new Scanner(System.in).nextDouble();
			level(grade);
		}
	}
	
	//注意顺序
	public static void level(Double grade) {
		if (grade > 100 || grade < 0) {
			System.out.println("分数错误");
		}
		else if (grade >= 90) {
			System.out.println("优秀");
		}
		else if (grade >= 80) {
			System.out.println("良好");
		}
		else if (grade >= 70) {
			System.out.println("中等");
		}
		else if (grade >= 60) {
			System.out.println("及格");
		}
		else {
			System.out.println("不及格");
		}
	}

}

package cn.tedu.types;

import java.util.Scanner;

public class DuiXiang{
	public static void main(String[] args) {
		
		Teacher a = new Teacher();
		a.said();
		
		Teacher b = new Teacher();
		b.said();

	}
}

class Teacher{
	
	public void said(){
		
		System.out.println("输入你的信息：");
		String name = new Scanner(System.in).next();
		int age = new Scanner(System.in).nextInt();
		double salary = new Scanner(System.in).nextDouble();
		
		System.out.println("我是"+ name + ",我的年龄是:" + age + ", 我的月薪是:" + salary);
	}
}

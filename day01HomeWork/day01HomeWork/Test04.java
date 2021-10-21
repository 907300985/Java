package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		String email = "[0-9]{9}[@][q]{2}[.][c][o][m]";
		// String qyemail = "[a-zA-Z0-9]{9}[@][a-zA-Z0-9]{10}[.][c][o][m]"
		String input;
		do {
			System.out.println("请输入你的QQ邮箱：");
			input = new Scanner(System.in).next();
			if (input.matches(email)){
				System.out.println("QQ邮箱号输入正确");
			}
		}while (!input.matches(email));
		get(input);
	}
	static void get(String s){
		int i = s.indexOf("@");
		System.out.println("用户名是:"+s.subSequence(0,i));
	}
}

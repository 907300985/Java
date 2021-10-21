package day01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Xiloer
 *
 */
public class Test06 {
	public static void main(String[] args) {
		String regex = "[0-9]*[\\+\\-\\*\\/][0-9]*";
		String input;
		do {
			System.out.println("请输入你的表达式:");
			input = new Scanner(System.in).next();
			if (input.matches(regex)){
				System.out.println("表达式输入正确, 输出结果");
			}
		}while (!input.matches(regex));

		int index = get(input); //get方法得到运算符下标
		String left = input.substring(0,index); //截取运算符左边字符串
		String right = input.substring(index+1,input.length());//截取运算符右边字符串
		System.out.println(left+input.charAt(index)+right+"="+
				(result(input,index,parseInt(left),parseInt(right)))); //输出格式通过result方法得到结果
	}

	public static int parseInt(String str){
		int num = 0;
		int flag = 0;
		for(int i=0;i<str.length();i++){
			flag = (str.charAt(i)-48);  //1+2
			for(int n=0;n<str.length()-1-i;n++){
				flag*=10;
			}
			num+=flag;
		}
		return num;
	}//老师写的字符串转换成int类型的数字

	public static BigDecimal result(String input, int i, int left, int right){
		char a = input.charAt(i);
		BigDecimal result = new BigDecimal(0);
		BigDecimal l = new BigDecimal(left);
		BigDecimal r = new BigDecimal(right); //使用Bigdecimal对传入的运算符左右的值进行计算
		switch (a){ //判断用户输入的运算符号是哪个就用哪个运算方法
			case '+': result = l.add(r); break;
			case '-': result = l.subtract(r); break;
			case '*': result = l.multiply(r); break;
			case '/': result = l.divide(r,1, RoundingMode.HALF_UP); break;
		}
		return result;
	}

	public static int get(String input){
		char regex = '+', regex1 = '-',regex2 = '*',regex3 = '/';
		String a = "";
		for (int i = 0; i < input.length(); i++) { //遍历得到用户输入的运算符号下标
			if ((input.charAt(i)==regex)||(input.charAt(i)==regex1)||(input.charAt(i)==regex2)||(input.charAt(i)==regex3)) {
				return i; //返回运算符下标
			}
		}
		return 0;
	}
}









package day0927_1;
//本类，嵌套for循环
public class ReviewFor {
	public static void main(String[] args) {
		//f1();
		f2();
	}
	//打印9*9左直角三角形
	private static void f2() {
		for (int i = 1; i <= 9; i++) {//外层控制行数
			for (int j = 1; j <= i; j++) {//内层控制列
				System.out.print("*");
			}
			System.out.println();//空白换行
		}
	}
	//打印1：1-5，2：2-5 ，3：3-5
	private static void f1() {
		for (int i = 1; i <= 3; i++) {
			System.out.print(".");
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
		}
	}
}

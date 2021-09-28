package cn.tedu.review.forwhile;

public class ReviewVariable {
	static int count;
	static int sum; //成员变量，一直存在,可以与局部变量名字相同
	public static void main(String[] args) {
		System.out.println(sum);
		//局部变量只能在局部使用，代码块结束变量释放
		int sum;
		sum = 100;
		System.out.println(sum);
			
	}
}

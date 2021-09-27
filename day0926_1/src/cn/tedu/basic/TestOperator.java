package cn.tedu.basic;

public class TestOperator {

	public static void main(String[] args) {
		System.out.println(38/10); //结果不带余数
		System.out.println(38%10); //结果取余数
		
		//3.测试自增自减
		/**
		 * a=a+1
		 * ++a --a, 先变化在使用
		 * a++ a--, 先使用在变化 
		 */ 
		int a = 1;
		System.out.println(a++); //先打印再自增
		System.out.println(a); //输出自增结果
		
		int b = 1;
		System.out.println(++b); //先自增
		
		int c = 0;
		System.out.println(--c-c-c--); // 0-1=-1 -1-(-1)-(-1)=1
		/**
		 * 只有自增自减改变变量值
		 * 普通四则运算不影响变量值
		 * 如果--++在后边，本次打印不受影响
		 */
	}
}

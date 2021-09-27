package cn.tedu.basic;

public class TestMethod {
	public static void main(String[] args) {
		//测试方法调用顺序
		method1();
		
		method2(22);
		
		int result = method3(1,2);
		System.out.println(result);
	}
	
	//测试方法传参
	private static void method2(int a) {
		System.out.println("今年"+a+"岁了");
	}

	private static void method1() {
		System.out.println(1);
	}

	/**
	 * void不允许有返回值
	 * 如果想要返回值，必须修改返回值类型
	 * @param i
	 * @param j
	 * @return 
	 */
	//测试方法返回类型
	private static int method3(int i, int j) {
		return i+j;
	}
}

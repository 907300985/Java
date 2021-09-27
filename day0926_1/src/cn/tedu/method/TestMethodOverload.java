package cn.tedu.method;

public class TestMethodOverload {
	public static void main(String[] args) {
		/** 根据方法名字+参数列表确认调用的方法*/
		/**方法的重载：
		 * 同一个类中，存在方法名相同但是参数列表不同的方法。
		 * */
		//2.调用method方法
		method();
		//4.调用method(int)
		method(666);
		//5.重载调用整形和字符串方法
		method(3,"我"); //记得查看传递参数的对应类型的位置
	}
	
	//1.无参的方法
	public static void method() {
		System.out.println("我没参数");
	}
	//3.创建一个method(int a)
	public static void method(int a) {
		System.out.println("我的参数为" + a);
	}
	//5.创建一个method(int n, String s)
	public static void method(int a, String s) {
		System.out.println(s + "今天吃" + a + "碗饭");
	}
	//6.创建一个method(String s, int a)
	public static void method(String s, int a) {
		System.out.println(s + "今天吃" + a + "碗饭");
	}
}

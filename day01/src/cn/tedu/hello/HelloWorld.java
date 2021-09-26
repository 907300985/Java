package cn.tedu.hello;

/**
 * alt+shift+j注释
 * control f11运行
 * ctrl+D 删除当前行
 * class类
 * HelloWorld单词首字母大写
 * alt+/代码补全 
 * ln是打印后换行
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!\nThis is my first time!");
		call();
	}
	
	private static void call() {
		for (int i = 1;i <= 100;i++)
			System.out.println("this is the " + i + " time called from other function");
			
	}
}

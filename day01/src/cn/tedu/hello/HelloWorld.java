package cn.tedu.hello;

/**
 * alt+shift+jע��
 * control f11����
 * ctrl+D ɾ����ǰ��
 * class��
 * HelloWorld��������ĸ��д
 * alt+/���벹ȫ 
 * ln�Ǵ�ӡ����
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

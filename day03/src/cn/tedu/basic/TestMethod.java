package cn.tedu.basic;

public class TestMethod {
	public static void main(String[] args) {
		//���Է�������˳��
		method1();
		
		method2(22);
		
		int result = method3(1,2);
		System.out.println(result);
	}
	
	//���Է�������
	private static void method2(int a) {
		System.out.println("����"+a+"����");
	}

	private static void method1() {
		System.out.println(1);
	}

	/**
	 * void�������з���ֵ
	 * �����Ҫ����ֵ�������޸ķ���ֵ����
	 * @param i
	 * @param j
	 * @return 
	 */
	//���Է�����������
	private static int method3(int i, int j) {
		return i+j;
	}
}

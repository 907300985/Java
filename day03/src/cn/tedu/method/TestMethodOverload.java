package cn.tedu.method;

public class TestMethodOverload {
	public static void main(String[] args) {
		/** ���ݷ�������+�����б�ȷ�ϵ��õķ���*/
		/**���������أ�
		 * ͬһ�����У����ڷ�������ͬ���ǲ����б�ͬ�ķ�����
		 * */
		//2.����method����
		method();
		//4.����method(int)
		method(666);
		//5.���ص������κ��ַ�������
		method(3,"��"); //�ǵò鿴���ݲ����Ķ�Ӧ���͵�λ��
	}
	
	//1.�޲εķ���
	public static void method() {
		System.out.println("��û����");
	}
	//3.����һ��method(int a)
	public static void method(int a) {
		System.out.println("�ҵĲ���Ϊ" + a);
	}
	//5.����һ��method(int n, String s)
	public static void method(int a, String s) {
		System.out.println(s + "�����" + a + "�뷹");
	}
	//6.����һ��method(String s, int a)
	public static void method(String s, int a) {
		System.out.println(s + "�����" + a + "�뷹");
	}
}

package cn.tedu.logic;
//����ѭ���ṹ
public class For {
	public static void main(String[] args) {
		method(100);
		method2(10);
		method3(10);
		method4();
		method5();
		method6();
		method7();
		method8();
	}

	//100������	
	private static void method(int t) {
		for (int i = 0; i <= t; ++i) {
			System.out.println(i+" ��Rimuru");
		}
	}
	//1-10
	private static void method2 (int t) {
		for (int i = 0; i <= t; ++i) {
			System.out.println(i);
		}
	}
	//����10-1
	private static void method3 (int t) {
		for (int i = t; i >= 1; --i) {
			System.out.println(i);
		}
	}
	//���8�㷨
	private static void method4 () {
		for (int i = 8; i <= 8888; i=i*10+8) {
			System.out.print(i+",");
		}
	}
	//���ż��1-100
	private static void method5() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("\n"+sum);	
	}
	//��1-100�ܺ�
	private static void method6() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
				sum += i;
		}
		System.out.println(sum);	
	}
	//��1-100�����ĺ�
	private static void method7() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i%2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);	
	}
	//��1-100ż���ĸ���
	private static void method8() {
		int acc = 0;
		for (int i = 0; i <= 100; i++) {
			if (i%2 == 0) {
				acc += 1;
			}
		}
		System.out.println("һ����"+ acc + "��ż��");
	}
}

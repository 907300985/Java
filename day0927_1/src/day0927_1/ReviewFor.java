package day0927_1;
//���࣬Ƕ��forѭ��
public class ReviewFor {
	public static void main(String[] args) {
		//f1();
		f2();
	}
	//��ӡ9*9��ֱ��������
	private static void f2() {
		for (int i = 1; i <= 9; i++) {//����������
			for (int j = 1; j <= i; j++) {//�ڲ������
				System.out.print("*");
			}
			System.out.println();//�հ׻���
		}
	}
	//��ӡ1��1-5��2��2-5 ��3��3-5
	private static void f1() {
		for (int i = 1; i <= 3; i++) {
			System.out.print(".");
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
		}
	}
}

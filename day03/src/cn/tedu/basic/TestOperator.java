package cn.tedu.basic;

public class TestOperator {

	public static void main(String[] args) {
		System.out.println(38/10); //�����������
		System.out.println(38%10); //���ȡ����
		
		//3.���������Լ�
		/**
		 * a=a+1
		 * ++a --a, �ȱ仯��ʹ��
		 * a++ a--, ��ʹ���ڱ仯 
		 */ 
		int a = 1;
		System.out.println(a++); //�ȴ�ӡ������
		System.out.println(a); //����������
		
		int b = 1;
		System.out.println(++b); //������
		
		int c = 0;
		System.out.println(--c-c-c--); // 0-1=-1 -1-(-1)-(-1)=1
		/**
		 * ֻ�������Լ��ı����ֵ
		 * ��ͨ�������㲻Ӱ�����ֵ
		 * ���--++�ں�ߣ����δ�ӡ����Ӱ��
		 */
	}
}

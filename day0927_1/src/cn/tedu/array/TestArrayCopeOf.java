package cn.tedu.array;

import java.util.Arrays;

//�����������������Copyof����
public class TestArrayCopeOf {
	public static void main(String[]args) {
		int[]a = {1,2,3,4,5};
		//�������ͨ����
		//�����������ĸ����飬����
		int[]b = Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		//���������
		/** �ȴ������ȣ��ڰ����ȴ�ԭ���������н�ȡ*/
		int[] to2 = Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(to2));
		//���������
		/** �ȳ��ȣ����ƶ�Ӧ��û���Ƶ�Ϊԭ���͵�Ĭ��ֵ*/
		int[] to3 = Arrays.copyOf(a, 10);
		System.out.println(Arrays.toString(to3));
		//ָ����β��ȡ
		/**��ͷ����β*/
		int[] to4 = Arrays.copyOfRange(a, 2,4);
		System.out.println(Arrays.toString(to4));			
	}		
}

package cn.tedu.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestCreateArray {

	public static void main(String[] args) {
		//��̬����--֪���������д�ŵľ���Ԫ��
		char[] c1 = {'h','e','l','l','o'};
		char[] c2 = new char[] {'h','e','l','l','o'};
		
		//��̬����--���ƶ����ͺͳ��ȣ��������Զ����ֵ
		char[] c3 = new char[5];
		c3[0] = 'h';
		c3[1] = 'e';
		c3[2] = 'l';
		c3[3] = 'l';
		c3[4] = 'o';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//����String��������
		String[] s = {"a","b","c"}; 
		System.out.println(s); //s�����������ĵ�ֵַ��s���������͵ı�����java��char���˵ײ㴦��
		System.out.println(Arrays.toString(s));//ʹ��Arrays��toString(������)����
	}

}

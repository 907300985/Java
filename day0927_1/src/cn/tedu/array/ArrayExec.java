package cn.tedu.array;

import java.util.Arrays;

/**����ı���*/
//�������һ����ÿһ���µ��������磺1����31��
public class ArrayExec {

	public static void main(String[] args) {
		//12���µ�����
		int[]a = {31,28,31,30,31,30,31,31,30,31,30,31};
		//���ÿһ���µ�����
		for (int i = 0; i < 12; i++) {
			//System.out.println(a[i]);
			System.out.println((i+1)+"��"+"��"+a[i]+"��");
		}
	}

}

package cn.tedu.array;

import java.util.Arrays;

/**����ı���2*/
//���󣺱������飬���δ���1-10
public class ArrayExec2 {
	public static void main(String[] args) {
		//��̬��������
		int[]a = new int[10];//����Ϊ10
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		System.out.println(Arrays.toString(a));
	}
}

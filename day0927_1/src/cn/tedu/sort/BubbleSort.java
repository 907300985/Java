package cn.tedu.sort;

import java.util.Arrays;

//ð�����򣬵ײ�����Forѭ��Ƕ�ױ���
public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {3,5,4,1,2};
		method(a);
		System.out.print("�������ǣ�");
		System.out.println(Arrays.toString(a));
	}

	private static void method(int a[]) {			/**����ð�����򷽷�*/
		for(int i = 0 ; i < a.length-1 ; i++) { 	//�������鳤��-1�Σ���Ϊ�����Գ���������������ϵ��£�����
			for (int j = 0; j < a.length-1 ; j++) {	//����5�����򣬴�������ȣ�ÿһ�ֱȽϵĴ���
				System.out.println("�Ƚ�"+(j+1)+"��");
				if (a[j]>a[j+1]) {					//�����߱��ұߴ�
					int h = a[j];					//��߸�helper
					a[j] = a[j+1]; 					//�ұ�ֵ�������
					a[j+1] = h;						//�ұ߸�helper		
				}
			}
			System.out.println("��"+(i+1)+"��\n"+Arrays.toString(a));
		}	
	}
}
/**
 *	1 
 *	1 2 3 4 5
 *	2
 *	1 2 3 4 5
 *	3
 *	1 2 3 4 5
 *	4
 *  1 2 3 4 5
 *  .....
 */
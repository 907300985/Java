package cn.tedu.array;
import java.util.Arrays;
/**�����������*/
import java.util.Random;
public class ArrayExec3 {

	public static void main(String[] args) {
		//��������Ԫ��Ϊ100���������
		//��̬��������
		/**����ĳ�������Ϊ0*/
		int l = new Random().nextInt(5)+1; //����������ȵ����飬+1���Դ�1��ʼ
		int[]a = new int[l];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100); //�����������ÿ����ַ
		}
		System.out.println(Arrays.toString(a));
	}

}

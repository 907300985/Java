package cn.tedu.array;
import java.util.Arrays;
/**创建随机数组*/
import java.util.Random;
public class ArrayExec3 {

	public static void main(String[] args) {
		//需求：数组元素为100以内随机数
		//动态创建数组
		/**数组的长度允许为0*/
		int l = new Random().nextInt(5)+1; //生成随机长度的数组，+1可以从1开始
		int[]a = new int[l];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100); //生成随机数给每个地址
		}
		System.out.println(Arrays.toString(a));
	}

}

package cn.tedu.sort;

import java.util.Arrays;

//冒泡排序，底层排序，For循环嵌套便利
public class BubbleSort {
	public static void main(String[] args) {
		int a[] = {3,5,4,1,2};
		method(a);
		System.out.print("排序结果是：");
		System.out.println(Arrays.toString(a));
	}

	private static void method(int a[]) {			/**自研冒泡排序方法*/
		for(int i = 0 ; i < a.length-1 ; i++) { 	//遍历数组长度-1次，因为最后可以出两个结果，五遍从上到下，五轮
			for (int j = 0; j < a.length-1 ; j++) {	//遍历5次排序，从左到右相比，每一轮比较的次数
				System.out.println("比较"+(j+1)+"次");
				if (a[j]>a[j+1]) {					//如果左边比右边大
					int h = a[j];					//左边给helper
					a[j] = a[j+1]; 					//右边值传给左边
					a[j+1] = h;						//右边给helper		
				}
			}
			System.out.println("第"+(i+1)+"轮\n"+Arrays.toString(a));
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
package cn.demo;

import java.util.Arrays;

public class TestArrayDelete {
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		int dele = 2;
		System.out.println(Arrays.toString(arr));
		
		int[] newarr = new int[arr.length-1];
		
		
		for(int i = 0; i < newarr.length; i++) {
			
			if(i < dele) {
				newarr[i] = arr[i];
			}else {
				newarr[i] = arr[i+1];
			}
		}
		
		arr = newarr;
		System.out.println(Arrays.toString(newarr));
	}
}

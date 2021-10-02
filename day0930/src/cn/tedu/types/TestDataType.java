package cn.tedu.types;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//测试基本数据类型范围
public class TestDataType {
	public static void main(String[] args) {
		byte bytemax = Byte.MAX_VALUE;
		byte bytemin = Byte.MIN_VALUE;
		System.out.println("最大值为:"+ bytemax +"\n"+ "最小值为:" + bytemin);
		int intmax = Integer.MAX_VALUE;
		int intmin = Integer.MIN_VALUE;
		System.out.println("最大值为:"+ intmax +"\n"+ "最小值为:" + intmin);
		
	}
}

package cn.tedu.basic;
/** 本类用来查看对应类型的最大值和最小值*/
public class TestTypeScope {
	public static void main(String[] args) {
		byte byteMax = Byte.MAX_VALUE;
		byte byteMin = Byte.MIN_VALUE;
		short shortMax = Short.MAX_VALUE;
		short shortMin = Short.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		long longMin = Long.MIN_VALUE;
		int intMax = Integer.MAX_VALUE;
		int intMin = Integer.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;
		double doubleMin = Double.MIN_VALUE;
		
		System.out.println("byte max value is: " + byteMax);
		System.out.println("byte min value is: " + byteMin);
		System.out.println("short max value is: " + shortMax);
		System.out.println("short min value is: " + shortMin);
		System.out.println("long max value is: " + longMax);
		System.out.println("long min value is: " + longMin);
		System.out.println("int max value is: " + intMax);
		System.out.println("int min value is: " + intMin);
		System.out.println("double max value is: " + doubleMax);
		System.out.println("double min value is: " + doubleMin);
		
		//4.boolean
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		//5.Char
		char c1 = 'a' ;
		char c2 = '中' ;
		char c3 = 97  ;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}

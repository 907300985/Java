package cn.tedu.basic;

import java.util.Scanner;

/** This class is used to calculate circle's area */
public class TestCircleArea {
	public static void main(String[] args) {
		
		System.out.println("pls enter ur radius:\n");
		double r = new Scanner(System.in).nextDouble();
		double area;
		area = 3.14*r*r;
		System.out.println("The area of the circle is: "+ area);
	}
}

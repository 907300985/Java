package cn.tedu.oop2;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		
		p1.brand = "Samsung";
//		p1.color = "Blue";
//		p1.price = 4999;
//		p1.size = 5.8;
//		System.out.println(p1.brand);
//		System.out.println(p1.color);
//		System.out.println(p1.price);
//		System.out.println(p1.size);
		
		System.out.println("你要给苹果发送什么消息？");
		String s = new Scanner(System.in).next();
		//p1.call(s);
		//p1.message("发短信给我吧");
		//p1.video("播放视频给我吧");	
		
		Phone p2 = new Phone();
		p2.brand = "Apple";
//		p2.color = "Black";
//		p2.price = 6000;
//		p2.size = 5.5;
//		System.out.println(p2.brand);
//		System.out.println(p2.color);
//		System.out.println(p2.price);
//		System.out.println(p2.size);
		System.out.print(p2.brand + " 收到了：" );
		p2.call(s);
		//p2.message("正在发短信");
		//p2.video("正在播放视频");	
		
//		System.out.println(p1);
//		System.out.println(p2);
	}
}

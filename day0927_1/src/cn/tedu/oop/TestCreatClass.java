/**对象：状态，行为，标识*/
package cn.tedu.oop;
/**本类用作面向对象入门案例*/
//需求：设计手机这一类事物
public class TestCreatClass {
	//main函数，代码入口
	public static void main(String[]args) {
		//根据模板创建出一个个具体的对象
		/**通过new关键字创建对应类的对象*/
		Phone p = new Phone();
		/**我们通过.来使用对象的资源*/
		//调用对象的方法
		p.call();
		p.message();
		p.video();
		//查看对象的属性值
		System.out.println(p.brand);
		System.out.println(p.size);
		System.out.println(p.color);
		System.out.println(p.price);
		
		//创建第二个对象
		Phone p2 = new Phone(); 
		p2.brand = "HUAWEI";
		p2.size = 5.6;
		p2.color = "五彩斑斓的黑";
		p2.price = 8888;
		System.out.println(p2.brand);
		System.out.println(p2.size);
		System.out.println(p2.color);
		System.out.println(p2.price);
		p2.call();
		p2.message();
		p2.message();
		
	}
}

//1.创建模板，通过class关键字描述手机这一类事物
//特点：品牌 颜色 尺寸 价格...
//功能： 打电话 发短信...
class Phone{/**封装：将一类事物的特征和行为封装成一个组件*/
	//1.定手机类特点--成员变量
	String brand;
	String color;
	double size;
	double price;
	
	//2.定义手机类的功能--方法
	public void call() {
		System.out.println("正在打电话");
	}
	public void message() {
		System.out.println("发短信中");
	}
	public void video() {
		System.out.println("正在看直播");
	}
}
package day01;

import javax.jws.soap.SOAPBinding;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) {

		String vcode = getStringRandom();
		System.out.println("验证码为："+ vcode);
		System.out.println("请输入验证码：");
		String input = new Scanner(System.in).next();
		if((input).equalsIgnoreCase(vcode)){ //忽略大小写直接判断属性值是否相等
			System.out.println("恭喜你! 验证码输入正确!");
		}else{
			System.out.println("验证码输入错误");
		}
	}

	public static String getStringRandom() {
		String vcode = "";
		char[] arr = new char[5]; // char数组【长度5】
		//length=表示生成几位随机数
		for(int i = 0; i < arr.length; i++) { //随机生成5个大写字母（ASCII码表65-90）
			arr[i] = (char)(new Random().nextInt(26)+65);	//0+65 -> 26+65  [65->91]
			for (int j = 0; j < arr.length; j+=new Random().nextInt(arr.length)) { //随机跳过0->4个元素生成改写为大写字母
				arr[j] = (char)(new Random().nextInt(26)+97); //0+97 -> 26+97  [97->123] //大写字母ASCII码表 97-122
			}
		}
		return vcode.valueOf(arr); //将有5个元素的char数组，转成String字符串
	}
}

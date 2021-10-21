package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String s = "大家好";
		System.out.println("大家好!");
		String s1 = s.concat("我是优秀的程序员!");
		System.out.println(s1);
		String s2 = s1.replace("优秀","牛牛");
		System.out.println(s2);
		String s3 = s2.substring(3);
		System.out.println(s3);

	}
}

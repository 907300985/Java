package cn.tedu.hello;

/**
 * @author 90730
 *
 */
public class HelloWorld {
	
	public static void main(String[] args) {
//		while (true)
		multihello();
	
	}
	public static void multihello() {
		String acc = " times left";
		for (int i=100;i>=1;i--)
			System.out.println(i+ acc);
	}
}

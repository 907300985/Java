package cn.tedu.method;

public class MultiParameters {
	public static void main(String[] args) {
		String x = method(1,2,"3");
		System.out.println(x);
	}

	private static String method(int i, int j, String string) {
		// TODO Auto-generated method stub
		return "i"+"j"+string;
	}
}

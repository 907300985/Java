package cn.tedu.oop.oop;

/**
 * @Date:2021/10/12 14:33
 * @Author:NANDI_GUO
 * 测试方法的返回值
 */
public class MethodDemo {
    public static void main(String[] args) {
        f1();

        int result = f1();
        System.out.println(result);

        System.out.println("我的值是"+f1());
        f3();
    }

    public static int f1(){
        return 10;
    }

    public static void f3(){
        System.out.println("我是f3");
    }

}

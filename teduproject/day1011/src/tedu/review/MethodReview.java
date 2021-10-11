package tedu.review;

import java.util.Scanner;

/**
 * @Date:2021/10/11 9:33
 * @Author:NANDI_GUO
 */
public class MethodReview {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        f1("果",n);
    }
    /***
     *修饰符 返回值类型 方法名 （参数列表）{方法体}
     */
    public static void f1(){
        System.out.println("方法1没有参数");
    }
    public static void f1(int i){
        System.out.println("我的答案是"+i*i);
    }
    public static void f1(String name, int times){
        System.out.println(name+"要写"+times+"次代码");
    }

}

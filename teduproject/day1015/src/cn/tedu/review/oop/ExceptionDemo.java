package cn.tedu.review.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Date:2021/10/15 10:41
 * @Author:NANDI_GUO
 * 本类用于异常的入门案例
 */
public class ExceptionDemo {
    public static void main(String[] args)  {
        //method1();
        //method2();//异常解决方案1--捕获处理--自己解决
        /**main()不直接调用会抛出异常的method3，俄日是调用f（）解决了method3可能会抛出的异常*/
        f();
        //method3(); //调用解决异常的方法，向上抛出，交给调用者来解决
    }

    private static void f() {
        try {
            method3();
        }catch (Exception e){
            System.out.println("报错");
        }
    }

    /*如果一个方法抛出了异常，那么谁调用谁就去处理
    * 这里的处理也有两种方案：捕获解决，或者继续向上抛出
    * 注意：我们一般会在main方法调用之前解决问题，而不是抛给main(),因为没人解决了*/
    //在方法的小括号与大括号之间写throws异常类型
    //如果有多个已成，使用逗号分隔
    //private static void method3() throws ArithmeticException, InputMismatchException{
    private static void method3() throws Exception{
        System.out.println("输入第一个整数:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("输入第二个整数:");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a/b);
    }

    private static void method2() {
        try{
            System.out.println("输入第一个整数:");
            int a = new Scanner(System.in).nextInt();
            System.out.println("输入第二个整数:");
            int b = new Scanner(System.in).nextInt();
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }catch(InputMismatchException e){
            System.out.println("输入类型有问题");
        }catch (Exception e){ //多态思想，父类Exception，处理所有异常
            System.out.println("你输入数据的不对");
        }
        /*try catch可以嵌套，如果有多种需要处理*/
    }

    private static void method1() {
        System.out.println("输入第一个整数:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("输入第二个整数:");
        int b = new Scanner(System.in).nextInt();
        //ArithmeticException -- 算数异常
        //InputMismatchException
        /**不要害怕bug*/
        try{
            System.out.println(a/b);
        }catch (Exception e){
            System.err.println("错误"+e);
        }


    }
}


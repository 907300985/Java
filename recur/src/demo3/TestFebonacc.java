package demo3;

/**
 * @Date:2021/10/2 13:30
 * @Author:NANDI_GUO
 */
public class TestFebonacc {
    //斐波那契数列：1 1 2 3 5 8 13
    public static void main(String[] args) {
        int i = febonacci(10);
        System.out.println(i);
    }
    //打印nxiang的数列
    public static int febonacci(int i){
        if (i == 1 || i == 2) {
            return 1;
        }else{
            return febonacci(i-1)+febonacci(i-2);
        }

    }

}

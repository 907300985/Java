package demo3;

/**
 * @Date:2021/10/2 13:22
 * @Author:NANDI_GUO
 */
public class TestRecursive {
    public static void main(String[] args) {
        print(3);
    }
    //递归
    public static void print(int i) {
        if (i > 0) {
            System.out.println(i);
            print(i-1);
        }
    }
}
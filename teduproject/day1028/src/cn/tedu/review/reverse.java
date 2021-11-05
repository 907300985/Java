package cn.tedu.review;

/**
 * @Date:2021/11/4 20:45
 * @Author:NANDI_GUO
 */
public class reverse {
    public static void main(String[] args) {
        reverse(12345);
    }

    public static int reverse(int num){
        System.out.print(num%10);
        if (num / 10 == 0) {
            return num;     //5 retur 5
        }else {
            return reverse(num/10); // 1234 123 12 1
        }
    }
}

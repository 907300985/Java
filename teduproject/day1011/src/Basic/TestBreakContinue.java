package Basic;

import java.util.Scanner;

/**
 * @Date:2021/10/11 10:09
 * @Author:NANDI_GUO
 */
public class TestBreakContinue {
    public static void main(String[] args) {
        int n = 1;
        while(n<=100){
            System.out.println("输入你的数字：");
            int guess = new Scanner(System.in).nextInt();
            n++;
            if(guess == 88){
                System.out.println("猜对了");
                break;
            }else if(guess < 88){
                System.out.println("往大了猜");
                continue;
            }else if(guess > 88){
                System.out.println("往小了猜");
                continue;
            }
            System.out.println("我在测试代码效率");
        }
    }
}

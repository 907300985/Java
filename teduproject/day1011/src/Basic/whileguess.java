package Basic;

import java.util.Random;
import java.util.Scanner;

/**
 * @Date:2021/10/11 10:45
 * @Author:NANDI_GUO
 */
public class whileguess {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int count = 6;
        while (count > 0) {
            System.out.println("-------"+"还剩"+count+"发子弹"+"---------");
            count--;
            int r = new Random().nextInt(count) + 1;
            Scanner n = new Scanner(System.in);
            if(n.next()!=null   ){
                if (r == count) {
                    System.out.println("喝酒");
                    break;
                }
            }
        }
    }
}

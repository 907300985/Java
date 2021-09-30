package tedu.plan;
import java.util.Scanner;

/**
 * @Date:2021/9/29 12:46
 * @Author:NANDI_GUO
 */

public class Now {
    public static int yearnow;
    public static int futureyear;
    public static int ms;
    public static Future f = new Future();

    public static void main(String[] args) {
        System.out.println("请输入你入学达内的年份: ");
        yearnow = new Scanner(System.in).nextInt();
        System.out.println("请输入你入学达内的月份: ");
        ms = new Scanner(System.in).nextInt();
        f.when(); //调用future中的when方法
        decide();
    }

    public static void decide() {
        String y = "yes";
        String n = "no";

        System.out.println("是否要查看目标？(yes/no)");
        String d = new Scanner(System.in).next();
        if (y.equals(d)) {
            f.goal();
        } else if (n.equals(d)) {
            System.out.println("\n行，那不看目标了");
        }

        System.out.println("是否要查看理想的工作？(yes/no)");
        String d1 = new Scanner(System.in).next();
        if (y.equals(d1)) {
            f.job();
            System.out.println("\n会话结束");
        } else if (n.equals(d1)){
            System.out.println("行，那我们结束会话");
        }
    }
}



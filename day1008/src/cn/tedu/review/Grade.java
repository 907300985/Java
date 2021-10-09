package cn.tedu.review;

import java.util.Scanner;

/**
 * @Date:2021/10/8 15:28
 * @Author:NANDI_GUO
 */
public class Grade {
    public static void main(String[] args) {
        System.out.println("输入你的成绩：");
        int score = new Scanner(System.in).nextInt();
        System.out.println(identify(score));
    }
    static String identify(int score){
        String a ="最强王者",b = "星耀", c = "钻石",d = "铂金",e = "禁止玩游戏",f = "请重新运行";
        if(score > 100 || score < 0){
        } else{
            if(score >= 90){
                return a;
            }else if (score >= 80){
                return b;
            }else if(score>=70){
                return c;
            }else if (score>=60){
                return d;
            }
            return e;
        }
       return f;
    }
}

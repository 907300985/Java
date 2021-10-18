package cn.tedu.exec2;

import java.util.Scanner;

/**
 * @Date:2021/10/15 17:55
 * @Author:NANDI_GUO
 * 士兵类的测试类
 */
public class TestDemo {
    public static void main(String[] args) {
        AK47 a = new AK47();
        Soldier s1 = new Soldier();
        System.out.println("按回车射击，输入load装子弹");
        while (true){
            String s = new Scanner(System.in).nextLine();
            if (s.equals("load")){
                a.load();
                continue;
            }
            a.fire();
            s1.attack();
        }
    }
}

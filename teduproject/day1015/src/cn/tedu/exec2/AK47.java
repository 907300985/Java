package cn.tedu.exec2;

import java.util.Random;

/**
 * @Date:2021/10/15 17:39
 * @Author:NANDI_GUO
 */
public class AK47 {
    int bullets = 100; //定义子弹的初始值为100发
    public void fire(){
        if(bullets ==0){
            System.out.println("没有子弹了");
            return;
        }
        int r = new Random().nextInt(10);//子弹发射数量
        if (r>bullets){
            r = bullets;
        }
        bullets-=r;
        for (int i = 0; i < r; i++) {
            System.out.print("突");
        }
        System.out.println("~");

        if (bullets == 0){
            System.out.println("弹夹空了");
        }
    }
    public void load(){
        bullets = 100;
        System.out.println("弹夹装满");
    }
}

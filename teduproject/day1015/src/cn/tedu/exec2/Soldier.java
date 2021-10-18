package cn.tedu.exec2;

import java.util.Random;

/**
 * @Date:2021/10/15 17:23
 * @Author:NANDI_GUO
 * 士兵类
 */
public class Soldier {
    int id;
    int hp = 100;
    AK47 a; //引用类型AK47作为属性

    //定义士兵类的方法1
    public void go(){
        System.out.println(this.id+"号士兵在前进");
    }
    public void attack(){
        if (hp == 0) {
            System.out.println("这是"+id+"号士兵的尸体");
            return;
        }
        System.out.println(this.id+"号士兵在进攻");
        if (a != null){
            a.fire();
        }
        int d = new Random().nextInt(10);//随机1-10 攻击掉血量
        hp -= d;
        //血量重置为0
        if(hp < 0){
            hp = 0;
        }
    }
}

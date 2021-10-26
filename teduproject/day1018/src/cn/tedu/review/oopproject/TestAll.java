package cn.tedu.review.oopproject;

/**
 * @Date:2021/10/18 15:57
 * @Author:NANDI_GUO
 */
public class TestAll {
    public static void main(String[] args) {
        Ant a = new Ant();
        Bee b = new Bee();
        Pigeon p = new Pigeon();
        Swallow s = new Swallow();
        a.fly();
        a.lay(9999);
        System.out.println("蚂蚁腿数量："+a.legs);

        b.fly();
        b.lay(300);
        b.build();
        System.out.println("蜜蜂腿数量："+b.legs);

        p.fly();
        p.lay(10);
        System.out.println("鸽子腿数量："+p.legs);

        s.fly();
        s.lay(5);
        s.build();
        System.out.println("燕子腿数量："+s.legs);
    }

}

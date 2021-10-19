package cn.tedu.oopproject;

/**
 * @Date:2021/10/18 15:51
 * @Author:NANDI_GUO
 */
public class Pigeon extends Bird implements FlyAnimal{
    @Override
    public void lay(int eggs) {
        System.out.println("鸽子能下蛋的数量："+eggs);
    }

    @Override
    public void fly() {
        System.out.println("鸽子会飞");
    }
}

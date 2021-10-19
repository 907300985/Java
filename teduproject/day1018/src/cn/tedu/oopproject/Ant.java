package cn.tedu.oopproject;

/**
 * @Date:2021/10/18 15:54
 * @Author:NANDI_GUO
 */
public class Ant extends Insect implements FlyAnimal {
    @Override
    public void fly() {
        System.out.println("蚂蚁会飞");
    }

    @Override
    public void lay(int eggs) {
        System.out.println("蚂蚁能产卵的数量是"+eggs);
    }
}

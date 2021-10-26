package cn.tedu.review.oopproject;

/**
 * @Date:2021/10/18 15:55
 * @Author:NANDI_GUO
 */
public class Bee extends Insect implements FlyAnimal{
    @Override
    public void fly() {
        System.out.println("蜜蜂会飞");
    }

    @Override
    public void lay(int eggs) {
        System.out.println("蜜蜂能产卵的数量是"+eggs);
    }
    void build(){
        System.out.println("蜜蜂能制作蜂蜜");
    }
}

package cn.tedu.review.oopproject;

/**
 * @Date:2021/10/18 15:53
 * @Author:NANDI_GUO
 */
public class Swallow extends Bird implements FlyAnimal {
    @Override
    public void lay(int eggs) {
        System.out.println("燕子下蛋的数量是" + eggs);
    }

    @Override
    public void fly() {
        System.out.println("燕子会飞");
    }

    void build(){
        System.out.println("燕子会筑巢");
    }
}

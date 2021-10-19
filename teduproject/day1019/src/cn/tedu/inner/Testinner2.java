package cn.tedu.inner;

/**
 * @Date:2021/10/19 10:36
 * @Author:NANDI_GUO
 */
public class Testinner2 {
    public static void main(String[] args) {
//        Outer2.Inner2 oi2 = new Outer2().new Inner2();
//        oi2.eat();
//        //oi2.play();
        new Outer2().getInner2Eat();
    }
}
class Outer2{
    //提供本类的公共方法
    //创建内部类对象
    public void getInner2Eat(){
        Inner2 i = new Inner2();
        i.eat();
    }

    private class Inner2{
        public void eat(){
            System.out.println("Inner2的eat()");
            play();
        }
        public void play(){
            System.out.println("偷偷的玩");
        }
    }
}

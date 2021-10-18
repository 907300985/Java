package cn.tedu.review;

/**
 * @Date:2021/10/15 10:06
 * @Author:NANDI_GUO
 */
public class TestDemo {
    public static void main(String[] args) {
        Fruit f0 = new Fruit();//纯纯的父类对象
        Fruit f1 = new Apple();
        Fruit f2 = new Lemon();
        f0.clean();
        f1.clean();
        f2.clean(); //方法声明使用的是父类的，方法体使用的是子类的

        System.out.println(f0.name);
        System.out.println(f1.name);
        System.out.println(f2.name);

        f1.grow();
        getFruit(f0);
        getFruit(f1);
        getFruit(f2);
        Apple a = new Apple();
        Lemon l = new Lemon();
        getFruit(a);
        getFruit(l);

    }

    public static void getFruit(Fruit f){
        f.clean();
        //f.special();
    }
}
class Fruit{
    String name = "水果";
    public void clean(){
        System.out.println("水果类的clean()");
    }
    public void grow(){
        System.out.println("我长帐");
    }

}
class Apple extends Fruit{
    String name = "苹果";
    @Override
    public void clean(){
        System.out.println("苹果类的clean()");
    }
    public void special(){
        System.out.println("子类独有");
    }

}

class Lemon extends Fruit{
    String name = "柠檬";
    @Override
    public void clean(){
        System.out.println("柠檬类的clean()");
    }

}
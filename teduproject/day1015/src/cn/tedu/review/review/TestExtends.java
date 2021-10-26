package cn.tedu.review.review;

/**
 * @Date:2021/10/15 9:02
 * @Author:NANDI_GUO
 */
//重写的原则
    //两同：方法名和参数列表
    //两小：方法的返回值类型属于父类方法返回值类型的子类
    //一大： 方法的修饰符》=父类方法的修饰符
public class TestExtends {

    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        Father f1 = new Son();

        f.sleep(6);
        s.sleep(8);

        int a = f.play();
        int b = s.play();
        System.out.println("父类"+a);
        System.out.println("子类"+b);

        Animal a1 = f.getPet();
        System.out.println(a1.name);
        Dog d1 = s.getPet();
        System.out.println(d1.name);
    }
}
class Father{
    public void eat(){
        System.out.println("爸爸爱吃肉");
    }

    public void sleep(int n){
        System.out.println("爸爸晚上睡"+n+"个小时");
    }
    public int play(){
        System.out.println("爸爸在玩风筝");
        return 666;
    }
    public Animal getPet(){
        Animal a = new Animal();
        return a;
    }



}
class Son extends Father{
    @Override
    public void eat(){
        System.out.println("儿子爱吃护士");
    }
    @Override
    public void sleep(int n){
        System.out.println("儿子晚上睡"+n+"个小时");
    }
    @Override
    public int play(){
        System.out.println("儿子在夜店");
        return 777;
    }
    @Override
    public Dog getPet(){
        Dog d = new Dog();
        return d;
    }
}

class Animal{
    String name = "啥动物都行";
}
class Dog extends Animal{
    String name = "小狗";
}
class Car{

}
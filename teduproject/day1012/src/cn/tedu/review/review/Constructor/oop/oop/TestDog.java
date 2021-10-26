package cn.tedu.review.review.Constructor.oop.oop;

/**
 * @Date:2021/10/12 17:04
 * @Author:NANDI_GUO
 */
public class TestDog {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d2 = new Dog();

        d.setAge(999);
        d.setHost("二郎神");
        d.setKind("猎狗");
        d.setName("哮天犬");
        d.setPrice(10000);

        System.out.println(d.getAge());
        System.out.println(d.getHost());
        System.out.println(d.getKind());
        System.out.println(d.getName());
        System.out.println(d.getPrice());

        d.eat(3);
        d.run();
        d.sleep(8);
        System.out.println(d.play(d.getHost()));
//=======================================================================
        d2.setAge(5);
        d2.setHost("大自然");
        d2.setKind("神奇犬");
        d2.setName("罗小黑");
        d2.setPrice(999.99);

        System.out.println(d2.getAge());
        System.out.println(d2.getHost());
        System.out.println(d2.getKind());
        System.out.println(d2.getName());
        System.out.println(d2.getPrice());

        d2.eat(3);
        d2.run();
        d2.sleep(8);
        System.out.println(d2.play(d2.getHost()));

    }
}
class Dog{
    private String name;
    private int age;
    private String kind;
    private String host;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void run(){
        System.out.println("小狗在跑");
    }
    public void eat(int bone){
        System.out.println("小狗今天要吃"+bone+"根肉骨头");
    }
    public void sleep(double num){
        System.out.println("小狗睡了"+num+"小时");
    }
    public String play(String host){
        //this.host = host;
        System.out.println("小狗在和"+host+"玩耍");
        bark();
        return "飞盘\n";
    }
    private void bark(){
        System.out.println("小狗在狂吠");
    }
}
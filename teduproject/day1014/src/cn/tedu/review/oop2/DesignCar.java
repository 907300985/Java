package cn.tedu.review.oop2;

/**
 * @Date:2021/10/14 17:27
 * @Author:NANDI_GUO
 */
public class DesignCar {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.getColor());
        c.start();
        c.stop(); //父类对象不可以调用子类的特有功能

        BMW b = new BMW();
        System.out.println(b.color);
        System.out.println(b.getColor());
        b.start();  //重写的功能
        b.stop();  //继承的功能

        //-----------多态对象的测试-----------

        Car c2 = new TSL();
        c2.setColor("red");
        System.out.println(c2.getColor());
        c2.stop();  //重写的功能
        c2.start(); //继承的功能
        //c2.swim(); 未定义在父类
    }
}

class Car{
    private String brand;
    private String color;
    private int id;
    private double price;

    public void start(){
        System.out.println("小汽车启动了");
    }
    public void stop(){
        System.out.println("熄火了");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class BMW extends Car{
    String color = "五彩斑斓的黑";
    @Override
    public void start(){
        System.out.println("都让开，我要起飞了");
    }
}

class TSL extends Car{
    @Override
    public void stop(){
        System.out.println("怎么停不下来呢");
    }
    //特有功能
    public void swim(){
        System.out.println("启动潜水模式");
    }
}
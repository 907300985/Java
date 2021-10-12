package cn.tedu.oop;

/**
 * @Date:2021/10/12 16:06
 * @Author:NANDI_GUO
 */
public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car();

        /*
        c1.brand = "依维柯大金杯";
        c1.color = "锈迹斑斑";
        c1.length = 4;
        c1.price = 30000;

        System.out.println(c1.brand);
        System.out.println(c1.color);
        System.out.println(c1.length);
        System.out.println(c1.price);
        */

        c1.setBrand("依维柯大金杯");
        c1.setColor("锈迹斑斑");
        c1.setLength(4);
        c1.setPrice(30000);

        System.out.println(c1.getBrand());
        System.out.println(c1.getColor());
        System.out.println(c1.getLength());
        System.out.println(c1.getPrice());

        c1.start();
        //c1.stop();
        //new Car().stop();
    }
}

//抽象汽车这一事物的共同点
class Car{
    //属性--成员变量
    //封装所有属性
    private String brand;
    private String color;
    private double price;
    private double length;

    //右键全选直接生成set get
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

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public void start(){
        System.out.println("拉完body");
        stop();
    }
    private void stop(){
        System.out.println("拉skulldust");
    }
}

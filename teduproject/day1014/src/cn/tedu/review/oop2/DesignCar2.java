package cn.tedu.review.oop2;

/**
 * @Date:2021/10/14 19:05
 * @Author:NANDI_GUO
 */
public class DesignCar2 {
    public static void main(String[] args) {
        Car2 c = new Car2();
        c.setBrand("什么车");
        System.out.println(c.getBrand());
        c.start();
        c.stop();

        Car2 c1 = new BMW2();
        c1.setBrand("BMW");
        System.out.println(c1.getBrand());
        c1.start();
        c1.stop();

        Car2 c2 = new TSL2();
        c2.start();
        c2.stop();
        //c2.swim() //父类未定义
        System.out.println(1+2+"java"+3+4);
    }
}
class Car2{
    private String brand;
    private String color;
    private double price;

    public void start(){
        System.out.println("汽车启动了");
    }
    public void stop(){
        System.out.println("汽车停止了");
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
class BMW2 extends Car2{
    @Override
    public void start(){
        System.out.println("宝马最牛逼");
    }
    @Override
    public void stop(){
        System.out.println("宝马停止了");
    }
}
class TSL2 extends Car2{
    @Override
    public void start(){
        System.out.println("特斯拉最牛逼");
    }
    @Override
    public void stop(){
        System.out.println("特斯拉停止了");
    }
    public void swim() {
        System.out.println("特斯拉水上漂");
    }
}

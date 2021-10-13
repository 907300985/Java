package cn.tedu.oop;

/**
 * @Date:2021/10/13 9:32
 * @Author:NANDI_GUO
 */
public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBand("apple");
        p.setColor("red");
        p.setPrice(4999);
        p.setSize(5.5);

        System.out.println(p.getBand());
        System.out.println(p.getColor());
        System.out.println(p.getPrice());
        System.out.println(p.getSize());

        p.message(p.getBand());
        p.video(p.getBand());


        //===================================================
        Phone p2 = new Phone();
        p2.setBand("Samsung");
        p2.message(p2.getBand());
        p2.video(p2.getBand());

    }
}
class Phone{
    private String band;
    private String color;
    private double price;
    private double size;

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    private void call(String name){
        System.out.println(name + "在打电话");
    }
    void message(String name){
        System.out.println(name + "再发短信");
    }
    void video(String name){
        System.out.println(name + "在看视频");
        call(name);
    }
}

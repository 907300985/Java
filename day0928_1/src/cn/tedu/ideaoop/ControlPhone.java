package cn.tedu.ideaoop;

public class ControlPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "Samsung";
        p.price = 1700;
        p.size = 5.8;

        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println(p.size);
        p.call();
    }
}

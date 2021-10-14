package cn.tedu.review;

import javax.jws.soap.SOAPBinding;

/**
 * @Date:2021/10/14 9:49
 * @Author:NANDI_GUO
 */
public class TestThis {
    public static void main(String[] args) {

    }
}
class Car{
    int id;
    String brand;
    double price;

    public Car(){
        this(2);
        System.out.println("无参构造");
    }
    public Car(int n){
        System.out.println("韩餐构造"+n);
    }

    public void run(){
        int id = 100;
        System.out.println(id);
        System.out.println(this.id);
    }

}
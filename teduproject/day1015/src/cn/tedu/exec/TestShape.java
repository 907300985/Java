package cn.tedu.exec;

/**
 * @Date:2021/10/15 17:03
 * @Author:NANDI_GUO
 * 设计图形业务
 */
public class TestShape {
    public static void main(String[] args) {
//        Shape s = new Shape();
//        s.draw();
//        s.clear();
//        s.draw();
        Circle c = new Circle();
        c.draw();
        Sqare sq = new Sqare();
        sq.draw();

    }
}
abstract class Shape{
    //创建父类的方法
    abstract public void draw();
    public void clear(){
        System.out.println("\n\n\n");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("画个🩱");
    }
}
class Sqare extends Shape{
    @Override
    public void draw(){
        System.out.println("画个方形🖖");
    }
    public void area(){//特有方法
        System.out.println("这个面积不太大");
    }
}
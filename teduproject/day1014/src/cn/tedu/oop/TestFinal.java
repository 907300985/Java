package cn.tedu.oop;

/**
 * @Date:2021/10/14 15:08
 * @Author:NANDI_GUO
 * 用于测试Final关键字
 */
public class TestFinal {

}
/**final可以修饰类，被final修饰的类是最终类，不可以被继承
 * 可以把被Final修饰的类看作是树结构的叶子节点*/
class Father2{
    public void work(){
        /**Final可以用来修饰方法，被final修饰的方法是这个方法的最终实现，不可以被重写*/
        System.out.println("老一辈的人在工厂里上班¬");
    }
}
class Son2 extends Father2{
    final int C = 66;
    //重写父类的方法
    @Override//这个注解用来标记这是一个重写的方法
    public void work(){
        int a = 10;
        a = 100;
        /**被final修饰的是常量，常量的值不可以被修改
         * 常量定义的时候必须赋值
         * 常量的名称必须是全大写，单词与单词之间使用_分割*/
        final int b = 100;
        //b = 200;
        System.out.println("年轻人在互联网大厂里上班¬");
    }
}

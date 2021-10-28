package cn.tedu.reflection;

/**
 * @Date:2021/10/28 14:08
 * @Author:NANDI_GUO
 */
public class Person {
    private String name;
    private int age;

    public void save(int n, String s){
        System.out.println("save方法"+n+s);
    }
    public  void update(){
        System.out.println("跟新");
    }
}

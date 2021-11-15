package cn.reflection;

/**
 * @Date:2021/11/13 16:07
 * @Author:NANDI_GUO
 */

public class TestReflection {
    public static void main(String[] args) throws Exception {
        Class<?> c1 = Class.forName("cn.reflection.User");
        System.out.println(c1);

        Class<?> c2 = Class.forName("cn.reflection.User");
        Class<?> c3 = Class.forName("cn.reflection.User");
        //一个在内存中只有一个class对象
        //一个类被加载后，类的整个结构都会被封装在class中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}

class User{
    private String name;
    private int id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
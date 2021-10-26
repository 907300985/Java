package cn.tedu.review.oop;

/**
 * @Date:2021/10/18 15:35
 * @Author:NANDI_GUO
 */
public class TestPerson {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Parents p = new Parents();
        Student s = new Student();
        t.eat();
        p.eat();
        s.eat();

        t.sleep();
        p.sleep();
        s.sleep();
    }
}

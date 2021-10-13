package cn.tedu.oop.oop;

/**
 * @Date:2021/10/12 15:21
 * @Author:NANDI_GUO
 * 本类继续测试封装
 */
public class TestPrivate2 {
    public static void main(String[] args) {
        Student s = new Student();
        //操作学生
        s.name = "毛利小五兰";
        //s.subject = "JAVA大数据";
        //s.sno = 14311495;
        //System.out.println(s.name+s.subject+s.sno);
        s.study();
        s.setSubject("CGB");
        System.out.println(s.getSubject());

        s.setSno(14311495);
        System.out.println("学号是："+s.getSno());


    }
}

class Student{
    //2.学生的属性：学号 姓名 科目
    String name;
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    //使用private修饰subject属性
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    //3.学生的功能
    public void study(){
        System.out.println("别闹，学java呢");
    }
    public void eat(){
        System.out.println("干饭不积极，思想有问题");
    }
    public void sleep(){
        System.out.println("我一点也不想睡觉吗，就想学java");
    }
}

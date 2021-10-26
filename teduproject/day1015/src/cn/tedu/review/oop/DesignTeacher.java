package cn.tedu.review.oop;

/**
 * @Date:2021/10/15 15:30
 * @Author:NANDI_GUO
 * 面向抽象编程老师类
 */
public class DesignTeacher {
    public static void main(String[] args) {
        CGBTeacher ct = new CGBTeacher();
        SCDTeacher st = new SCDTeacher();
        ct.ready();
        ct.teach();
        st.ready();
        st.teach();
    }
}

abstract class Teacher{
    String name;
    int id;
    abstract public void ready();
    abstract public void teach();
}

class CGBTeacher extends Teacher{
    @Override
    public void ready(){
        System.out.println("备课电商项目");
    }
    @Override
    public void teach(){
        System.out.println("授课电商项目");
    }
}

class SCDTeacher extends Teacher{
    @Override
    public void ready(){
        System.out.println("备课大数据项目");
    }
    @Override
    public void teach(){
        System.out.println("授课大数据项目");
    }
}
class ACTTeacher extends Teacher{
    @Override
    public void ready(){
        System.out.println("备课高薪项目");
    }
    @Override
    public void teach(){
        System.out.println("授课高薪项目");
    }
}


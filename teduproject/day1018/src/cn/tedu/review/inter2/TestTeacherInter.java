package cn.tedu.review.inter2;

/**
 * @Date:2021/10/18 11:50
 * @Author:NANDI_GUO
 * 本类用于面向接口编程
 */
public class TestTeacherInter {
    public static void main(String[] args) {
        CGBTeacher c = new CGBTeacher();
        ACTTeacher a = new ACTTeacher();
        SCDTeacher s = new SCDTeacher();

        c.ready();
        c.teach();
        a.ready();
        a.teach();
        s.ready();
        s.teach();
    }
}
interface Teacher{
    void teach();
    void ready();
}

class CGBTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("准备大数据");
    }

    @Override
    public void ready() {
        System.out.println("教学大数据");
    }
}
class ACTTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("准备act课");
    }

    @Override
    public void ready() {
        System.out.println("教学act");
    }
}

class SCDTeacher implements Teacher{
    @Override
    public void teach() {
        ready();
    }
    @Override
    public void ready() {
        System.out.println("正在研发新课程。。。");
    }
}
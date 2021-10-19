package cn.tedu.cn.tedu.api;

/**
 * @Date:2021/10/19 15:01
 * @Author:NANDI_GUO
 * 苯类用于顶级父类OBJECT的入门案例
 */
    /*如何找到Object类呢*/
    //1.查API手册
    //2. 连点两下shift，打开idea的搜索工具，注意勾选include non project
    //再在搜索框的位置搜索要查的类Object
    //3.在扩展库External libraries 找到jdk-1.8->re.jar->java.lang.Object
    //4. 按住Ctrl键，点hashcode（）方法名
public class TestObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("张三",22,80,"3");
        Student s3 = new Student("张三",22,80,"3");


        //测试hashcode()方法
        /*本方法的作用是返回对应对象的int类型的哈希码值
        * 不同的对象返回不同的哈希码值
        * 哈希码值区分不同对象*/
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        /*负责打印s2对象的是println方法，这个方法会层层向下一直到Object中的toString方法
        * Object类中toString默认方法打印的是对象的地址值【类名@十六进制哈希码值】
        * 子类重写了Object中的toString方法，打印的是对象的类型+属性+属性值*/
        //测试toString()
        System.out.println(s2);
    }
}
class Student{
    String name;
    int age;
    double score;
    String Grade;

    public Student(){
        System.out.println("无参构造~");
    }

    public Student(String name, int age, double score, String grade) {
        System.out.println("全参构造~");
        this.name = name;
        this.age = age;
        this.score = score;
        Grade = grade;
    }
    //生成子类重写的tostring
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", Grade='" + Grade + '\'' +
                '}';
    }
}
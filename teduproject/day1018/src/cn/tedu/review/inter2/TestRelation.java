package cn.tedu.review.inter2;

/**
 * @Date:2021/10/18 14:17
 * @Author:NANDI_GUO
 * 接口与类之间的复杂关系
 */
public class TestRelation {
    public static void main(String[] args) {
        Inter3Impl f = new Inter3Impl();
        f.delete();
        f.find();
        f.save();
        f.update();
    }
}
//接口1
interface Inter1{
    void save();
    void delete();
}
//接口2
interface Inter2{
    void update();
    void find();
}
/*接口可以继承接口，而且还可以多继承，也就是一个子接口继承多个父接口
* 多个接口之间使用逗号分隔*/
interface Inter3 extends Inter1,Inter2 {

}

//class Inter3Impl implements Inter3
/*实现类与接口是实现的关系，并且实现类可以实现多个接口，接口之间用，隔开
* 对于java中的类而言：遵循单继承，多实现的规则
* 对于Java中的接口而言：遵循既可以单继承，也可以多继承的规则*/
class Inter3Impl implements Inter1,Inter2{
    @Override
    public void save() { System.out.println("行，正在保存"); }

    @Override
    public void delete() { System.out.println("行，正在删除"); }

    @Override
    public void update() { System.out.println("行，正在更新"); }

    @Override
    public void find() { System.out.println("行，正在查找"); }
}
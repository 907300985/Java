package cn.tedu.review.inter;

/**
 * @Date:2021/10/18 10:16
 * @Author:NANDI_GUO
 * 本接口用于创建接口测试
 * 通过interface关键字来定义接口
 */
public interface Inter {
    /*接口中不可以定义普通方法*/
    //public void eat();
    /*接口中可以定义抽象方法，因为全是抽象方法*/
    abstract public void eat();
    abstract public void play();
}

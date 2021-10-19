package cn.tedu.inter;

/**
 * @Date:2021/10/18 10:25
 * @Author:NANDI_GUO
 * 接口的实现类
 * 实现类如果想实现接口定义的功能，需要与接口建立Implements关系
 * 方案一：如果实现类与接口类建立实现关系以后，可以选择不实现接口中的抽象方法，把自己变成一个抽象类
 * 方案二：如果实现类与接口类建立实现关系以后，实现所有接口中的抽象方法
 */
public class InterImpl implements Inter{
    @Override
    public void eat(){
        System.out.println("啥都不吃");
    }

    @Override
    public void play() {
        System.out.println("玩代码");
    }
}


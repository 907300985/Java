package cn.tedu.design;

/**
 * @Date:2021/10/27 17:39
 * @Author:NANDI_GUO
 */
public class Singlelan {
    public static void main(String[] args) {
        MyLazy l1 = MyLazy.getLazy();
        MyLazy l2 = MyLazy.getLazy();
        System.out.println(l1 == l2);
    }
}
class MyLazy{
    private MyLazy(){}
    private static MyLazy lazy;

    public static MyLazy getLazy(){
        if (lazy == null){
            lazy = new MyLazy();
        }
        return lazy;
    }

}
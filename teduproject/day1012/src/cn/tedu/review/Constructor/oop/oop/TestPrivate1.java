package cn.tedu.review.Constructor.oop.oop;

/**
 * @Date:2021/10/12 14:07
 * @Author:NANDI_GUO
 */
public class TestPrivate1 {
    public static void main(String[] args) {
        User u = new User();
        u.name = "葫芦娃";
        System.out.println(u.name);
        System.out.println("原来的钱为"+u.accessMoney());
        u.editMoney(1000000000);
        System.out.println("修改后的钱为"+ u.accessMoney());
    }
}

class User{
    public String name;
    /**被private修饰的资源只能在本类中使用*/
    private double money = 10000;
    //提供公共的方法给外界使用
    public double accessMoney(){
        /**后续可以增加权限管理验证*/
       return money;
    }
    public void editMoney(int n){
        money = n;
    }
}




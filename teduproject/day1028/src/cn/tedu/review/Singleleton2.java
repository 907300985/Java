package cn.tedu.review;

/**
 * @Date:2021/10/28 9:40
 * @Author:NANDI_GUO
 */
public class Singleleton2 {
    public static void main(String[] args) {
        MySingle2 single1 = MySingle2.getSingle2();
        MySingle2 single2 = MySingle2.getSingle2();
        System.out.println(single1 == single2);
        System.out.println(single1);
        System.out.println(single2);
    }
}
class MySingle2{
    private MySingle2(){}
    static private MySingle2 single2;

    static public MySingle2 getSingle2(){
        if (single2 == null){
            single2 = new MySingle2();
        }
        return single2;
    }
}
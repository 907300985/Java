package cn.tedu.design;

/**
 * @Date:2021/10/28 8:31
 * @Author:NANDI_GUO
 */
public class Hungry {
    public static void main(String[] args) {
        HungryS h1 = HungryS.getHungryS();
        HungryS h2 = HungryS.getHungryS();
        System.out.println(h1==h2);
    }
}

class HungryS {
    private HungryS(){}
    static private HungryS hs = new HungryS();
    static public HungryS getHungryS (){
        return hs;
    }
}

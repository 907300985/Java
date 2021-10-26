package cn.tedu.review.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Date:2021/10/25 16:06
 * @Author:NANDI_GUO
 */
public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(9527,"白骨精");
        map.put(9528,"黑熊精");
        map.put(9529,"鲤鱼精");
        map.put(9530,"黄毛怪");
        map.put(9531,"黑熊精");
        map.put(9527,"女儿国王");

        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"=="+value);
        }

        System.out.println("=====================================");

        Set<Map.Entry<Integer,String>> set1 = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it2 = set1.iterator();
        while(it2.hasNext()){
            Map.Entry<Integer, String> en = it2.next();
            Integer key = en.getKey();
            String value = en.getValue();
            System.out.println(key + "--" + value);
        }
    }
}

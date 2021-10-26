package cn.tedu.review.map;

import java.util.*;

/**
 * @Date:2021/10/25 14:08
 * @Author:NANDI_GUO
 * 本类用于测试Map接口
 */
public class MapDemo {
    public static void main(String[] args) {
        /*Map中的数据要符合映射规则，需要同时指定K与V的数据类型
        * 至于KV指定成什么类型，取决与业务的具体要求*/
        Map<Integer,String> map = new HashMap<>();
        map.put(9527,"白骨精");
        map.put(9528,"黑熊精");
        map.put(9529,"鲤鱼精");
        map.put(9530,"黄毛怪");
        map.put(9531,"黑熊精");
        map.put(9527,"女儿国王");
        //System.out.println(map);
        /*map中存放着的都是无序的数据
        * map中的value可以重复--比如存两个黑熊精
        * map中的k如果重读，新value会把旧value覆盖掉*/
        //map.clear();
        //System.out.println(map);
        //System.out.println(map.equals("黄毛怪"));
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());//获取集合中键值对的个数
//        System.out.println(map.containsKey(9527));
//        System.out.println(map.containsValue("白骨精"));
//
//        //将map集合中的所有value值取出放入collection集合中
//        Collection<String> values  = map.values();
//        System.out.println(values);//[女儿国王, 黑熊精, 鲤鱼精, 黄毛怪, 黑熊精]

        /*map集合没有自己的迭代器，所以需要先将map集合转为set集合以后再使用set的迭代器进行迭代
        * 将map集合转为set集合后，再使用set迭代器进行迭代*/
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key+"="+value);
        }

        /*Map集合
         * Map.Entry<>K,V*/
        Set<Map.Entry<Integer, String>> set2 = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it2 = set2.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer,String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-"+value);
        }

    }


}


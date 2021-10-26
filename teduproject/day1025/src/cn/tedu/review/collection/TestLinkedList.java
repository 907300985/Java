package cn.tedu.review.collection;

import java.util.LinkedList;

/**
 * @Date:2021/10/25 11:23
 * @Author:NANDI_GUO
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("唐三藏");
        list.add("沙师弟");
        list.add("白龙马");

        System.out.println(list);

        //3.1 自行测试
        list.addFirst("黄毛怪");
        list.addLast("玉兔精");
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("水浒传");
        list2.add("三国演义");
        list2.add("西游记");
        list2.add("石头记");
        System.out.println(list2);
        System.out.println(list2.element());//查看首元素

        //查询系列
        System.out.println(list2.peek());//查看首元素
        System.out.println(list2.peekFirst());
        System.out.println(list2.peekLast());
        System.out.println(list2);

        //新增子列
        System.out.println(list2.offer("斗罗大陆"));
        System.out.println(list2.offerFirst("斗破苍穹"));
        System.out.println(list2.offerLast("钢铁是怎么练成的"));
        System.out.println(list2);

        //移除系列
        System.out.println(list2.poll());//删除首元素
        System.out.println(list2.pollFirst());
        System.out.println(list2.pollLast());
        System.out.println(list2);
    }
}

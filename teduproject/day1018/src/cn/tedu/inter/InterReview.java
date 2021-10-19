package cn.tedu.inter;

/**
 * @Date:2021/10/18 10:51
 * @Author:NANDI_GUO
 */
public class InterReview {
    public static void main(String[] args) {
        Inter2Impl i = new Inter2Impl();
        i.get();
    }
}

interface Inter2{
    public void get();
}

class Inter2Impl implements Inter2{
    @Override
    public void get(){
        System.out.println("获取");
    }
}
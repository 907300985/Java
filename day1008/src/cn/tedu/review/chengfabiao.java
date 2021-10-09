package cn.tedu.review;

/**
 * @Date:2021/10/8 17:02
 * @Author:NANDI_GUO
 */
public class chengfabiao {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; ++i){
            for (int j = 1; j <= i; ++j) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}

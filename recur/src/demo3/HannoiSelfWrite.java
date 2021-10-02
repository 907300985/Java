package demo3;

/**
 * @Date:2021/10/2 14:05
 * @Author:NANDI_GUO
 */
public class HannoiSelfWrite {
    public static void main(String[] args) {
        han(3,"A","B","C");
        // A->C, A->B, B->C
    }

    public static void han(int n, String from, String mid, String target){
        if (n == 1) {
            System.out.println("将第1个从"+from+"移到"+target);
        }else{
            han(n-1,from,target,mid);
            System.out.println("将第"+ n +"从"+from+"移到"+target);
            han(n-1,mid,from,target);
        }
    }
}


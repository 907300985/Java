package cn.tedu.review;

/**
 * @Date:2021/10/14 10:20
 * @Author:NANDI_GUO
 */
public class TestANWER {
    public static void main(String[] args) {
        jiujiu();
        sum();
        findmax();

    }

    public static void jiujiu(){
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i +"="+ i*j + "\t");
            }
            System.out.println();
        }
    }
    public static void sum(){
        int s = 0;
        for (int i = 1; i <= 10  ; i++) {
            s+=i;
        }
        System.out.println(s);
    }

    public static void findmax(){
        int[] arr = {10,9,1,20,19,30,5};
        int i = 0, j = arr.length - 1;
        while (i<j){
            if (arr[i]<arr[j]){
                i++;
            }else if(arr[j]<arr[i]){
                j--;
            }
        }
        System.out.println("下标是"+j+" 最大值为"+arr[j]);
    }


    public void findMax2(){

    }

}

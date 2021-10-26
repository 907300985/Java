package cn.tedu.review;

/**
 * @Date:2021/10/26 9:57
 * @Author:NANDI_GUO
 */
public class TestNumber {
    public static void main(String[]args){
        String input = "This is a short sentence";

        int current = 0;
        int max = 0;
        char block = ' ';
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != block){
                current++;
                if(current>max){
                    max = current;
                }
            }else{
                current = 0;
            }
        }
        System.out.println("The longest number is: "+max);
    }
}

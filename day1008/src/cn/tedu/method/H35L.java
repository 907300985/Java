package cn.tedu.method;

/**
 * @Date:2021/10/9 16:29
 * @Author:NANDI_GUO
 */
public class H35L {
    public static void main(String[] args) {
//        for (int i = 1; i < 4 ; i++) {
//            for (int j = 1; j < 6 ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        aiXin();
    }
    public static void aiXin(){
        for(float y = (float) 1.5;y>-1.5;y -=0.1)  {
            for(float x= (float) -1.5;x<1.5;x+= 0.05){
                float a = x*x+y*y-1;
                if((a*a*a-x*x*y*y*y)<=0.0)  {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

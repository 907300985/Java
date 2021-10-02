package tedu.letter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Date:2021/9/29 12:47
 * @Author:NANDI_GUO
 */

public class Future {

    public void when(){
        int []m = new int [12];
        for (int i = 0; i < m.length; i++) {        //数组填充
            m[i] = i+1;
        }
        //System.out.println(Arrays.toString(m));
        for (int i = 0; i < 12; i++) {
            if (Now.ms >= 8 & Now.ms < 13){
                Now.ms = m[5-(12-Now.ms)-1];        //12-当前月份 = 差几月12月，4-差几月 = 溢出多少月，最后-1为数组下标
                Now.futureyear = Now.yearnow + 1;
                break;
            } else if (Now.ms < 8 & Now.ms > 0){
                Now.ms += 5;
                Now.futureyear = Now.yearnow;       //普通月份直接加5
                break;
            } else{
                System.out.println("月份无效，请重新输入:");
                Now.ms = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("你将在未来:"+ Now.futureyear
                + "年" + Now.ms + "月毕业\n");
    }

    public void goal(){
        System.out.println("了解过很多编程语言，但都是入门水平。" +
                "目标是在达内系统的学习一门面向对象语言，\n" +
                "并且获得很多项目经验。" +
                "希望在春招面试中自己已经拥有足够的实力。\n"
        );
    }

    public void job(){
        System.out.println("我的意向工作是游戏客户端开发工程师，技术美术或者后端软件工程师。" +
                "这些工作都需要精通一门面向对象语言，\n" +
                "我相信在学习过后能够进入我想进的公司，如字节跳动，米哈游等。"
        );
    }
}

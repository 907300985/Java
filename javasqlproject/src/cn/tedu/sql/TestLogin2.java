package cn.tedu.sql;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Date:2021/11/5 16:31
 * @Author:NANDI_GUO
 */
public class TestLogin2 {
    public static void main(String[] args) throws Exception {
        login();
    }

    public static void login() throws Exception {

        String regex = "[0-9a-zA-Z]*";
        Connection conn = JDBCUtils.get();

        Statement st = conn.createStatement();
        ResultSet rs;
        String name,pwd,sq;
        do {
            System.out.println("输入你的账户名:");
            name = new Scanner(System.in).nextLine();
            System.out.println("输入你的密码:");
            pwd = new Scanner(System.in).nextLine();
            if (name.matches(regex)&&pwd.matches(regex)){
                sq = ("select * from user where"+ " name='"+ name + "'and" + " pwd='" + pwd + "'");
                //System.out.println(sq);
                rs = st.executeQuery(sq);
                if (rs.next()){
                    System.out.println("登陆成功");
                }else {
                    System.out.println("登陆失败");
                }
                rs.close();
            }else{
                System.out.println("账户或密码格式输入错误");
            }
        }while (!name.matches(regex));

        st.close();//关闭传输器
        conn.close();//关闭连接
    }
}

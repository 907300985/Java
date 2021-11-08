package cn.tedu.sql;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.*;
import java.util.Scanner;

/**
 * @Date:2021/11/8 9:26
 * @Author:NANDI_GUO
 */
public class TestLogin3 {
    public static void main(String[] args) throws Exception {
        login();
    }
    public static void login() throws Exception {
        Connection c = JDBCUtils.get();

        System.out.println("请输入用户名:");
        String username = new Scanner(System.in).nextLine();
        System.out.println("请输入用户名:");
        String password = new Scanner(System.in).nextLine();

        String sql = "select * from user where name = ? and pwd = ?";
        PreparedStatement s = c.prepareStatement(sql);

        s.setObject(1,username); s.setObject(2,password);
        ResultSet r = s.executeQuery();

        if (r.next()){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }

        c.close();
        r.close();
        s.close();
    }
}

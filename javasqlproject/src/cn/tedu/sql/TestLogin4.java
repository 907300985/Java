package cn.tedu.sql;

import java.sql.*;

/**
 * @Date:2021/11/8 10:09
 * @Author:NANDI_GUO
 */


public class TestLogin4 {
    public static void main(String[] args) throws Exception {
        Connection c = JDBCUtils.get();
        insert(c);
    }

    private static void insert(Connection c) throws Exception {
        String sql = "insert into dept values(null,?,?)";
        PreparedStatement s = c.prepareStatement(sql);

        s.setObject(1,"nandi");
        s.setObject(2,"北京开发部");
        s.executeUpdate();

        s.close();
        c.close();
    }
}

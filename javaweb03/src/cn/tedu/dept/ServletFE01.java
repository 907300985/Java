package cn.tedu.dept;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @Date:2021/11/22 14:33
 * @Author:NANDI_GUO
 */
@WebServlet("/ServletFE01")
public class ServletFE01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String deptno = request.getParameter("deptno");
        String dname = request.getParameter("dname");
        String loc = request.getParameter("loc");
        System.out.println(deptno+"\n"+dname+"\n"+loc);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql:///cgb2109?characterEncoding=utf8","root","0000");
            String sql = "insert into lol values(?,?,?)";
            PreparedStatement p = con.prepareStatement(sql);

            p.setObject(1,deptno);
            p.setObject(2,dname);
            p.setObject(3,loc);
            p.executeUpdate();
            System.out.println("插入成功");

            p.close();
            con.close();
        }catch (Exception e){
            e.getMessage();
            System.out.println("插入失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

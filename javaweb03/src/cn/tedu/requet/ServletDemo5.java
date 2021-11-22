package cn.tedu.requet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date:2021/11/19 16:38
 * @Author:NANDI_GUO
 */
@WebServlet("/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解析请求参数name=jerry&pwd=123
        //获取name参数的值
        String s = request.getParameter("user");
        String p = request.getParameter("pwd");
        //String[] hobbies = request.getParameterValues("hobby");
        System.out.println(s);
        System.out.println(p);
    }
}

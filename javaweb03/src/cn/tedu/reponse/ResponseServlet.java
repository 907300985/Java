package cn.tedu.reponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Date:2021/11/22 17:21
 * @Author:NANDI_GUO
 */
@WebServlet("/ResponseServlet")
public class ResponseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setCharacterEncoding("utf-8");
        response.setContentType("Text/html;charset=utf-8");
        response.getWriter().write("Caitlyn cupcake");
        response.getWriter().write("Caitlyn cupcake");
        response.getWriter().write("Caitlyn cupcake");
        //response.getWriter().println("< br/>");
        response.getWriter().write("凯特琳小蛋糕");

    }
}

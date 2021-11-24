package cn.tedu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Date:2021/11/23 15:39
 * @Author:NANDI_GUO
 */
@WebFilter("/ASerlet")
public class Filter1 implements Filter {
    //销毁,执行一次
    public void destroy() {
        System.out.println("filter被销毁");
    }

    //类似于Servlet的service()，会被执行多次
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("过滤器开始执行");
        chain.doFilter(req, resp);//放行,接触阻塞状态
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filter被初始化完成");
    }

}

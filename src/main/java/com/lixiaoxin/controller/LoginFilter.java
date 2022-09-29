package com.lixiaoxin.controller;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebFilter(filterName = "loginFilter",urlPatterns = {"/*"},initParams = {
        @WebInitParam(name = "encoding",value = "UTF-8"),
        @WebInitParam(name = "loginPage",value = "jsp//login.jsp")
})
public class LoginFilter implements Filter{
    private FilterConfig filterConfig;

    private String encoding;

    private String loginPage;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;

        this.encoding = filterConfig.getInitParameter(encoding);
        this.loginPage = filterConfig.getInitParameter(loginPage);

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
//        //设置请求和响应的属性
//        request.setCharacterEncoding(encoding);
//        response.setCharacterEncoding(encoding);
//        response.setContentType("text/html;charset="+encoding);

        //强转类型
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
    String uri=req.getRequestURI();
        System.out.println(uri);
        if(uri.contains("login.jsp")||uri.contains("/LoginServlet")||uri.contains("main.jsp")||uri.contains("register.jsp")||uri.contains("/registerServlet")){
            chain.doFilter(request, response);
            return;
        }
        //判断会话域中是否有用户对象
        if (req.getSession().getAttribute("user")!=null) {
            chain.doFilter(request, response);
        }else {
            req.getRequestDispatcher("jsp/login.jsp").forward(request, response);
        }
    }
    @Override
    public void destroy() {

    }


}

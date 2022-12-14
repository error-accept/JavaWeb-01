package com.lixiaoxin.controller;
import com.lixiaoxin.Service.UserService;
import com.lixiaoxin.domain.TUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/userDetail")
public class allUserDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService=new UserService();
        List<TUser> getall = userService.getall();
        req.getSession().setAttribute("users",getall);
        req.getRequestDispatcher("jsp/allUser.jsp").forward(req,resp);
    }
}

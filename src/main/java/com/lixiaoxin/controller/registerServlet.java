package com.lixiaoxin.controller;

import com.lixiaoxin.Service.UserService;
import com.lixiaoxin.domain.TUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService=new UserService();
        req.setCharacterEncoding("UTF-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String sex=req.getParameter("sex");
        String hobby=req.getParameter("hobby");
        String city=req.getParameter("city");
        String des=req.getParameter("des");
        System.out.println(username+password+sex+hobby+city+des);
        TUser user=new TUser();
        user.setName(username);
        user.setPwd(password);
        user.setCity(city);
        user.setDes(des);
        user.setHobby(hobby);
        user.setSex(sex);
        if(userService.getByName(username)!=null){
            req.setAttribute("msg","该账号已经注册");
            req.getRequestDispatcher("jsp/register.jsp").forward(req,resp);
        }
        else{
            userService.register(user);
            req.setAttribute("msg","注册成功");
            req.getRequestDispatcher("jsp/register.jsp").forward(req,resp);
        }
    }
}

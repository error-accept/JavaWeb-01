package com.lixiaoxin.controller;

import com.lixiaoxin.Service.TeacherService;
import com.lixiaoxin.domain.TTeacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/allowVote")
public class allowVoteServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TeacherService teacherService=new TeacherService();
        String id = req.getParameter("Id");
        int flag=teacherService.setStatueById(Integer.valueOf(id),1);
        if(flag==1){
            List<TTeacher> teachers = teacherService.getall();
            req.getSession().setAttribute("teachers",teachers);
            req.setAttribute("msg","解除禁用成功");
//            req.getRequestDispatcher("jsp/admin.jsp").forward(req,resp);
            resp.sendRedirect("jsp/admin.jsp");
        }
        else{
//            req.getRequestDispatcher("jsp/admin.jsp").forward(req,resp);
            resp.sendRedirect("jsp/admin.jsp");
        }
    }
}

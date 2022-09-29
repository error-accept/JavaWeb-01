package com.lixiaoxin.controller;

import com.lixiaoxin.Service.TeacherService;
import com.lixiaoxin.domain.TTeacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/addTeacher")
public class addTeacherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TeacherService teacherService=new TeacherService();
        HttpSession session = req.getSession();
//        Map<String,Object> map =req.getParameterMap();
//        System.out.println(map);
        req.setCharacterEncoding("UTF-8");
        String name=req.getParameter("name");
        String sex=req.getParameter("sex");
        String des=req.getParameter("des");
        System.out.println(name+sex+des);
        TTeacher tTeacher=new TTeacher();
        tTeacher.setVote(0);
        tTeacher.setName(name);
        tTeacher.setDesc(des);
        tTeacher.setGender(sex);
        tTeacher.setStatues(1);
        int flag=teacherService.addTeacher(tTeacher);
        if(flag==1){
            List<TTeacher> teachers = teacherService.getall();
            session.setAttribute("teachers",teachers);
            req.getRequestDispatcher("jsp/success.jsp").forward(req,resp);
        }
        else {
            System.out.println("error");
        }

    }
}

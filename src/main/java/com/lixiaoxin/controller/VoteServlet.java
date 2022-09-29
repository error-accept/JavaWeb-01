package com.lixiaoxin.controller;
import com.lixiaoxin.Service.TeacherService;
import com.lixiaoxin.Service.VoteService;
import com.lixiaoxin.domain.TTeacher;
import com.lixiaoxin.domain.TUser;
import com.lixiaoxin.domain.TVote;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;
@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        TeacherService teacherService = new TeacherService();
        VoteService voteService=new VoteService();
        TUser user= (TUser) session.getAttribute("user");
        List<TTeacher> teachers = (List<TTeacher>) session.getAttribute("teachers");
        String id = req.getParameter("Id");
        String uid = req.getParameter("uId");
//        System.out.println(id+uid);
        if(voteService.canVote(user.getId(),new Date())){
            for (TTeacher t:teachers) {
                if (Integer.toString(t.getId()).equals(id)){
                    if(t.getStatues()==1){
                        int i = teacherService.addVoteById(t.getId());
                        System.out.println(i);
                        t.setVote(t.getVote()+1);
                        voteService.insertVote(new TVote(id,uid,new Date()));
                        req.getRequestDispatcher("/jsp/voteSuccess.jsp").forward(req,resp);
                    }
                    else {
                        req.getRequestDispatcher("/jsp/noAllowError.jsp").forward(req,resp);
                    }
                }
            }
        }
        else {
            req.getRequestDispatcher("/jsp/timeError.jsp").forward(req,resp);
        }
    }
}

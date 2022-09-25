package generator.controller;

import generator.Service.TeacherService;
import generator.domain.TTeacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/banVote")
public class banVoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TeacherService teacherService=new TeacherService();
        String id = req.getParameter("Id");
        int flag=teacherService.setStatueById(Integer.valueOf(id), 0);
        if(flag==1){
            List<TTeacher> teachers = teacherService.getall();
            req.getSession().setAttribute("teachers",teachers);
            req.setAttribute("msg","禁用成功");
            resp.sendRedirect("jsp/admin.jsp");
        }
        else{
            resp.sendRedirect("jsp/admin.jsp");
        }
    }
}

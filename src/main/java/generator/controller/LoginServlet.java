package generator.controller;

import generator.Service.TeacherService;
import generator.Service.UserService;
import generator.domain.TTeacher;
import generator.domain.TUser;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = new UserService();
        TeacherService teacherService=new TeacherService();
        HttpSession session=req.getSession();
        String passward=req.getParameter("passward");
       String username=req.getParameter("username");
        TUser user = userService.getByName(username);
        if(username.equals("")||username==null||passward.equals("")||passward==null){
            System.out.println("is null");
           req.setAttribute("msg","用户名或密码不能为空");
           req.getRequestDispatcher("/jsp/login.jsp").forward(req,resp);
       } else if (username.equals(user.getName())&&passward.equals(user.getPwd())) {
            System.out.println("right");
            session.setAttribute("username",username);
            session.setAttribute("user", user) ;
            List<TTeacher> teachers = teacherService.getall();
            session.setAttribute("teachers",teachers);
//            if(username.equals("root")){
//                resp.sendRedirect("jsp/admin.jsp");
//                return;
//            }
            resp.sendRedirect("jsp/main.jsp");
//            req.getRequestDispatcher("/jsp/main.jsp").forward(req,resp);
       }
        else {
            System.out.println("is error");
            req.setAttribute("msg","用户名或密码错误");
            req.getRequestDispatcher("/jsp/login.jsp").forward(req,resp);
        }
    }
}


package com.lixiaoxin.controller;

import com.lixiaoxin.Service.VoteService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/voteDetail")
public class voteDetialServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        VoteService voteService=new VoteService();
        req.getSession().setAttribute("votes",voteService.getall());
        req.getRequestDispatcher("jsp/voteDetail.jsp").forward(req,resp);
    }
}

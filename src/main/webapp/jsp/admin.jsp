<%--
  Created by IntelliJ IDEA.
  User: lixiaoxin
  Date: 2022/9/25
  Time: 0:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员后台界面</title>
</head>
<body>
<%@ page import="generator.domain.TUser" %>
<%@ page import="generator.domain.TTeacher" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: lixiaoxin
  Date: 2022/9/24
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ include file="checkLog.jsp"%>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@page isELIgnored="false" %>
<%
    TUser user = (TUser) session.getAttribute("user") ;
    System.out.println(user);

    if (user == null) {
%>
<h1>未登录！！</h1>
<h3>3秒后跳转到登录界面</h3>
<%
        response.setHeader("refresh","3;URL=login.jsp");
        return ;
    }
%>
<html>
<head>
    <title>投票系统主界面</title>


</head>
<body>
<h1>欢迎来到投票系统</h1>
<%--<% String username= (String) request.getAttribute("username"); %>--%>
<h2>你好 ${username}</h2>
<span><a  href="/JavaWeb-01/logout">退出</a></span>
<a href="http://baidu.com">百度</a>
<html>
<head>
    <title>客户管理</title>
</head>
<body>
<table>
    <tr>
        <th>name</th>
        <th>des</th>
        <th>vote</th>
        <th>Statue</th>
        <th>投票</th>
        <th>禁用投票</th>
        <th>允许投票</th>
    </tr>
    <%
        List<TTeacher>  teachers = (List<TTeacher>) session.getAttribute("teachers");
        System.out.println(teachers);
        for (TTeacher t:teachers) { %>

    <tr>
        <th><p><%=t.getName()%></p></th>
        <th> <p><%=t.getDesc()%></p></th>
        <th> <p><%=t.getVote()%></p></th>
        <th><p><%=t.getStatues()%></p></th>
        <th><a href="/JavaWeb-01/VoteServlet?Id=<%=t.getId()%>&uId=<%=user.getId()%>"+>投票</a></th>
        <th><a href="/JavaWeb-01/banVote?Id=<%=t.getId()%>">禁用投票</a></th>
        <th><a href="/JavaWeb-01/allowVote?Id=<%=t.getId()%>">允许投票</a></th>
    </tr>
    <%}%>
</table>
<a href="addTeacher.jsp">添加候选人</a>
<a href="/JavaWeb-01/userDetail">查看所有用户</a>
<a href="/JavaWeb-01/voteDetail">查看投票纪录</a>


</body>
</html>


</body>
</html>


</body>
</html>

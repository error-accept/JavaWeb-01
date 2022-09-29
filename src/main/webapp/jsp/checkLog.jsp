<%@ page import="com.lixiaoxin.domain.TUser" %><%--
  Created by IntelliJ IDEA.
  User: lixiaoxin
  Date: 2022/9/24
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录验证</title>
</head>
<body>

<%
    TUser user = (TUser) session.getAttribute("user") ;
    System.out.println(user);
    if(session.getAttribute("username").equals("root")){
        response.sendRedirect("admin.jsp");
    }
    if (user == null) {
%>
<h1>未登录！！</h1>
<h3>3秒后跳转到登录界面</h3>
<%
        response.setHeader("refresh","3;URL=login.jsp");
        return ;
    }
%>

</body>
</html>

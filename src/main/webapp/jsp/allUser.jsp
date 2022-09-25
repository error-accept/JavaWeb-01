<%@ page import="generator.domain.TTeacher" %>
<%@ page import="java.util.List" %>
<%@ page import="generator.domain.TUser" %><%--
  Created by IntelliJ IDEA.
  User: lixiaoxin
  Date: 2022/9/25
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户详情</title>
</head>
<body>
<div>点击<a href="jsp/main.jsp">这里</a>返回</div>
<table>
    <tr>
        <th>Id</th>
        <th>name</th>
        <th>password</th>
    </tr>
        <%
        List<TUser>  teachers = (List<TUser>) session.getAttribute("users");
        System.out.println(teachers);
        for (TUser t:teachers) { %>

    <tr>
        <th><p><%=t.getId()%></p></th>
        <th><p><%=t.getName()%></p></th>
        <th> <p><%=t.getPwd()%></p></th>

    </tr>
        <%}%>

</body>
</html>

<%--

  User: PING
  Date: 2022/9/7
  Time: 9:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%--   <%@ page import="com.javaweb.entity.User" %>--%>
<%--<%@ page import="java.util.concurrent.ConcurrentHashMap" %>--%>
<%--<%@ page import="com.javaweb.entity.Teacher" %>--%>
<%--<%@ page import="java.util.List" %>--%>
<%--<%@ page import="java.util.Map" %>--%>
<%--<%@ page import="com.javaweb.entity.Comment" %>--%>

<html>
<meta charset="UTF-8">
<head>
    <title></title>
</head>
<body>
    <%
        session.removeAttribute("user") ;
        session.removeAttribute("voted") ;
        session.invalidate();
        response.sendRedirect("login.jsp");
    %>

</body>
</html>

<%@ page import="com.lixiaoxin.domain.TUser" %><%--
  Created by IntelliJ IDEA.
  User: lixiaoxin
  Date: 2022/9/25
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>添加成功</h1>
<h3>3秒后跳转到主界面</h3>
<%
        response.setHeader("refresh","3;URL=jsp/main.jsp");
%>

</body>
</html>

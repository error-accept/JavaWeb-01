<%--
  Created by IntelliJ IDEA.
  User: lixiaoxin
  Date: 2022/9/24
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <form action="/JavaWeb-01/LoginServlet" method="post">
        用户名：<input type="txet" name="username"><br>
        密  码：<input type="password" name="passward"><br>
        <input type="submit"  value="登录"><span>${msg}</span>
    </form>
</head>
<body>

</body>
</html>

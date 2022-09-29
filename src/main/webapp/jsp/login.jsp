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
<script src="../js/base.js"></script>
<html>
<head>
    <style>
        body{
            align-content: center;
            align-items: center;
            text-align: center;

        }
        form{
            width: 400px;
            height: 420px;
            background-color: rgba(255,255,255,0.5);
            margin: auto;
            margin-top: 150px;
            border-radius: 5px;
            overflow: hidden;//.title设置margin-top无效，给父元素设置overflow:hidden;
            border: black;
        }
    </style>
</head>
<body>
<form action="/JavaWeb-01/LoginServlet" method="post">
    用户名：<input type="txet" name="username"><br>
    密 &nbsp; 码：<input type="password" name="passward"><br>
    <input type="submit"  value="登录"><span>${msg}</span>
</form>
<h3>没有账号？去<a href="register.jsp">注册</a>-----></h3>
</body>
</html>

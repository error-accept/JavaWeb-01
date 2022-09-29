<%--
  Created by IntelliJ IDEA.
  User: lixiaoxin
  Date: 2022/9/27
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title  >注册</title>
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
            overflow: hidden;
            border: black;
            text-align: left;
        }
    </style>
</head>
<body>
    <h2 align="center">用户注册</h2>
<form method="post" action="/JavaWeb-01/registerServlet">
    <div >用户名：<input required="required" type="text" name="username"> </div>
    <div >密&nbsp;&nbsp; 码：<input required="required" type="password" name="password"> </div>
    <div> 性别：男 <input type="radio" name="sex" value="男"> 女<input type="radio" name="sex" value="女"> </div>
    <div>城市：<select name="city">
        <option value="福州">福州</option>
        <option value="泉州">泉州</option>
    </select></div>
    <div>爱好：游泳<input type="checkbox" name="hobby" value="游泳">运动<input type="checkbox" name="hobby" value="运动">
    看书<input type="checkbox" name="hobby" value="看书">画画<input type="checkbox" name="hobby" value="画画"></div>
    <div>描述：<textarea name="des"></textarea></div>
<input type="submit"><span>${msg}</span>
</form>
    <h3>已有账号？去<a href="jsp/login.jsp">登录</a>-----></h3>
</body>
</html>

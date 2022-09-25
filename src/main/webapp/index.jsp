<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>后台管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>

<body>
<form action="http://localhost:8080/javaweb_war_exploded/LoginServlet" method="post">
    <div class="logo_box"><img class="logo_img" src="${request.pageContext.contextPath}./images/th.png"></div>
    <div class="login_box">
        <h1 class="title">欢迎登录</h1>
        <input required="required" class="input_box" type="text" placeholder="用户名" name="username">
        <input required="required" class="input_box" type="password" placeholder="密码" name="password">
        <input required="required" class="button_box" type="submit" value="登录">
        <input required="required" class="button_box" type="button" value="注册" onclick="window.location.href='register.jsp'">
    </div>
</form>
</body>
</html>
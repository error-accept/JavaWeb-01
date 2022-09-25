<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>后台管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/register.css">
</head>

<body style="background-image: url(${request.pageContext.contextPath}./images/R-C.png)">
<form action="http://localhost:8080/" method="post">
    <div class="logo_box"><img class="logo_img" src="${request.pageContext.contextPath}./images/th.png"></div>
    <div class="login_box">
        <h1 class="title">注册</h1>
        用户名 <input required="required" class="input_box" type="text" placeholder="用户名" name="username"><br>
       密码   <input required="required" class="input_box" type="password" placeholder="密码" name="password">
       性别 <input required="required"  type="radio"  name="sex" value="man"> 男
            <input required="required"  type="radio"  name="sex" value="woman"> 女<br>
       爱好  <input required="required"  type="checkbox" value="2" name="hobit">111
            <input required="required"  type="checkbox" value="1" name="hobit">222<input required="required"  type="checkbox" placeholder="兴趣" name="hobit">
            <input required="required"  type="checkbox" value="3" name="hobit">333<br>
        自我介绍<textarea    name="selfIntroduce"> </textarea><br>
        <input  class="button_box" type="submit" value="注册">
    </div>
</form>
</body>
</html>
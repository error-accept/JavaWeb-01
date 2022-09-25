<%--
  Created by IntelliJ IDEA.
  User: lixiaoxin
  Date: 2022/9/25
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加候选人</title>
</head>
<body>
<form action="/JavaWeb-01/addTeacher" method="post">
    <div>姓名：<input type="text" name="name"></div>
   <div> 性别：男 <input type="radio" name="sex" value="男"> 女<input type="radio" name="sex" value="女"> </div>
    <div>描述：<textarea name="des"></textarea></div>
<div><button>提交</button></div>
</form>

</body>
</html>

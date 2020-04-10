<%--
  Created by IntelliJ IDEA.
  User: 窝火赶鹅
  Date: 2020/4/10
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<h1>请先登录：</h1>
<form action="/log/login" method="post">
    姓名：<input type="text" name="username"> <br><br>
    密码：<input type="text" name="password"> <br><br>
    <input type="submit" value="登陆">
</form>
</body>
</html>

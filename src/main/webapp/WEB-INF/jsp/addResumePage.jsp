<%--
  Created by IntelliJ IDEA.
  User: 窝火赶鹅
  Date: 2020/4/10
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>--%>
<html>
<head>
    <title>简历列表</title>
</head>
<body>

<h1>添加简历</h1>
<form method="post" action="${pageContext.request.contextPath}/resume/save">
    <table >
        <tr>
            <td>姓名 : </td>
            <td><input name="name"  /></td>
        </tr>
        <tr>
            <td>地址 :</td>
            <td><input name="address" /></td>
        </tr>
        <tr>
            <td>电话 :</td>
            <td><input name="phone" /></td>
        </tr>
        <tr>
            <td> </td>
            <td><input type="submit" value="保存" /></td>
        </tr>
    </table>
</form>
</body>
</html>

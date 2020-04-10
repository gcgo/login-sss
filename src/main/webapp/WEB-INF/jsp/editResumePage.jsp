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
    <title>修改简历</title>
</head>
<body>

<h1>修改简历</h1>
<form method="post" action="${pageContext.request.contextPath}/resume/editsave">
    <table >
        <tr>
            <td><input type="hidden" name="id"  value="${one.id}"/></td>
        </tr>
        <tr>
            <td>姓名 : </td>
            <td><input name="name"  value="${one.name}"/></td>
        </tr>
        <tr>
            <td>地址 :</td>
            <td><input name="address" value="${one.address}" /></td>
        </tr>
        <tr>
            <td>电话 :</td>
            <td><input name="phone" value="${one.phone}"/></td>
        </tr>
        <tr>
            <td> </td>
            <td><input type="submit" value="保存修改" /></td>
        </tr>
    </table>
</form>
</body>
</html>

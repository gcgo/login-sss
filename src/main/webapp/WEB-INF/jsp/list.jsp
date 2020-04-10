<%--
  Created by IntelliJ IDEA.
  User: 窝火赶鹅
  Date: 2020/4/10
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>--%>
<html>
<head>
    <title>简历列表</title>
</head>
<body>

<h1>简历列表</h1>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>姓名</th>
        <th>地址</th>
        <th>电话</th>
        <th>编辑</th>
        <th>删除</th>
    </tr>
    <c:forEach var="resume" items="${resumeList}">
        <tr>
            <td>${resume.id}</td>
            <td>${resume.name}</td>
            <td>${resume.address}</td>
            <td>${resume.phone}</td>
            <td><a href="editemp/${resume.id}">编辑</a></td>
            <td><a href="deleteemp/${resume.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="addResumePage">添加简历</a>
</body>
</html>

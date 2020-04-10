<%--
  Created by IntelliJ IDEA.
  User: 窝火赶鹅
  Date: 2020/4/10
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>--%>
<html>
<head>
    <title>简历列表</title>
</head>
<body>

<h1>简历列表</h1>
当前用户：<span>${sessionScope.USER_LOGIN }&nbsp;&nbsp;&nbsp;&nbsp;
</span><a href="${pageContext.request.contextPath}/log/logout">登出</a>
<br>
<HR width="10%" align="left">
<div align="right" style="width: 50%">
    <a href="addResumePage"><span style="font-size: larger; color: blue; ">添加简历</span></a>
</div>

<table border="2" width="50%" cellpadding="2">
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
            <td><a href="editResume/${resume.id}">编辑</a></td>
            <td><a href="deleteResume/${resume.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<br/>

</body>
</html>

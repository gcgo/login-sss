<%--
  Created by IntelliJ IDEA.
  User: 窝火赶鹅
  Date: 2020/4/10
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>简历列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/resume/query" method="post">
    查询条件：
    <table width="100%" border=1>
        <tr>
            <td align="right"><input type="submit" value="新增"/></td>
        </tr>
    </table>
    商品列表：
    <table width="100%" border=1>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>地址</td>
            <td>电话</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${resumeList}" var="resume">
            <tr>
                <td>${resume.id }</td>
                <td>${resume.name }</td>
                <td>${resume.address }</td>
                <td>${resume.phone }</td>

                <td>
                    <a href="${pageContext.request.contextPath }/resume/update/${resume.id}">编辑</a>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath }/resume/delete/${resume.id}">删除</a>
                </td>

            </tr>
        </c:forEach>

    </table>
</form>
</body>
</html>

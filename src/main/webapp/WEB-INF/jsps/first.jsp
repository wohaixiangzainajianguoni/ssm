<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2020/5/15
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/first.js">

</script>

<html>
<head>
    <title>Title</title>
</head>
<body>



<a  href="${pageContext.request.contextPath}/student/updateStudent">修改</a>



<table  border="1px" style="border-collapse: collapse">
    <tr>
    <td>id</td>
    <td>姓名</td>
    <td>照片</td>
    <td>年级</td>
    <td>操作</td>
    </tr>
    <c:forEach var="student" items="${allStudent}">
        <tr>
            <td>${student.id}</td>
            <td>${student.stuName}</td>
            <td><img src="${pageContext.request.contextPath}${student.picture}"/></td>
            <td>${student.grade.gradeName}</td>
            <td><a  href="${pageContext.request.contextPath}/student/updateStudent?id=${student.id}">修改</a></td>
        </tr>


    </c:forEach>
</table>


</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2020/5/17
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form method="post" action="${pageContext.request.contextPath}/student/saveStudent" enctype="multipart/form-data">

    <input type="text" value="${student.id}" style="display: none" name="id">
    学生姓名 <input type="text" name="stuName" value="${student.stuName}">

    <br/>
    年级
    <select name="gradeId">




    <c:forEach items="${allgrade}" var="grade"   >

        <option value="${grade.id}"  ${grade.id == student.gradeId?'selected':''}>${grade.gradeName}</option>

    </c:forEach>
    </select>

    <br>
    照片<input type="file" name="image">
    <br/>
    <input type="submit" value="添加">




</form>

</body>
</html>

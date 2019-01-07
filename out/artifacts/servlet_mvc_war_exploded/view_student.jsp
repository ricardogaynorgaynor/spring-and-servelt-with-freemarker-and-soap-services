<%--
  Created by IntelliJ IDEA.
  User: Ricardo
  Date: 2018-12-20
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Student data</h1>

<table border="1">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email Address</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.fname}</td>
            <td>${student.lname}</td>
            <td>${student.email}</td>
        </tr>
    </c:forEach>


</table>

</body>
</html>

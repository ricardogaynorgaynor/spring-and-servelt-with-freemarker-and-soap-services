<%--
  Created by IntelliJ IDEA.
  User: Ricardo
  Date: 2018-12-20
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>country</h1>
<ol>
    <c:forEach var="country" items="${countries}">
        <li>${country}</li>
    </c:forEach>
</ol>
</body>
</html>

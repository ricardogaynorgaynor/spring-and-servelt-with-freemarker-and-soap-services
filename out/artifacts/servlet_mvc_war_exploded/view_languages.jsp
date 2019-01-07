<%--
  Created by IntelliJ IDEA.
  User: Ricardo
  Date: 2018-12-20
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ol>

    <c:forEach var="language" items="${language_list}">
        <li>${language}</li>
    </c:forEach>
</ol>


</body>
</html>

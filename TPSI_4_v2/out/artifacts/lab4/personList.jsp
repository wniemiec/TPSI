<%--
  Created by IntelliJ IDEA.
  User: Wiktoria
  Date: 31.03.2020
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<table border="5">
    <tr><th>Imie</th><th>Nazwisko</th><th>Email</th></tr>
<c:forEach items="${osoby}" var="klucz">
    <p>
        <tr><td>${klucz.firstName}</td> <td>${klucz.lastName}</td> <td>${klucz.emailAddress}</td></tr>
    </p>
</c:forEach>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Wiktoria
  Date: 30.03.2020
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Java Web - laboratorium 4</title>
</head>
<body>
<h1>Cześć, <c:out value="${obiekt.firstName} ${obiekt.lastName}"/>!</h1></br>
<!-- Róznica jest taka, ze c:out nie interpretuje jezyka html, a druga forma interpretuje  -->
<h1>Cześć, ${obiekt.firstName} ${obiekt.lastName}!</h1>

<hi><a href="mailto:${obiekt.emailAddress}">${obiekt.emailAddress}</a></hi>
</body>
</html>

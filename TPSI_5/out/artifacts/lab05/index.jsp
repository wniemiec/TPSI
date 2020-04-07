<%--
  Created by IntelliJ IDEA.
  User: Wiktoria
  Date: 06.04.2020
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@page session="true" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Java Web - laboratorium 5</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<h3><p><a href="/lab05/serv">Kliknij</a></p></h3>

<h3>Licznik: ${sessionScope.licz}</h3>

<table border="5">
  <tr><th>Imie</th><th>Nazwisko</th><th>Email</th><th>ID grupy</th></tr>
  <c:forEach items="${sessionScope.studenci}" var="klucz">
    <p>
      <tr><td>${klucz.firstName}</td> <td>${klucz.lastName}</td> <td>${klucz.emailAddress}</td> <td>${klucz.groupId}</td></tr>
    </p>
  </c:forEach>
</table>

</br></br>

  <form action='/lab05/serv' method='post'>
    Podaj imie:
    <input type='text' name='imie'>
    Podaj nazwisko:
    <input type='text' name='nazwisko'>
    Podaj email:
    <input type='text' name='email'>
    Podaj ID grupy:
    <input type="text" name="id_grupy">
    <input type='submit'>
  </form>


</body>
</html>
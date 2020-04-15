<%--
  Created by IntelliJ IDEA.
  User: Wiktoria
  Date: 30.03.2020
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Java Web - laboratorium 4</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<h1>Witamy</h1>
<form action='/lab4/hello' method='post'>
  Podaj imie:
  <input type='text' name='imie'>
  Podaj nazwisko:
  <input type='text' name='nazwisko'>
  Podaj email:
  <input type='text' name='email'>
  <input type='submit'>
</form>
<p><a href="/lab4/personList">PersonListServlet</a></p>

<p><a href="/lab4/lab05">Lab05</a></p>
</body>
</html>

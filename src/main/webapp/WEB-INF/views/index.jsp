<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/style.css" rel="stylesheet"/>
</head>
<body>
<h1>${title}</h1>
<form method="post" action="/todo">
    <label>
        Title: <input name="title">
    </label>
    <br>
    <label>
        Deadline: <input name="deadline" type="date">
    </label>
    <button type="submit">Add</button>
</form>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>Task</th>
        <th>Deadline</th>
        <th>Details</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${tasks}" var="task" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${task.title}</td>
            <td>${task.deadline}</td>
            <td><a href="/todo/${task.id}">Info</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<footer>
    <p>Current time: <fmt:formatDate pattern="dd/MM/yyyy HH:mm:ss" value="${time}"/></p>
</footer>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/resources/css/style.css" rel="stylesheet"/>
</head>
<body>
<h1>${title}</h1>
<form method="post" action="/todo">
    <label>
        Task: <input name="task">
    </label>
    <button type="submit">Add</button>
</form>
<table>
    <thead>
    <tr>
        <th>#</th>
        <th>Task</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${tasks}" var="task" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${task}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<footer>
    <p>Current time: ${time}</p>
</footer>
</body>
</html>

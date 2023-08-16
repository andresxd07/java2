<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Task List</title>
</head>
<body>
    <h1>Task List</h1>
    <ul>
        <c:forEach items="${tasks}" var="task">
            <li>${task.description}</li>
        </c:forEach>
    </ul>
</body>
</html>

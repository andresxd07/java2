<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Task</title>
</head>
<body>
    <h1>Add Task</h1>
    <form action="${pageContext.request.contextPath}/tasks" method="post">
        <label for="description">Task Description:</label>
        <input type="text" id="description" name="description" required>
        <button type="submit">Add Task</button>
    </form>
    <p><a href="${pageContext.request.contextPath}/tasks">Back to Task List</a></p>
</body>
</html>

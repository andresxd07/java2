package com.tumodulo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class TaskServlet extends HttpServlet {
    private TaskDAO taskDAO = new TaskDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Task> tasks = taskDAO.getAllTasks();
        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("/WEB-INF/taskList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String taskDescription = request.getParameter("description");
        if (taskDescription != null && !taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            taskDAO.addTask(newTask);
        }
        response.sendRedirect(request.getContextPath() + "/tasks");
    }
}


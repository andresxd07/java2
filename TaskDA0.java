package com.tumodulo;

import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
}

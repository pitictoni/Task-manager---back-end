package com.example.taskmanagerbackend;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServices {
    private TaskRepository taskRepository;

    public TaskServices(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addMockTasks(){
        List<Task> taskList = new ArrayList<Task>();

        taskList.add(new Task(1,"Learn GIT",2));
        taskList.add(new Task(2,"Create HTML page",18));
        taskList.add(new Task(3,"Learn CSS",8));
        taskList.add(new Task(4,"Start Spring Boot project",1));

        taskRepository.saveAll(taskList);
    }
}

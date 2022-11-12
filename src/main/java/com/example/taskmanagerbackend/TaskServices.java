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

    public ArrayList<Task> addMockTasks(){
        List<Task> taskList = new ArrayList<Task>();

        taskList.add(new Task("Learn GIT",2));
        taskList.add(new Task("Create HTML page",18));
        taskList.add(new Task("Learn CSS",8));
        taskList.add(new Task("Start Spring Boot project",1));

        return (ArrayList<Task>) taskRepository.saveAll(taskList);
    }
}

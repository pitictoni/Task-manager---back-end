package com.example.taskmanagerbackend;

import com.example.taskmanagerbackend.Task;
import com.example.taskmanagerbackend.TaskServices;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RequestMapping("/task")
public class TaskController
{
    private TaskServices taskServices;

    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }

    // www.mySite.orq/task/addMockTasks

    @PostMapping("/addMockTasks")
    public ArrayList<Task> addMockTasks(){
        return taskServices.addMockTasks();
    }

}

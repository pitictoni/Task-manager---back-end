package com.example.taskmanagerbackend;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private int priority;

    public Task() {
    }

    public Task(int id, String title, int priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
    }

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task getallTaskbyId(Long id){
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found with this id" + id) );
    }
}

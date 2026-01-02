package org.example.workschedule.controller;

import org.example.workschedule.entity.Task;
import org.example.workschedule.repository.TaskRepository;
import org.example.workschedule.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public  TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    //=================================================
    //       endpoint for data entry
    //=================================================

    @PostMapping
    public Task save(@RequestBody Task task) {
        return taskService.save(task);
    }

    //=================================================
    //       endpoint for show data
    //=================================================

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.findAll();
    }

    //=================================================
    //       endpoint for show data by id
    //=================================================

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //=================================================
    //       endpoint for update data
    //=================================================

    @PutMapping
    public Task updateTask(@RequestBody Task task) {
        return taskService.save(task);
    }

    //=================================================
    //       endpoint for Delete data
    //=================================================

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }



}

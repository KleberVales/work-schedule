package org.example.workschedule.service;

import org.example.workschedule.entity.Task;
import org.example.workschedule.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


//=====================================================================================
//                       Creating data in the database
//=====================================================================================

    public Task save(Task task) {
        return  taskRepository.save(task);
    }

//=====================================================================================
//                      Reading data from the database
//=====================================================================================

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

//===================================================================================
//                      Reading specific data
//===================================================================================

    public Optional<Task> findById(int id) {
        return taskRepository.findById(id);
    }

//===================================================================================
//                      Update database data
//===================================================================================

    public void updateTask(Task task) {
        taskRepository.save(task);
    }

//===================================================================================
//                      Delete database data
//===================================================================================

    public void deleteById(int id) {
        taskRepository.deleteById(id);
    }



}

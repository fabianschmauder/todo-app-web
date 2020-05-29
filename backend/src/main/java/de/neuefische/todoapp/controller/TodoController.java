package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.Status;
import de.neuefische.todoapp.model.Task;
import de.neuefische.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @Autowired


    @GetMapping("todo")
    public ArrayList<Task> getAllTodo(){
        return todoService.getTasks();
    }

}

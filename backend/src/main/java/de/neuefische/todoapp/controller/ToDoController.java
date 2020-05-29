package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/todo")
public class ToDoController {

private final ToDoService toDoService;

@Autowired
    public ToDoController(ToDoService toDoService) {
    this.toDoService = toDoService;
}

}

package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.Description;
import de.neuefische.todoapp.model.ToDoMessage;
import de.neuefische.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("api/todo")

public class ToDoController {

    private final ToDoService toDoService;

    @Autowired
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public List<ToDoMessage> getMessages() {
        return toDoService.getAllMessages();

    }

    @PutMapping
    public ToDoMessage addMessage(@RequestBody Description description) {
        return toDoService.addAMessage(description);
    }


}







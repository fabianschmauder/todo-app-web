package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.ToDo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ToDoController {

    @GetMapping("todo")
    public List<ToDo> getAllToDo(){

        return toDoService.getallToDo();
    }

}

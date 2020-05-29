package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.ToDo;
import de.neuefische.todoapp.model.ToDoStatus;
import de.neuefische.todoapp.model.UpdateToDoStatus;
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
    public List<ToDo> getToDos() {
        return toDoService.getToDos();
    }

    @PutMapping
    public ToDo addToDo(@RequestBody ToDo newToDo) {
        return toDoService.addToDo(newToDo);
    }

    @PostMapping("{id}/status")
    public ToDo updateStatus(@PathVariable String id, @RequestBody UpdateToDoStatus updateToDoStatus) {
        return toDoService.updateStatus(id, updateToDoStatus.getToDoStatus());
    }

    @DeleteMapping("{id}")
    public void deleteToDo(@PathVariable String id) {
        toDoService.deleteToDo(id);
    }

}

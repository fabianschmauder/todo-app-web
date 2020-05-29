package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.enums.StatusEnum;
import de.neuefische.todoapp.model.ToDoMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/todo")

public class ToDoController {

    private ToDoMessage aMessage;

    @GetMapping
    public List<ToDoMessage> getToDoMessages() {

        List<ToDoMessage> listOfToDos = new ArrayList<>();
        listOfToDos.add(new ToDoMessage("1", "Message001", StatusEnum.OPEN));
        listOfToDos.add(new ToDoMessage("2", "Message002", StatusEnum.IN_PROGRESS));
        listOfToDos.add(new ToDoMessage("3", "Message003", StatusEnum.DONE));

        return listOfToDos;


    }
}







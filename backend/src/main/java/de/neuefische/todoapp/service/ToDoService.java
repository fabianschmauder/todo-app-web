package de.neuefische.todoapp.service;

import de.neuefische.todoapp.DB.ToDoDB;
import de.neuefische.todoapp.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoDB toDoDB;

    @Autowired
    public ToDoService(ToDoDB toDoDB) {
        this.toDoDB = toDoDB;
    }


    public List<ToDo> getAllToDos() {
        return toDoDB.getAllToDos();
    }

    public void addToDo(ToDo newToDo) {
        toDoDB.addToDo(newToDo);
    }
}

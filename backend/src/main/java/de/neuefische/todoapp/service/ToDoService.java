package de.neuefische.todoapp.service;

import de.neuefische.todoapp.database.ToDoDb;
import de.neuefische.todoapp.model.ToDo;
import de.neuefische.todoapp.model.ToDoStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoDb toDoDb;

    @Autowired
    public ToDoService(ToDoDb toDoDb) {
        this.toDoDb = toDoDb;
    }

    public List<ToDo> getToDos() {
        return toDoDb.getToDos();
    }

    public ToDo addToDo(ToDo newToDo) {
        return toDoDb.addToDo(newToDo);
    }

    public ToDo updateStatus(String id, ToDoStatus newStatus) {
        return toDoDb.updateStatus(id, newStatus);
    }

}

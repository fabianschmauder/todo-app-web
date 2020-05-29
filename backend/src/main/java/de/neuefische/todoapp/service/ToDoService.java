package de.neuefische.todoapp.service;

import de.neuefische.todoapp.database.ToDoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    private final ToDoDb toDoDb;

    @Autowired
    public ToDoService(ToDoDb toDoDb) {
        this.toDoDb = toDoDb;
    }

}

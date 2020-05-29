package de.neuefische.todoapp.database;

import de.neuefische.todoapp.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoDb {

    private final List<ToDo> toDos = new ArrayList<>();

    public List<ToDo> getToDos() {
        return toDos;
    }

}

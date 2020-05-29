package de.neuefische.todoapp.database;

import de.neuefische.todoapp.model.ToDo;
import de.neuefische.todoapp.model.ToDoStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ToDoDb {

    private final List<ToDo> toDos = new ArrayList<>(List.of(
            new ToDo("1", "FirstToDo", ToDoStatus.OPEN),
            new ToDo("2", "SecondToDo", ToDoStatus.DONE)
    ));

    public List<ToDo> getToDos() {
        return toDos;
    }

    public ToDo addToDo(ToDo newToDo) {
        String uuid = UUID.randomUUID().toString();
        newToDo.setId(uuid);
        newToDo.setStatus(ToDoStatus.OPEN);
        toDos.add(newToDo);
        return newToDo;
    }

}

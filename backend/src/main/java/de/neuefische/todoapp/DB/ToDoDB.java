package de.neuefische.todoapp.DB;

import de.neuefische.todoapp.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;

import static de.neuefische.todoapp.Enums.status.*;

@Service
public class ToDoDB {

    private List<ToDo> todos = List.of(
            new ToDo("1", "Kaufe ein Steak", OPEN),
            new ToDo("2", "esse das Steak", IN_PROGRESS),
            new ToDo("3", "verdaue das Steak", DONE));

    public List<ToDo> getAllToDos(){
        return todos;
    }

    public void addToDo(ToDo newToDo) {
        this.todos.add(newToDo);
    }

//    public void clearDb(){
//        todos.clear();
//    }
}

package de.neuefische.todoapp.database;

import de.neuefische.todoapp.model.ToDo;
import de.neuefische.todoapp.model.ToDoStatus;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    /*public Optional<ToDo> getToDoById(String id) {
        for (ToDo toDo : toDos) {
            if (toDo.getId().equals(id)) {
                return Optional.of(toDo);
            }
        }
        return Optional.empty();
    }*/

    public ToDo getToDoById(String id) {
        for (ToDo toDo : toDos) {
            if (toDo.getId().equals(id)) {
                return toDo;
            }
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo with id "+id+" not found");
    }

    public void deleteToDo(String id) {
        toDos.remove(getToDoById(id));
    }

    public ToDo updateStatus(String id, ToDoStatus newStatus) {
        for (ToDo toDo : toDos) {
            if (toDo.getId().equals(id)) {
                toDo.setStatus(newStatus);
                return toDo;
            }
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Status cannot be updated");
    }


}

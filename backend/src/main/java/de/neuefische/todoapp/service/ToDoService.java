package de.neuefische.todoapp.service;

import de.neuefische.todoapp.db.ToDoNoteDB;
import de.neuefische.todoapp.enums.Status;
import de.neuefische.todoapp.data.Description;
import de.neuefische.todoapp.models.ToDoNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
public class ToDoService {

    private final ToDoNoteDB toDoNotes;

    @Autowired
    public ToDoService(ToDoNoteDB toDoNotes) {
        this.toDoNotes = toDoNotes;
    }

    public List<ToDoNote> getAllNotes(){
        return toDoNotes.getAllNotes();
    }


    public List<ToDoNote> deleteNotes (String id){
        for (ToDoNote note : toDoNotes.getAllNotes()) {
            if (note.getId().equals(id)) {
                toDoNotes.removeNoteFromDatabase(note);
                return toDoNotes.getAllNotes();
            }
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order does not exist");

    }

    public ToDoNote addANote(Description description){
        String uuid = UUID.randomUUID().toString();
        String message = description.getDescription();
        ToDoNote newNote = new ToDoNote(uuid, message, Status.OPEN);
        return toDoNotes.addNoteToDb(newNote);
    }

}

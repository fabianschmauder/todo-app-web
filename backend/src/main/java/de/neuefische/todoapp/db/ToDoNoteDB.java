package de.neuefische.todoapp.db;

import de.neuefische.todoapp.enums.Status;
import de.neuefische.todoapp.models.ToDoNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class ToDoNoteDB {

   List<ToDoNote> toDoNoteList = new ArrayList<>();


   public List<ToDoNote> getAllNotes(){
      return toDoNoteList;
   }

   public ToDoNote addNoteToDb(ToDoNote note){
      toDoNoteList.add(note);
      return note;
   }

   public List<ToDoNote> removeNoteFromDatabase(ToDoNote note){
      toDoNoteList.remove(note);
      return toDoNoteList;

   }


   public void clearDb() {
      toDoNoteList.clear();
   }
}

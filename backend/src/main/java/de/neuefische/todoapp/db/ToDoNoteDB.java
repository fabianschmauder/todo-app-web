package de.neuefische.todoapp.db;

import de.neuefische.todoapp.models.ToDoNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoNoteDB {

   List<ToDoNote> toDoNoteList = new ArrayList<>();


   public List<ToDoNote> addNoteToDb(ToDoNote note){


   }



}

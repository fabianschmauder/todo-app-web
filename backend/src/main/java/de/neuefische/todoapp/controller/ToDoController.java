package de.neuefische.todoapp.controller;


import de.neuefische.todoapp.enums.Status;
import de.neuefische.todoapp.models.ToDoNote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/todo")
public class ToDoController {

    private ToDoNote note;

  @GetMapping
  public List<ToDoNote> getToDos (){

      List<ToDoNote> listOfToDos = new ArrayList<>();
      listOfToDos.add(new ToDoNote("1", "Hallo", Status.OPEN));
      listOfToDos.add(new ToDoNote("2", "Hello again", Status.DONE));
      listOfToDos.add(new ToDoNote("3", "Hello once more", Status.IN_PROGRESS));

      return listOfToDos;
  }
}

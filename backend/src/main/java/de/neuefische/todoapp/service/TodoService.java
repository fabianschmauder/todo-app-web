package de.neuefische.todoapp.service;

import de.neuefische.todoapp.db.TodoDb;
import de.neuefische.todoapp.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
  private final TodoDb db;

  @Autowired
  public TodoService(TodoDb db) {
    this.db = db;
  }

  public List<TodoItem> getAllTodos() {
    return db.getAllItems();
  }
}

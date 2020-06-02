package de.neuefische.todoapp.db;

import de.neuefische.todoapp.model.TodoItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoDb {

  private final List<TodoItem> todoItems = new ArrayList<>();

  public void addItem(TodoItem item) {
    todoItems.add(item);
  }

  public List<TodoItem> getAllItems() {
    return todoItems;
  }
}

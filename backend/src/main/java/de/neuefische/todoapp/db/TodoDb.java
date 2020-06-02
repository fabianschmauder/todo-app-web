package de.neuefische.todoapp.db;

import de.neuefische.todoapp.model.TodoItem;
import de.neuefische.todoapp.model.TodoStatus;
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

  public void clearDb() {
    todoItems.clear();
  }

  public TodoItem updateTodoStatus(String id, TodoStatus status) {
    for (TodoItem todoItem : todoItems) {
      if (todoItem.getId().equals(id)) {
        todoItem.setStatus(status);
        return todoItem;
      }
    }
    return null;
  }
}

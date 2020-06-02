package de.neuefische.todoapp.service;

import de.neuefische.todoapp.db.TodoDb;
import de.neuefische.todoapp.model.TodoItem;
import de.neuefische.todoapp.model.TodoStatus;
import de.neuefische.todoapp.model.dto.AddTodoDTO;
import de.neuefische.todoapp.utils.IdGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
  private final TodoDb db;
  private final IdGenerationService idGenerationService;

  @Autowired
  public TodoService(TodoDb db, IdGenerationService idGenerationService) {
    this.db = db;
    this.idGenerationService = idGenerationService;
  }

  public List<TodoItem> getAllTodos() {
    return db.getAllItems();
  }

  public TodoItem addTodoItem(AddTodoDTO data) {
    TodoItem item = createTodoItem(data);
    db.addItem(item);
    return item;
  }

  private TodoItem createTodoItem(AddTodoDTO data) {
    String randomId = idGenerationService.generateRandomId();
    return new TodoItem(randomId, data.getDescription(), TodoStatus.OPEN);
  }

  public TodoItem updateTodoStatus(String id, TodoStatus status) {
    return db.updateTodoStatus(id,status);
  }

  public void deleteTodoItem(String id) {
    db.deleteTodoItem(id);
  }
}

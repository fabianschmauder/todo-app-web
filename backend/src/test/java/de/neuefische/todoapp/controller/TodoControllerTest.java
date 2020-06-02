package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.db.TodoDb;
import de.neuefische.todoapp.model.TodoItem;
import de.neuefische.todoapp.model.TodoStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TodoControllerTest {

  @LocalServerPort
  public int port;

  @Autowired
  public TestRestTemplate restTemplate;

  @Autowired
  public TodoDb db;

  @Test
  public void getTodoShouldReturnAllTodoItemsFromDb() {
    //GIVEN
    db.addItem(new TodoItem("1", "first todo", TodoStatus.OPEN));
    db.addItem(new TodoItem("2", "done todo", TodoStatus.DONE));

    String serverUrl = "http://localhost:" + port + "/api/todo";

    //WHEN
    ResponseEntity<TodoItem[]> response = restTemplate.getForEntity(serverUrl, TodoItem[].class);

    //THEN
    assertEquals(HttpStatus.OK, response.getStatusCode());
    TodoItem[] items = response.getBody();
    assertEquals(2, items.length);
    assertEquals(new TodoItem("1", "first todo", TodoStatus.OPEN), items[0]);
    assertEquals(new TodoItem("2", "done todo", TodoStatus.DONE), items[1]);
  }

}

package de.neuefische.todoapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ToDo {

    private String id;
    private String description;
    private ToDoStatus status;

}

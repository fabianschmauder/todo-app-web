package de.neuefische.todoapp.model;

import de.neuefische.todoapp.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ToDoMessage {

    private String id;
    private String description;
    private StatusEnum status;

}


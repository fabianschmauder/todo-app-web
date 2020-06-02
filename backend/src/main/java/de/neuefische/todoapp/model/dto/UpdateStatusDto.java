package de.neuefische.todoapp.model.dto;

import de.neuefische.todoapp.model.TodoStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateStatusDto {
  private TodoStatus status;
}

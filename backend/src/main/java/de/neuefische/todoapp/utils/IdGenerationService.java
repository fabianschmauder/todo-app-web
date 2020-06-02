package de.neuefische.todoapp.utils;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class IdGenerationService {

  public String generateRandomId(){
    return UUID.randomUUID().toString();
  }
}

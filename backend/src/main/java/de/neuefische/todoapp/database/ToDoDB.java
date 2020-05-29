package de.neuefische.todoapp.database;

import de.neuefische.todoapp.enums.StatusEnum;
import de.neuefische.todoapp.model.ToDoMessage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoDB {

    List<ToDoMessage> toDoMessageList = new ArrayList<>(List.of(
            new ToDoMessage("1", "Message01", StatusEnum.OPEN),
            new ToDoMessage("2", "Message02", StatusEnum.IN_PROGRESS),
            new ToDoMessage("3", "Message03", StatusEnum.DONE)
    ));

    public List<ToDoMessage> getAllMessages(){
        return toDoMessageList;
    }


    public ToDoMessage addAMessageToDb(ToDoMessage someMessage){
        toDoMessageList.add(someMessage);
        return someMessage;
    }



    }


package models;
import java.util.*;

public class Message {

  private String message;
  private Date created;

  public Message(String msg) {
   message = msg; 
   created = new Date();
  }

  public String getMessage(){
    return message;
  }

  public Date getCreated(){
    return created;
  }

}

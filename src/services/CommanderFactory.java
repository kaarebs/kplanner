package services;
import services.commands.*;
import exceptions.*;

public class CommanderFactory{

  public static Command findCommand(String cmd){
    try {
      Class<?> c = null;
      c = Class.forName("services.commands." + cmd);
      Command command = null;
      command = (Command) c.newInstance();
      return command;
    }
    catch (Exception e){
      return null;
    }
  } 
}



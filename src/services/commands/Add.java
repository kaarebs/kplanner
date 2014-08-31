package services.commands;
import models.*;
import exceptions.*;
import services.Helper;
public class Add implements Command{
  public void run(String[] params){
    if (params.length == 0){
      Helper.printAndExit("No message provided");
    }
    String msg = "";
    for (String m : params) {
      msg += m + " ";
    }
    Message m = new Message(msg);
    System.out.println(m.getMessage());
    System.out.println(m.getCreated());
  }


}

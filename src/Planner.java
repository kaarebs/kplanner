import services.CommanderFactory;
import settings.Configuration;
import services.Helper;
import services.commands.*;
import exceptions.*;
public class Planner{
  public static void main(String[] args){
    try {
      if (args.length == 0) throw new IllegalArgumentException("Program should always be executed with kp first");
      String programname = "kp";
      if (!programname.equals(args[0])) throw new IllegalArgumentException("Program should always be executed with kp first");
      if (programname.equals(args[0]) && args.length == 1) getHelper("No help yet");
      if (programname.equals(args[0]) && args.length > 1){
        String[] params = Helper.popArg(args);
        Command cmd = CommanderFactory.findCommand(params[0]);
        if (cmd == null) throw new UnknownCommandException("Command not found");
        params = Helper.popArg(params);
        cmd.run(params);
      }
    }
    catch (UnknownCommandException e){
      getHelper(e.getMessage());
    }
    catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
  }

  public static void getHelper(String msg){
    System.out.println(msg);
  }

  public static void printargs(String[] arr){
    for (String str : arr){
      System.out.println(str.getClass().getName());
    }
  }
}


import models.*;
public class Planner{
  public static void main(String[] args){
    Message m = new Message(args[0]);
    System.out.println(m.getMessage());
  }
}


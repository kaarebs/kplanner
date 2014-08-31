package services;
import java.util.Arrays;
public class Helper {
  public static String[] popArg(String[] arr){
    String[] params = Arrays.copyOfRange(arr, 1, arr.length);
    return params;
  }
  public static String upperFirst(String str){
    return str.substring(0,1).toUpperCase() + str.substring(1);
  }
  public static void printAndExit(String msg){
    System.out.println(msg);
    System.exit(0);
  }
}

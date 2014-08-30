package services;
import java.util.Arrays;
public class Helper {
  public static String[] popArg(String[] arr){
    String[] params = Arrays.copyOfRange(arr, 1, arr.length);
    return params;
  }
}

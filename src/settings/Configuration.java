package settings;
import org.json.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.io.IOException;

public class Configuration {

  public static String readFile() throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get("./src/settings/configuration.json"));
    String s = new String(encoded, Charset.defaultCharset());
    return s;
  }

  public static String getSetting(String name){
    try {
      JSONObject obj = new JSONObject(readFile());
      String s = obj.getString(name);
      return s;
    }
    catch (IOException e){
      System.out.println("No configuraiton file provided - SYSTEM EXIT!");
      System.exit(0);
    }
    return "";
  }
}

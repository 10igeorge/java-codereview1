import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
  }

  public static String replaceVowel(String word) {
    String finalWord = "";
    char[] splitWord = word.toCharArray();
    for (Integer i=0; i < splitWord.length; i++){
      if (splitWord[i] == ('a') || splitWord[i] == ('e')){
        finalWord += "-";
      } else {
        finalWord += splitWord[i];
      }
    }
    return finalWord;
  }
}

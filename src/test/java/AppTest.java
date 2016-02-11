import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void replaceVowel_replacesVowelAWithDash_replaceA(){
    App replaceA = new App();
     assertEquals("-", replaceA.replaceVowel("a"));
  }

  @Test
  public void replaceVowel_replacesVowelAEWithDash_replaceE(){
    App replaceE = new App();
     assertEquals("-", replaceE.replaceVowel("e"));
  }

  @Test
  public void replaceVowel_replacesVowelAEIWithDash_replaceI(){
    App replaceI = new App();
     assertEquals("-", replaceI.replaceVowel("i"));
  }

  @Test
  public void replaceVowel_replacesVowelAEIOWithDash_replaceO(){
    App replaceO = new App();
     assertEquals("-", replaceO.replaceVowel("o"));
  }

  @Test
  public void replaceVowel_replacesVowelAEIOUWithDash_replaceU(){
    App replaceU = new App();
     assertEquals("-mb-d-xtr--s", replaceU.replaceVowel("ambidextrous"));
  }
}

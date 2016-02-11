import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

@Test
  public void replaceVowel_replacesVowelAEIOUWithDash_vowelsToDashes(){
    App replaceAllVowels = new App();
     assertEquals("-mb-d-xtr--s", replaceAllVowels.replaceVowel("ambidextrous"));
  }
}

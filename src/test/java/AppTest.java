import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

@Test
  public void replaceVowel_replacesVowelAEIOUWithDash_vowelsToDashes(){
    App replaceAllVowels = new App();
     assertEquals("b--ng -mb-d-xtr--s -s c--l", replaceAllVowels.replaceVowel("being ambidextrous is cool"));
  }
}

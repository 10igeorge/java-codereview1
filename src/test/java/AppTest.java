import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

@Test
  public void replaceVowel_replacesVowelAEIOUWithDash_vowelsToDashes(){
    App replaceAllVowels = new App();
     assertEquals("B--NG -MB-D-XTR--S -S C--L", replaceAllVowels.replaceVowel("being ambidextrous is cool"));
  }
}

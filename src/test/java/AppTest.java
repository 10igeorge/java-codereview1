import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void replaceVowel_replacesVowelAWithDash_replaceA(){
    App replaceA = new App();
     assertEquals("--rdv-rk", replaceA.replaceVowel("aardvark"));
  }

  @Test
  public void replaceVowel_replacesVowelAEWithDash_replaceE(){
    App replaceE = new App();
     assertEquals("-l-ctric", replaceE.replaceVowel("electric"));
  }
}

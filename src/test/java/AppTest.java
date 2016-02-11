import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

@Test
  public void replaceVowel_replacesVowelAEIOUWithDash_replaceU(){
    App replaceU = new App();
     assertEquals("-mb-d-xtr--s", replaceU.replaceVowel("ambidextrous"));
  }
}

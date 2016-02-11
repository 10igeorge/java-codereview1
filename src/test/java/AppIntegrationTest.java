import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Enter a phrase to create a word puzzle!");
  }
  @Test
  public void replaceVowelWorks() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("i'm so broke it's not even funny");
    submit(".btn");
    assertThat(pageSource()).contains("-'m s- br-k- -t's n-t -v-n f-nny");
  }
}

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
      assertThat(pageSource()).contains("Enter a word, phrase, or quote in the boxes below to create personalized word puzzles!");
  }
  @Test
  public void replaceVowelWorks() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("i am so broke");
    submit("#btnimg");
    assertThat(pageSource()).contains("- -M S- BR-K-");
  }
}

package BasicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AnchorTagTest {
  @Test
  public void AnchorClassDemo() {
	  
	  WebDriver driver = new ChromeDriver();

      driver.get("https://www.miniclip.com/");
      driver.manage().window().maximize();

      List<WebElement> allLinks = driver.findElements(By.tagName("a"));

      System.out.println("Total number of anchor tags: " + allLinks.size());

      
      }

      // driver.quit();
  }

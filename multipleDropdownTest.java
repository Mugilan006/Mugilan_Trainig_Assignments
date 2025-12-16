package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiSelectDropdownTest {
  @Test
  public void MultiSelectDropdown() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.mobiscroll.com/jquery/select/multiple-select");
	  driver.manage().window().maximize();
	  
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("label>span>span>span:nth-child(1)")).click();
	  Thread.sleep(2000);
	  System.out.println("oo");
	  driver.findElement(By.cssSelector("body > div:nth-child(2) > main:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(11) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(44)")).click();
	  Thread.sleep(2000);
	  System.out.println("pp");
	  driver.findElement(By.cssSelector("div>div>div>div:nth-child(43)")).click();
	  Thread.sleep(2000);
	  System.out.println("ll");
	  driver.findElement(By.cssSelector("body > div:nth-child(2) > main:nth-child(5) > div:nth-child(5) > div:nth-child(3) > div:nth-child(11) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(47)")).click();
	  System.out.println("mm");
	  
	  System.out.println("pass");
	  

  }
}

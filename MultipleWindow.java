package TrainingAssignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandleTest {
  @Test
  public void HandleWindowTest() throws InterruptedException {
  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  
	  String parentWindow = driver.getWindowHandle();
	  
	  driver.findElement(By.id("openwindow")).click();
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.numberOfWindowsToBe(2));
      
	  Set<String> allWindows = driver.getWindowHandles();
	  
	  for(String win : allWindows) {
		  if(!win.equals(parentWindow)) {
			  driver.switchTo().window(win);
			  System.out.println("Child Window Title: "+driver.getTitle());
			  driver.close();
			  break;
		  }
	  }
	  
	  driver.switchTo().window(parentWindow);
	  System.out.println("Parent Window : "+driver.getTitle());
	  
	  driver.findElement(By.id("opentab")).click();
	  Thread.sleep(2000);
	  
	  Set<String> tabs = driver.getWindowHandles();
	  
	  for(String t:tabs) {
		  if(!t.equals(parentWindow)) {
			  driver.switchTo().window(t); 
			  System.out.println("Child tab title: "+driver.getTitle());
			  driver.close();
			  break;
		  }
	  }
	  
	  driver.switchTo().window(parentWindow);
	  System.out.println("Enter Parent Tab : "+driver.getTitle());	  
  }
}

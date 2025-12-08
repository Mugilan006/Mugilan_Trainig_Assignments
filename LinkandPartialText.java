package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLinkText {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/index.html");
		
		driver.findElement(By.linkText("Mutual Funds")).click();
		
		driver.findElement(By.partialLinkText("Mutual")).click();
		
	}

}


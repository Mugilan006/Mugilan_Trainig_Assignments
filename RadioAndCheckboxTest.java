package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyWebPage {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	
		driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")).click();
		
		  
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
		
		 System.out.println("Radio button and two checkboxes selected successfully!");
	}

}



package BasicSelenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductSearchTest {
	@Test
  public void NthProductDisplayTest() throws InterruptedException {
	  
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        Scanner sc = new Scanner(System.in);

        // Enter product name manually
        System.out.print("Enter Product Name: ");
        String prodName = sc.nextLine();

        WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
        searchBar.sendKeys(prodName);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000); // just for simple demo

        // Enter N manually
        System.out.print("Enter Nth Product: ");
        int n = sc.nextInt();

        // Fetch Nth product title
        WebElement nthProduct = driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[" + n + "]"));

        System.out.println("\nThe " + n + "th Product is:");
        System.out.println(nthProduct.getText());

        driver.quit();
	}
}
        
        

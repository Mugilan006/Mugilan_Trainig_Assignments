package BasicSelenium;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    @Test
    public void CrossBrowserDemo() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name (chrome / edge / firefox): ");
        String browserName = sc.nextLine();  // 

        WebDriver driver=null;

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Invalid Browser Name!");
            sc.close();
            return;
        }

        driver.manage().window().maximize();
        driver.get("https://www.ted.com/");   // unique website
        System.out.println("Page Title: " + driver.getTitle());

       /* driver.quit();
        sc.close();*/
    }
}

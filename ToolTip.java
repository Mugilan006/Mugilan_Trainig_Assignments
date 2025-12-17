public class ToolTipAss {
  @Test
  public void ToolTip() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/css/css_tooltip.asp");
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("navbtn_exercises")));
	  
	  WebElement but = driver.findElement(By.id("navbtn_exercises"));
	  
	  //just it touches withoutb this code run means the actions
	  Actions actions = new Actions(driver);
	  actions.moveToElement(but).perform();
	  
	  String tooltip = but.getAttribute("title");
	  System.out.println(tooltip);
  }
}

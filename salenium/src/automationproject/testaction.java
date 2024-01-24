package automationproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class testaction {
  ChromeDriver driver;
	  @BeforeTest
	  public void open() throws InterruptedException {
		  driver=new ChromeDriver();
		  driver.get("https://jqueryui.com/slider/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  
	  }
	
  @Test
  public void data() {

  /*WebElement value=driver.findElement(By.linkText("Gmail"));
  Actions action=new Actions(driver);
  action.contextClick(value).build().perform();
  */
	
	  /*WebElement value=driver.findElement(By.linkText("Customer Login"));
	  Actions action=new Actions(driver);
	  action.moveToElement(value).build().perform();
	  driver.findElement(By.linkText("Register")).click();
	  */
	  
	/*driver.findElement(By.name("q")).sendKeys("Testing");
	WebElement value=driver.findElement(By.name("btnK"));
	Actions action=new Actions(driver);
	action.doubleClick(value).build().perform();
	*/
	  
	  driver.switchTo().frame(0);
	  WebElement slider=driver.findElement(By.id("slider"));
	  int location=slider.getLocation().y;
	  Actions action=new Actions(driver);
	  action.dragAndDropBy(slider, location,60).build().perform();
	  
  
  }
  

}

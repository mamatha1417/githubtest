package automationproject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testdatepicker {
	
	ChromeDriver driver;
	
  @Test
  public void f() {
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("datepicker")).sendKeys("12/02/2023");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/datepicker/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }

}

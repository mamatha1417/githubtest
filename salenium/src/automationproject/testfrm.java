package automationproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testfrm {
  ChromeDriver driver;
  @BeforeTest
  public void beforeTest() throws InterruptedException 
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.angelfire.com/super/badwebs/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }
	@Test
  public void f() {
		List<WebElement>frames=driver.findElements(By.tagName("frame"));
		for(int i=0;i<frames.size();i++)
		{
			driver.switchTo().frame(i);
			try
			{
				driver.findElement(By.xpath("/html/body/p[6]/b/a/font")).click();
				break;
				
			}
			catch(Exception x) {
				driver.switchTo().defaultContent();
				
				
				
			}
		}
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}

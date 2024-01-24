package automationproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testproperties {
	
	ChromeDriver driver;
	FileInputStream fis;
	 Properties pr12;
	@BeforeTest
	public void open() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		}
	@Test(priority=1)
	public void data() throws IOException
	{
		fis=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\salenium\\HRMlogin.Properties");
	    pr12=new Properties();
	    pr12.load(fis);
	    
	    driver.findElement(By.name(pr12.getProperty("user"))).sendKeys("Admin");
	    driver.findElement(By.name(pr12.getProperty("password"))).sendKeys("admin123");
	    driver.findElement(By.xpath(pr12.getProperty("loginbutton"))).click();
	    

	}
@Test(priority=2)
public void data2() throws IOException, InterruptedException
{

	fis=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\salenium\\HRMlogin.Properties");
    pr12=new Properties();
    pr12.load(fis);
	driver.findElement(By.xpath(pr12.getProperty("dropdown"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(pr12.getProperty("logout"))).click();
}
	

	
}

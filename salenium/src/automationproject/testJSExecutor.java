package automationproject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class testJSExecutor {
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
	}
	
	@Test
	public void data() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		/*js.executeScript("document.getElementById('email').value='12345678'");
		js.executeScript("document.getElementById('pass').value='12345'");
	*/
		
		/*String text=js.executeScript(" return document.title").toString();
		System.out.println(text);
	*/
		
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	//js.executeScript("document.getElementById('pass').scrollIntoView()");
	
	driver.navigate().to("https://www.google.com");
	js.executeScript("window.history.back()");
	Thread.sleep(3000);
	js.executeScript("window.history.forward()");
	Thread.sleep(3000);
	
	}

}

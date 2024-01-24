package automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testalert {
	ChromeDriver driver;
	@BeforeTest
	public void open() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
@Test
public void main() {
	driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	
	
}
}

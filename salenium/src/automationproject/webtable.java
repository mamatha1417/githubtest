package automationproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webtable {

	ChromeDriver driver;
	
	@BeforeTest
	public void open() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	/*@Test
	public void main() {
		WebElement table=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are:"+rows.size());
		
		List<WebElement>columns=table.findElements(By.tagName("td"));
		System.out.println("no of rows are:"+columns.size());
	}*/
	
	/*@Test
	public void data() {
		
		String text=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a")).getText();
		System.out.println(text);
		
		
	}*/
	
	/*@Test
	public void main() {
		
	String part1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String part2="]/td[1]/a";
	WebElement table=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	for(int i=1;i<rows.size();i++)
	{
		String text=driver.findElement(By.xpath(part1+i+part2)).getText(); 
		System.out.println(text);
	}
	}*/
	
	@Test
	public void data()
	{
		WebElement table=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<columns.size();j++)
			{
			System.out.print(columns.get(j).getText()+"   ");	
			}
		 System.out.println();	
		}
		}
	
	@AfterTest
	public void close() {
		driver.close();
	}
	
}

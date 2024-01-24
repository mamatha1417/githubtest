package automationproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://www.mercurytravels.co.in/");
  driver.manage().window().maximize();
  Thread.sleep(3000);
  
 /* List<WebElement>dropdown=driver.findElements(By.tagName("select"));
  
  System.out.println(dropdown.size());
  
  for(int i=0;i<dropdown.size();i++)
  {
	  System.out.println(dropdown.get(i).getAttribute("name"));
  }*/
 /*driver.findElement(By.id("themes")).sendKeys("Family");
	*/
  
  
	WebElement dropdown=driver.findElement(By.id("themes"));
	List<WebElement>values=dropdown.findElements(By.tagName("option"));
	System.out.println(values.size());
	
	/*for(int i=0;i<values.size();i++)
	{
		System.out.println(values.get(i).getText());
	
	}*/
	
/*	for(int i=0;i<values.size();i++)
	{
		String name=values.get(i).getText();
		String Expected="Family";
		
		if(name.equals(Expected))
		{
			System.out.println("pass");
		}
		
	}*/
	
	for(int i=0;i<values.size();i++)
	{
		String name=values.get(i).getText();
		values.get(i).click();
		
		if(values.get(i).isDisplayed())
			
		{
			System.out.println(name+" "+"active");
		}
		else
		{
			System.out.println(name+" "+"inactive");
		}
		}
	}
	
	}



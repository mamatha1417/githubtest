package automationproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
		{
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\salenium\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.bing.com/");
			driver.manage().window().maximize();
		
			List<WebElement>links=driver.findElements(By.tagName("a"));
			/*System.out.println("no of links are "+" "+links.size());
			for(int i=0;i<links.size();i++)
	
		{
				System.out.println(links.get(i).getText());
		}*/
			/*int count=0;
			for(int i=0;i<links.size();i++)
			{
				if(links.get(i).isDisplayed())
				{
					count++;
				}
			}
			System.out.println("the no. of links are:"+links.size());
			System.out.println("the no .of visible links are:"+count);
			System.out.println("the no. of invisible links are"+(links.size()-count));
		*/
			for(int i=0;i<links.size();i++)
			{
				if(links.get(i).isDisplayed())
				{
					String name=links.get(i).getText();
					links.get(i).click();
					
					String url=driver.getCurrentUrl();
					System.out.println(name+"  "+url);
					
					driver.navigate().back();
					links=driver.findElements(By.tagName("a"));
				}
			}
		}
	}

}

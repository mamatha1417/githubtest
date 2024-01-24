package automationproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement>radiobuttons=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radiobuttons.size());
		for(int i=0;i<radiobuttons.size();i++)
		{
			System.out.println(radiobuttons.get(i).getAttribute("name")+" "+radiobuttons.get(i).getAttribute("checked"));
			//System.out.println(radiobuttons.get(i).getAttribute("checked"));

		}
	}

}

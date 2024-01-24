package automationproject;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		/*File srcshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(srcshot, new File ("C:\\Users\\lenovo\\OneDrive\\Desktop\\capture2.PNG"));
        driver.findElement(By.linkText("Gmail")).click();*/
		
		/*List<WebElement>link=driver.findElements(By.linkText("BKFS"));
		if(link.size()==0) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(src, new File("C:\\\\Users\\\\lenovo\\\\OneDrive\\\\Desktop\\\\capture3.PNG"));
	}
		else
		{
			link.get(0).click();
		}*/
		
		List<WebElement>link=driver.findElements(By.tagName("a"));
		for(int i=0;i<link.size();i++)
		{
			if(link.get(i).isDisplayed())
			{
				String name=link.get(i).getText();
				link.get(i).click();
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\scr\\"+name+".PNG"));
                driver.navigate().back();
                link=driver.findElements(By.tagName("a"));
			}
		}
	}}

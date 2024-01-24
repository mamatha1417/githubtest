package automationproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hybridreusable {
	
		
		ChromeDriver driver;
		FileInputStream fis;
		XSSFWorkbook wbo;
		XSSFSheet wso;
		FileOutputStream fos;
		 
		@BeforeTest
		public void open() throws InterruptedException
		{
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
		
		@Test
		public void login() throws IOException, InterruptedException
		{
			fis=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Demo.xlsx");
			wbo=new XSSFWorkbook(fis);
			wso=wbo.getSheet("Sheet1");
			Row r;
			int rowc=wso.getLastRowNum();
			for(int i=1;i<=rowc;i++) 
			{
				r=wso.getRow(i);
				driver.findElement(By.name("username")).clear();
				driver.findElement(By.name("username")).sendKeys(r.getCell(0).getStringCellValue());
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				Thread.sleep(3000);
				String Actual=driver.getCurrentUrl();
				r.createCell(3).setCellValue(Actual);
				String Expected=r.getCell(2).getStringCellValue();
				if(Expected.equals(Actual))
				{
					r.createCell(4).setCellValue("pass");
				}
				else{
					r.createCell(4).setCellValue("fail");
				}
				driver.close();
				Thread.sleep(3000);
				driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(3000);
	   fos=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Demo.xlsxs");
	   wbo.write(fos);
	   
	   
			}
		}
@AfterTest
public void close()
{
	driver.close();
}
}


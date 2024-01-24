package automationproject;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testapachewebdriver {
  ChromeDriver driver;
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://www.mercurytravels.co.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }
  @Test
  public void f() throws IOException {
	  FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Demo.xlsx");
	  XSSFWorkbook wbo=new XSSFWorkbook(fis);
	  XSSFSheet wso=wbo.getSheet("Sheet1");
	  Row r;
	 WebElement dropdown=driver.findElement(By.id("themes"));
	 List<WebElement>list=dropdown.findElements(By.tagName("option"));
	  /* String data=driver.findElement(By.linkText("Gmail")).getText();
	  r=wso.createRow(0);
	  r.createCell(0).setCellValue(data);*/
	  
	  for(int i=0;i<list.size();i++)
	  {
		  r=wso.createRow(i);
		  r.createCell(0).setCellValue(list.get(i).getText());
	  }
	  
	  FileOutputStream fos=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Demo.xlsx");
	  wbo.write(fos);
	  
  }
}

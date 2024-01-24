package automationproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testapachepoi {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Demo.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet wso=wbo.getSheet("Sheet2");
		
		Row r;
		int rowc=wso.getLastRowNum();
		for(int i=0;i<rowc;i++) {
			r=wso.getRow(i);
			int colc=r.getLastCellNum();
			for (int j=0;j<colc;j++)
			{
				System.out.print(r.getCell(j).getStringCellValue()+" ");
			}
			
		
		System.out.println(" ");
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\lenovo\\OneDrive\\Desktop\\Demo.xlsx");
		wbo.write(fos);
	}

}

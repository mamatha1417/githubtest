package automationproject;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class testinghtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		String value=driver.getTitle();
		System.out.println(value);
	}

}

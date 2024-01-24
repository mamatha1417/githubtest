package automationproject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeTest
	public void open() {
		System.out.println("open browser");
		}
	
	@Test(priority=1)
	public void navigate() {
		System.out.println("navigate to browser");

	}
	
	
	@Test(priority=2 , enabled=false)
	public void register() {
		System.out.println("register new accounrt");

	}
	
	
	@Test(priority=3)
	public void login() {
		System.out.println("login into apppl");

	}
	
	
	@Test(priority=4)
	public void sendreports() {
		System.out.println("prepare amd send reports");

	}
	
	@Test(priority=5)
	public void logout() {
		System.out.println("logout appl");

	}
	@AfterTest
	public void close() {
		
		System.out.println("close browser");

		
	}
}

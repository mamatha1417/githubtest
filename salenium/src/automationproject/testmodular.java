package automationproject;

import org.testng.annotations.Test;

public class testmodular {
	@Test
	public void test() throws InterruptedException
	{
		modularreusable m=new modularreusable();
		m.open();
		m.login("Admin", "admin123");
		Thread.sleep(3000);
		m.logout();
		Thread.sleep(3000);
		m.close();
	}

}

package automationproject;

import java.io.IOException;

import org.testng.annotations.Test;

public class testhybrid {
@Test
public void test() throws InterruptedException, IOException
{
	hybridreusable m=new hybridreusable();
	m.open();
	m.login();
	Thread.sleep(3000);
	m.close();
}
}

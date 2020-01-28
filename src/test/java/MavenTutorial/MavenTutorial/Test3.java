package MavenTutorial.MavenTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test3
{
	@Test(description = "This test is used for docker run", priority = 1)
	public void testDocker() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL url = new URL("http://192.168.99.100:4444/wd/hub/");
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Title is : "+title);
		driver.quit();
	}
}

package MavenTutorial.MavenTutorial;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test(description = "Mavn profile and parameters")
	public void mavenBasic() throws InterruptedException
	{
		//Without profile
		//-DEnvname=UAT clean install

		//With profile
		//-PSIT -DEnvname=SITENV clean test

		//Envname will be picked up either from -DEnvname from system variable or from Envname tag of POM.xml
		System.out.println(System.getProperty("Envname"));

		//UserName will be picked up either from -DUserName from system variable or from UserName tag of POM.xml
		System.out.println(System.getProperty("UserName"));
	}
	
	@Test(description = "This part is used for docker")
	public void testDocker() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		URL url = new URL("http://192.168.99.100:4444/wd/hub/");
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Title is : "+title);
		driver.quit();
	}
}

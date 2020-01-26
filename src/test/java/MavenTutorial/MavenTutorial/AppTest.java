package MavenTutorial.MavenTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test
	public void testApp() throws InterruptedException
	{
		//Without profile
		//-DEnvname=UAT clean install

		//With profile
		//-PSIT -DEnvname=SITENV clean test

		//Envname will be picked up either from -DEnvname from system variable or from Envname tag of POM.xml
		System.out.println(System.getProperty("Envname"));

		//UserName will be picked up either from -DUserName from system variable or from UserName tag of POM.xml
		System.out.println(System.getProperty("UserName"));
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.quit();
	}
}

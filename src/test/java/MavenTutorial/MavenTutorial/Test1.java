package MavenTutorial.MavenTutorial;

import org.testng.annotations.Test;

//@Listeners(CustomListeners.CustomTestNGReporter.class)
public class Test1
{
	@Test(description = "Mavn profile and parameters", priority = 0)
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
}

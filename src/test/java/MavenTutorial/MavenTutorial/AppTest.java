package MavenTutorial.MavenTutorial;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        
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

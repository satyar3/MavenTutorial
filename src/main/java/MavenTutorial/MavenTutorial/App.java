package MavenTutorial.MavenTutorial;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //String userNameFromMaven = System.getProperty("UserName");
        String envnameFromMaven = System.getProperty("Envname");
        //System.out.println(userNameFromMaven);
        System.out.println(envnameFromMaven);
    }
}

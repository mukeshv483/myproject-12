package myproject.myproject_12;

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
    	
       int i,j,k;
for(i=1; i<=5; i++)
{
for(j=4; j>=i; j--)
{
System.out.print(" ");
}
for(k=1; k<=(2*i-1); k++)
{
System.out.print("*");
}
System.out.println("");
}
       
        System.out.println( "Hello World!" );
   	 System.out.println( "Hello World!" );
    	 System.out.println( "Hello World!" );
    	 System.out.println( "Hello World!" );
    	 System.out.println( "Hello World!" );
    	 System.out.println( "Hello World!" );
    	
        assertTrue( true );
    }
}

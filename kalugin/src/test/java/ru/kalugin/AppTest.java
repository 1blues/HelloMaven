package ru.kalugin;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase
{

    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }

    public void testAssert()
    {
		 String message = new AppBean("Maven 2").sayHello();
         Assert.assertEquals("Test Hello Machine", "Hello, Maven 2", message);
    }
}

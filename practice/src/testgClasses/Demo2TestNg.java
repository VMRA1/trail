package testgClasses;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2TestNg {
@BeforeTest

	public void bt()
	{
//	Assert.assertEquals("Helllo", "Hrllo");
	System.out.println("BeforeTest");
	}

@Test
public void testcase1()
{
	Assert.assertEquals("hi", "tu");
System.out.println("TestCase1");
}

}

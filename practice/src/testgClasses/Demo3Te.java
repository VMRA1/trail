package testgClasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo3Te {
	@Test(priority=1)

	public void testcase2()
	{
	System.out.println("TestCase2");
	}
	@Test(priority=0)

	public void testcase3()
	{
	System.out.println("TestCase3");
	}
	@AfterTest

	public void after()
	{
	System.out.println("AfterTest");
	}
}

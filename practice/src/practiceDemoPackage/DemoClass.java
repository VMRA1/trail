package practiceDemoPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DemoClass {

	
	@Before
	public void bt()
	{
		System.out.println("Before asserting");	
		
	System.out.println("First Before");	
	}

	@Test
	
	public void testcase1() {
		System.out.println("Second Test Case");
		Assert.assertEquals("st", "mt");
	}
	
	@After
	public void at() {
		System.out.println("After Test Case");
	}
}

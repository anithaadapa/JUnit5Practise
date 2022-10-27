package com.JunitAssertionsExample;

import org.junit.Ignore;
import org.junit.Test;

public class JUnitDisableExample {

	@Ignore // it will ignore the @Test
	@Test
	
	public void ExecuteTest()
	
	{
		
		System.out.println("Executing test caseone");
	}
}

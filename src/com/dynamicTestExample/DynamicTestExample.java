package com.dynamicTestExample;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {

	@TestFactory // we can give all @test methods in test factory
	
	public Collection<DynamicTest> dynamicTests()
	{
		/*return Arrays.asList(
				
				dynamicTest("test case one", ()->assertTrue(true)),
				dynamicTest("test case two", ()->{throw new Exception("Exception Example");}), // it will execute all test cases and will not stop
				dynamicTest("test case three", ()->assertTrue(true))
				
				);*/
		
		return Arrays.asList(dynamicTest("Sum TestCase 1", () -> assertEquals(7,Calculator.add(3, 4))));
		
		
		
	}
	
}

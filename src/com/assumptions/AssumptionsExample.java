package com.assumptions;



import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.Assume;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AssumptionsExample {

	@ParameterizedTest
	@ValueSource(ints = {1,2,3,-1})
	
	void testcaseone(int i)
	
	{
		assumeTrue(i>=1);  // this assumptions will pass the test but will abort the test that is failed. it will not stop execution
	}
	
	@Test
	public void testcase2()
	{
		Assume.assumeFalse("root".equals(System.getenv("USER"))); //THIS IS always false bcaz they don't match. that's why the test is passed
		
	}
	
	@Test
	public void testcase3()
	{
		assumingThat("root".equals(System.getenv("USER")),()-> {System.out.println("the account names are similar");});
	
}
}
package com.parameterizedTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



	@RunWith(Parameterized.class)
	
	public class PrimeNumberCheckerTest{
		
		private Integer inputNumber;
		private Boolean expectedResult;
		
		private PrimeNumberCheck primeNumberCheck;
		
		
		@Before
		
		public void CreateObject() {
			
			primeNumberCheck = new PrimeNumberCheck();
		}
		
		@Parameterized.Parameters
		
		public static Collection primeNumbers()
		
		{
			return Arrays.asList(new Object[][]{
				{2,true},
				{6,false},
				{19,true},
				{21,false},
				{23,true},
				
		});
		
	}
	
		public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult)
		
		{
			this.inputNumber = inputNumber;
			this.expectedResult = expectedResult;
		}
		
	@Test
	public void TestPrimeNumberCode()
	{
		System.out.println("The Parameter Number is" +inputNumber);
		assertEquals(expectedResult,primeNumberCheck.ValidateNumber(inputNumber));
	}
}

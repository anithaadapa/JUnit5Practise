package com.dynamicTestExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void PositiveAdd()
	{
		assertEquals(7, Calculator.add(4,3));
	}
	
	@Test
	public void NegativeAdd()
	{
		assertEquals(8, Calculator.add(4,3));
	}
}

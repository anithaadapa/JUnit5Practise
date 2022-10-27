package com.parameterizedTest;

import static org.junit.Assert.assertTrue;

import java.lang.annotation.ElementType;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterJunitExample {

	@ParameterizedTest
	
	//to pass the values into the parameters we use valuesource annotation
	
	@ValueSource(ints= {4,5,6})
	
	void testcase1(int i) {
	
	
		System.out.println(i);
		
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"anitha","any","deban"})
	
	void testcase2(String s)
	{
		System.out.println(s);
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"4","5","6"})
	
	void testcase3(String s)
	{
		assertTrue(Integer.parseInt(s)<5);
	}
	
	//Enum example, special data type like constant value - column names , serial number
	
	@ParameterizedTest
	@EnumSource(value=ElementType.class, names= {"TYPE", "FIELD"})
	
	void testmethod4(ElementType et)
	{
		System.out.println(et);
	}
}

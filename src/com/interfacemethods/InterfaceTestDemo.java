package com.interfacemethods;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public interface InterfaceTestDemo {

	@TestFactory
	
	default Stream<DynamicTest> TestCaseForPalindrome()
	{
		return Stream.of("madam","level","mom","dad","radar","tat")
				.map(inputText-> dynamicTest(inputText,()-> assertTrue(isPalindrome(inputText))));
								
		
	}
	
	default boolean isPalindrome(String inputText)
	{
		return new StringBuffer(inputText).reverse().toString().equals(inputText);
		
	}
	
	
}

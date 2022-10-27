package com.JunitAssertionsExample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTestExample {

	
	@RepeatedTest(5)
	
	
	public void TestCaseone()
	
	{
		System.out.println("Test case to be executed");
	}
	
	@RepeatedTest(value =3, name= "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Test Case Execution Times")
	
	public void TestExecution()
	{
		System.out.println("Test cases executed");
	}
	
@RepeatedTest(5)
    
    public void Testcasetwo(RepetitionInfo repInfo)
    {
        System.out.println("Current Test" +repInfo.getCurrentRepetition());
        System.out.println("Current Test" +repInfo.getTotalRepetitions());
        

    }
}
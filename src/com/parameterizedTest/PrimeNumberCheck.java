package com.parameterizedTest;

public class PrimeNumberCheck {

	//writing java program to check if the input is prime number or not, for that we create a method with 
	//return type as true or false
	
	public boolean ValidateNumber(final Integer primeNumber)
	{
		
		for (int i=2; i<(primeNumber/2); i++)
			
			if(primeNumber % i==0) {
				
				return false;
				
			}
		
		return true;
		
	}
}

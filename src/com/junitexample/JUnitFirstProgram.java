package com.junitexample;


import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class JUnitFirstProgram {

	  
	@Test
	public void Testcaseone()
	{
	    String str = "JUnit is working program";
	    
	    //Assert in Junit
	    
	    assertEquals("JUnit is working", str);

}
}


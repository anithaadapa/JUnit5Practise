package com.parameterinjection;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ValueSourceEmptyTest {
	
	boolean isEmpty(String input)  // if we give boolean it should return false or true. isEmpty is just method name i gave here. our own name. to check it is empty or not
	{
		return (input ==null|| input.length()==0);
		
	}
	
    @ParameterizedTest(name="#{index}")
    @ValueSource(strings = {"","\n","a"})
    
    public void isEmptyCheck(String arg)
    {
        assertTrue(isEmpty(arg)); // if it is null then that is true
    }
    
    

@ParameterizedTest(name="#{index}")
@ValueSource(strings = {"","\n","a"})

public void isEmptyCheckFalse(String arg)  // this will fail first test case and pass the other 2
{
    assertFalse(isEmpty(arg)); // it should be always false to pass
}
}


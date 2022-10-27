package com.parameterinjection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class CSVSourceTest {

	  @ParameterizedTest
	    @CsvSource({
	        
	        "Java, 4",
	        "Selenium, 8",
	        "TestNG, 4"  // length is 6 here but i gave 4. so it will fail
	        
	    })
	    
	    void testcsvData(String str, int len)
	    {
	        assertEquals(len, str.length());
	    }
	}
	


package com.parameterinjection;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MethodSourceTest {

	@ParameterizedTest(name="#{index}")
    @MethodSource("StringData")
    
    public void Stringmethod(String arg)
    {
        System.out.println(arg);
        assertNotNull(arg);
    }
    
    static Stream<String> StringData()
    {
        return Stream.of("Himanshu","Uday","Anvesh");
        
    }
	
    static IntStream TestDataProvider()
    {
        return IntStream.range(0, 10);
    }
    
    @ParameterizedTest(name="#{index}")
    @MethodSource("TestDataProvider")
    
    void testmethod_int(int arg)
    {
        System.out.println(arg);
        assertTrue(arg<10);
    }
}

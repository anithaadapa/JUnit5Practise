package com.junitexample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsCycleExample {
	
	
	@BeforeAll
	
	static void setup()
    {
        System.out.println("Running Set Up Method");
    }
    
    @BeforeEach
    
    static void setupThis()
    {
        System.out.println("Executing Before Each");
    }
    
    @Test
    
    static void Testcaseone()
    {
        System.out.println("Test case one");
    }
    
    @Test
    
    static void Testcasetwo()
    {
        System.out.println("Test case two");
    }
    @AfterEach
    
    static void tearThis()
    {
        System.out.println("After this Each");
    }
    
    @AfterAll
    
    static void tear()
    {
        System.out.println("After all");
    }



}

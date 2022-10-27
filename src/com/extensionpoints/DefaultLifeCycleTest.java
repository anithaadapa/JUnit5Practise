package com.extensionpoints;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestLifeCycleExtensions.class)
public class DefaultLifeCycleTest {

@BeforeAll
    
    static void setup()
    {
        System.out.println("Before All()");
    }
    
    @BeforeEach
    
    void setupThis()
    {
        System.out.println("BeforeEach()");
    }
    
    @Test
    
    public void Testcaseone()
    {
        System.out.println("FirstTest()");
    }
    
    @Test
    
    public void Testcasetwo()
    {
        System.out.println("SecondTest()");
    }
    @AfterEach
    
     void tearThis()
    {
        System.out.println("AfterEach()");
    }
    
    @AfterAll
    
    static void tear()
    {
        System.out.println("AfterAll");
    }
}
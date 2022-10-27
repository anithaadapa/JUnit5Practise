package com.JunitAssertionsExample;
//all methods inside assert class will be imported directly
import static org.junit.Assert.*;

import org.junit.Test;


public class TestAssertions {

@Test
    
    public void testAssertions()
    {
        //Test data - Objects
        String str1 = new String("abc");
        String str2 = new String("abc");
        
        //Null data check
        String str3 = null;
        
        //String test data
        String str4="Himanshu";
        String str5 ="Himanshu";
        
        //Array Object
        String[] expectedArray= {"Nidhi","Arul","Deban"};
        String[] actualArray= {"Nidhi","Arul","Deban"};        
        
        //To check two objects are equal
        
        assertEquals(str1,str2);
        

        
        //check if the two values are same or not
        assertSame(str4,str5);
        
        //To check if two objects are not same
        
        assertNotSame(str1,str2);
        
        //To check if two arrays are equal or not
        
        assertArrayEquals(expectedArray,actualArray);
        
    }


        
    }


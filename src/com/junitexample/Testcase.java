package com.junitexample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class Testcase {
    
    public static void main(String args[])
    {
        
        //Result summarizes all the test cases which has been executed
        Result result = JUnitCore.runClasses(JUnitFirstProgram.class);
        
        for(Failure fail: result.getFailures())
        {
            System.out.println(fail.toString());
            System.out.println(fail.getMessage());
            
        }
        
        System.out.println(result.wasSuccessful());
        System.out.println("The failure count" +result.getFailureCount());
        
    }
}


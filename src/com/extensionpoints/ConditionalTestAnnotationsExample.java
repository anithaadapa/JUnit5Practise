package com.extensionpoints;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
public class ConditionalTestAnnotationsExample {
	
	/*  @Test
	    @EnabledOnOs(OS.WINDOWS) // PRECHECK To make sure it is on windows
	    
	    public void RunTestCaseWindows()
	    {
	        System.out.println("Execute test case if it is on Windows");
	    }

	  
	  @Test
	    @DisabledOnOs(OS.WINDOWS) // PRECHECK To make sure it is disabled on windows
	    
	    public void DisabledTest()
	    {
	        System.out.println("Execute disabled test");
	    }
	  
	  
	  //JRE Checks
	  
@Test
    
    @EnabledOnJre(JRE.JAVA_8)
    void runonlyonJava8()
    {
        System.out.println("Running the test on java 8");
    }
    
    @DisabledOnJre(JRE.JAVA_8)
    void NotRunonlyonJava8()
    {
        System.out.println("Not Running the test on java 8");
    }*/
    
/*@Test
    
    //os.arch - Check if the bit version of my machine
    
    @EnabledIfSystemProperty(named="os.version", matches=".*10.*")
    
    void runonWindows10()
    {
        System.out.println("Run this test only on Windows 10 os");
    }
    
    @DisabledIfSystemProperty(named="os.version", matches=".*10.*")
    
    void NotrunonWindows10()
    {
        System.out.println("Not Run this test only on Windows 10 os");
    }*/
/*@Test
    
    @EnabledIfEnvironmentVariable(named="os.version", matches=".*10.*")
    
    void runonWindows10()
    {
        System.out.println("Run this test only on Windows 10 os");
    }
    
    @DisabledIfEnvironmentVariable(named="os.version", matches=".*10.*")
    
    void NotrunonWindows10()
    {
        System.out.println("Not Run this test only on Windows 10 os");
    }*/
    
    @Test
@EnabledIfEnvironmentVariable(named="USERNAME", matches="admin")
    
    void runonWindows10()
    {
        System.out.println("Run this test only on Windows 10 os");
    }
    
    @DisabledIfEnvironmentVariable(named="os.version", matches=".*10.*")
    
    void NotrunonWindows10()
    {
        System.out.println("Not Run this test only on Windows 10 os");
    }
}


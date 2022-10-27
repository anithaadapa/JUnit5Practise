package com.extensionpoints;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class TestLifeCycleExtensions implements TestInstancePostProcessor, BeforeAllCallback, BeforeEachCallback,
BeforeTestExecutionCallback,AfterTestExecutionCallback,AfterEachCallback, AfterAllCallback{
	// adding test instance post processor interface and adding all the interfaces
	
	@Override
	public void postProcessTestInstance(Object arg0, ExtensionContext arg1) throws Exception {
	System.out.println("Test Post Processor");
		
	}

	@Override
	public void afterAll(ExtensionContext arg0) throws Exception {
		System.out.println("After All");
		
	}

	@Override
	public void afterEach(ExtensionContext arg0) throws Exception {
		System.out.println("After Execution");
	}

	@Override
	public void afterTestExecution(ExtensionContext arg0) throws Exception {
		System.out.println("Before Test Execution");
		
	}

	@Override
	public void beforeTestExecution(ExtensionContext arg0) throws Exception {
		System.out.println("Before Test Execution");
		
	}

	@Override
	public void beforeEach(ExtensionContext arg0) throws Exception {
		System.out.println("Before Test Execution");
		
	}

	@Override
	public void beforeAll(ExtensionContext arg0) throws Exception {
		System.out.println("Before Test Execution");
		
	}  

	
	
}

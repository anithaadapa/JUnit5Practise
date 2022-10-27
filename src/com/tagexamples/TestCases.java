package com.tagexamples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestCases {
    @Test
    @Tag("AdminSection")
    public void Testcase1() {
        System.out.println("Test case 1");
    }
    @Test
    @Tag("AdminSection")
    @Tag("ShoppingCart")
    public void Testcase2() {
        System.out.println("Test case 2");
    }
}

	
	


package com.parameterinjection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EnumSet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;

public class EnumSourceTest {
    
    enum Size{  // enum as Size
        
        XXS, XS,S, M,L,XL,XXL,XXXL;
    }
    
    @ParameterizedTest
    @EnumSource(Size.class)
    public void testenum(Size size)
    {
        //assertNull(size);
        assertNotNull(size);
    }
    
    @ParameterizedTest
    @EnumSource(value=Size.class,names= {"L","XL","XXL","XXXL"})  // if these values are present/contain in enum Size or not
    
    public void enum_includelist(Size size)
    {
        assertTrue(EnumSet.allOf(Size.class).contains(size)); // if these values are present in enum Size or not
        
    }
	
    @ParameterizedTest
    @EnumSource(value=Size.class, mode = Mode.EXCLUDE, names= {"XXS","XS","S"}) // exclude these values
    public void exclude_test(Size size)
    {
        EnumSet<Size> excludelist = EnumSet.range(Size.M, Size.XXXL);
        assertTrue(excludelist.contains(size));
        
    }
    
    //negative scenario
    
    @ParameterizedTest
    @EnumSource(value=Size.class, mode = Mode.EXCLUDE, names= {"XXS","XS","S"})
    public void exculde_test(Size size)
    {
        EnumSet<Size> excludelist = EnumSet.range(Size.XL, Size.XXXL);
        assertTrue(excludelist.contains(size));
        
    }
}

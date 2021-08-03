package com.example;
import static org.junit.Assert.assertEquals;

import org.junit.Test;  
public class LoginTest {

	public LoginTest() {
		// TODO Auto-generated constructor stub
	}
	@Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        // correct test case
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
        
        
        
        // wrong test case
        //assertEquals(0,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
        
    }  

}

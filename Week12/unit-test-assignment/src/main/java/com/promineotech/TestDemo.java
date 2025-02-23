package com.promineotech;

import java.util.Random;

public class TestDemo {
	
	//This is Step 1-2	
	public int addPositive(int a, int b) {
		// Check if both parameters are positive and greater than zero, return the sum
        if (a <= 0 || b <= 0) {
        // If false, throw an argument.	
            throw new IllegalArgumentException("Both parameters must be positive!");
        }
        return a + b;
	}
	
	// This is Step 3- Own Method & JUnit Test
	
	//Check that number is divisible by 5
	public int numberDivisibleByFive(int x) {
		if(x % 5 == 0) {
			return x / 5;
		}else {
			 throw new IllegalArgumentException(x + " is not divisible by 5!"); }
	}	
		
		
		  //Step 4-1
	    public int randomNumberSquared() {
	        int random = getRandomInt();
	        return random * random;
	    }
	    
	    int getRandomInt() {
	        Random random = new Random();
	        return random.nextInt(10) + 1;	
	}
	
}


	

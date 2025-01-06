package week04;

import java.util.Scanner;

public class Week04CodingAssignment {
	
	
	

	// Method 7:
	
	  public static String concatenate(String word, int n) { // Method of string concatenate that takes in string named word and int named n.
	        StringBuilder result = new StringBuilder(); // Updates result of concatenation to variable named result every pass of loop
	        for (int i = 0; i < n; i++) { // loops number of times of input and concatenates word each pass.
	            result.append(word);
	        }
	        return result.toString();
	  }

	// Method 8:
	  public static String generateFullName(String firstName, String lastName) {
	        // Concatenating first name and last name with a space in between
	        String fullName = firstName + " " + lastName;
	        // Printing the full name
	        System.out.println(fullName);
	        return fullName;
	    }
	  
   // Method 9:
	  public static boolean isSumGreaterThan100(int[] numbers) {
	        int sum = 0;
	        for (int number : numbers) { // For every number in the Array of numbers
	            sum += number; // Adding up the total of all numbers in the array
	        }
	        return sum > 100; // Returns true if the sum of all the numbers in the array is greater than 100
	    }
	  
   // Method 10:
	  public static double calculateAverage(double[] numbers) {
	        if (numbers == null || numbers.length == 0) {
	            return 0; // Return 0 for an empty array
	        }

	        double sum = 0.0;
	        for (double number : numbers) { // For every number in the Array of numbers
	            sum += number; // Accumulate the sum of the elements
	        }
	        return sum / numbers.length; // Calculate and return the average
	    }
   
	    
   // Method 11:
	  public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) { 
	        double average1 = calcAvg(array1); // the average of all the numbers in array 1
	        double average2 = calcAvg(array2); // the average of all the numbers in array 2
	        return average1 > average2; // returns true if average of array1 is greater than average of array2
	    }

	    private static double calcAvg(double[] array) { // method to calculate the average in an array
	        if (array == null || array.length == 0) {  // check to make sure there are values to calculate, displays null mssg if empty.
	            throw new IllegalArgumentException("Array must not be null or empty");
	        }
	        double sum = 0;
	        for (double num : array) { // for every number in the array
	            sum += num; // add each number to the total 
	        }
	        return sum / array.length; // return the value, which is the average, of the sum of numbers in array divided by the amount of numbers in the array.
	    }   
	    
   // Method 12:
	    public class DrinkPurchase {
	        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { 
	            return isHotOutside && moneyInPocket > 10.50; // returns true if it is hot outside AND there is money in pocket
	        }
	    }
	    
   // Method 13:
	    public static int calculateDaysUntilRetirement(int age) { // Method that calculates the remaining days until I can retire
	        final int retirementAge = 65; // Age of retirement
	        final int daysInYear = 365; // Number of days in a year

	        if (age >= retirementAge) {
	            System.out.println("You are already retired!");; // Already at or past the age of retirement (no more days left to wait!)
	        }

	        int yearsUntilRetirement = retirementAge - age; // Subtracts my age from the retirement age to get the remaining years left before retirement.
	        return yearsUntilRetirement * daysInYear; // Returns remaining days left before retirement by dividing the remain years by 365 days in a year.
	    }
	
	      
	  
	public static void main(String[] args) {
		
		// 1. Create a new array of int called ages that contains values: 3,9,23,64,2,8,28,93.
System.out.println("-------------- Question 1 --------------");	
	int[] ages = {3,9,23,64,2,8,28,93};
		
		// a. Programmatically subtract the value of the first element in the Array from the value
	   //  in the last element of the Array (do not use ages[7] in your code. Print the result to the console
	
	int result = ages[ages.length -1] - ages[0];
	System.out.println("Question 1a:"); 
	System.out.println(result); // To test solution.
	System.out.println("\n");
	  // b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the 
	 //  ages array, and have more elements.
	
	int[] ages2 = {8, 12, 42, 67, 19, 36, 88, 5, 25};
	int result2 = ages2[ages2.length -1] - ages2[0];
	// Demonstrates the index values are dynamic in that they will work for arrays of different length.
	System.out.println("Question 1b:");
	System.out.println(result2);  // To test solution.
	System.out.println("\n");
	// c. Use a loop to iterate through the Array and calculate the average age. Print the result to the console.
	
	int sum = 0; //initializes int sum to zero before starting the loop to calculate the sum. 
	  for (int age : ages) { //start of loop condition, for every age in the array named ages. 	
		  sum += age; // if condition checks to true, the age is to be added to sum.
     }  // step out of loop once condition returns value of false and move to next step
	  
     double average = (double) sum / ages.length;
        //initialize value of average to type double and perform the calculation of getting the average 
       // (the sum of all ages divided by the number of ages in array (using the ages.length)).
     System.out.println("Question 1c:");   
     System.out.println("Average Age: " + average);// prints result of calculation.
     System.out.println("\n");
     
     // 2. Create an Array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob". 
     System.out.println("-------------- Question 2 --------------");	
	
     String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"}; // Array of type String initialized with given names.
     
     // a. Use a loop to iterate through the Array and calculate the average number of letters per name. Print result to console.
     
     int numLetters = 0; // Define and initialize new int named numLetter to 0 before starting to calculate in loop.
     	for (String name : names) { // tart of loop condition, for every name in the names array.
     		numLetters += name.length(); // Counts number of letters in a name and adds to numLetters.        	
     	} 	// steps out of loop once condition returns a value of false and moves to next step.
	        	
     	double averageLetters = (double) numLetters / names.length; // Defines and initializes new type double named averageLetters and calculates
	                                                               // the average amount of letters in each name by getting the number of letters of 
     	                                                          //  each name and dividing it by the amount of names in the names Array.
    System.out.println("Question 2a:");       
    System.out.println("Average number of letters per name is: " + averageLetters);// Prints the result to the console.
	         
     // b. Use a loop to iterate through the Array again and concatenate all the names together, separated by spaces and print the results to the console.

    StringBuilder concatenatedNames = new StringBuilder();
    for (String name : names) { // Start of loop condition, for every name in the names array.
	   	concatenatedNames.append(name).append(" "); // Each iteration through loop will append the next name followed by a space to previous name followed by a space.            
      }   // steps out of loop once condition returns a value of false.
    System.out.println("\n");  
    System.out.println("Question 2b:");  
    System.out.println("Concatenated names: " + concatenatedNames.toString()); // Prints concatenated names separated by spaces to console.
    System.out.println("\n");   
    
     // 3. How do you access the last element of any Array?
    System.out.println("-------------- Question 3 --------------");	
    
    int[] array = {1,2,3,4};
    int lastElement = array[array.length -1]; // Whereas array.length gives the total number of elements in the array, array.length-1
                                              // gives the index of the last element (minus one because arrays are zero indexed.
    System.out.println(lastElement); // to test solution.   
    System.out.println("\n");  
    
     // 4. How do you access the first element of any Array? 
    System.out.println("-------------- Question 4 --------------");	
    
    int firstElement = array[0]; // Since arrays are zero indexed, the first element will be at index [0]
    System.out.println(firstElement); // To test solution.
    System.out.println("\n"); 
    
    // 5. Create a new Array of int called nameLengths. Write a loop to iterate over the previously created names Array 
    // and add the length of each name to the nameLengths Array.
    
    int[] nameLengths = new int[names.length]; // Create an array to hold the lengths of the names.
    	for (int i = 0; i < names.length; i++) { // Loop through the names array.
    		nameLengths[i] = names[i].length();	//  Populate the nameLengths array.
	 } // Step out of loop.


    //6. Write a loop to iterate over the nameLengths Array and calculate the sum of all the elements in the Array. Print results to the console.
   	System.out.println("-------------- Question 6 --------------");	
   	
   	int sums =0;      
    for (int length : nameLengths) { // Start of loop condition, length(of a name) in the array of names.	
    	sums +=length; // Calculating the sum of all the lengths in names array.
    } // Step out of loop when condition returns value of false */
    
    System.out.println("The total sum of the name lengths: " + sums);
    System.out.println("\n"); 

    
    // 7. Write a method (see above for Method 7) that takes a String word, and an int n as arguments and returns the word concatenated
    // to itself n number of times.
    System.out.println("-------------- Question 7 --------------");	
    
    Scanner scanner = new Scanner(System.in); // Opens Scanner for user input
	System.out.println("Enter a word: "); // User inputs word from keyboard and presses enter.
	String word = scanner.nextLine(); // User word is stored in String variable named word.
	
	System.out.println("Enter the number of times to concatenate: ");// User inputs a number from keyboard and presses enter.
	int n = scanner.nextInt(); // User number is stored in int variable named n.
	
	 String resulted = concatenate(word, n); // Calls Method concatenate where it expects a string and a number to be passed in.
     System.out.println("Result: " + resulted); // Prints the result after going through method.
     
     scanner.close(); // Closes scanner.
     
     System.out.println("\n"); 
     
    // 8. Write a method that takes two Strings firstName and lastName and returns a full name (the full name should be
    // the first and last name as a String separated by a space.)
     System.out.println("-------------- Question 8 --------------");	
    
         // Example usage of the generateFullName method
         String firstName = "Julie";
         String lastName = "Lewis";
         generateFullName(firstName, lastName);
     
         System.out.println("\n");
         
    // 9. Write a method that takes an Array of int and returns true if the sum of all the ints in the Array is greater than 100.
     System.out.println("-------------- Question 9 --------------");  
         
     int[] testArray = {15, 48, 52};
     System.out.println("Is the sum greater than 100? " + isSumGreaterThan100(testArray));
     
     System.out.println("\n");
     
    // 10. Write a method that takes an Array of double and returns the average of all the elements in the Array.
     System.out.println("-------------- Question 10 --------------"); 
     
     double[] sampleNumbers = {10.5, 38.7, 16.85, 75.3}; // an array of numbers
     double average1 = calculateAverage(sampleNumbers); // calculates the average of the numbers in the array
     System.out.println("The average is: " + average1); // prints message with average
     
     System.out.println("\n");
     
     // 11. Write a method that takes two Arrays of double and returns true if the average of the elements in the 
     // first Array is greater than the average of the elements in the second Array.
     System.out.println("-------------- Question 11 --------------"); 
     
     double[] array1 = {1.5, 15.75, 33.85}; // values to be averaged in array1
     double[] array2 = {2.25, 7.0, 12.50}; // values to be averaged in array2
     
     boolean result1 = isFirstArrayAverageGreater(array1, array2); // If method returns true (avg of array1 is larger than avg of array2)
     System.out.println("Is the average of the first array greater? " + result1); // Prints the result of it being true
     
     System.out.println("\n");
     
     // 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if 
     // it is hot outside and if moneyInPocket is greater than 10.50.
     
     // See above method 12
     
     // 13. Create a method of your own that solves a problem. In comments write what the method does and why you created it.
     System.out.println("-------------- Question 13 --------------");
     
     int currentAge = 54; // My current age
     int daysUntilRetirement = calculateDaysUntilRetirement(currentAge); // calls the method and inputs my current age.
     System.out.println("You can retire in " + daysUntilRetirement + " days."); // Message that tells me the result of the calculation in the retirement method
     System.out.println("I created this method to start a countdown to my retirement (providing I can actually afford to retire at age 65!!)");
     
     
	}

}

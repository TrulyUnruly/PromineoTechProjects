package week04;
import java.util.Scanner;
import javax.lang.model.util.Elements;

public class Week04CodingAssignment {

public static void main(String[] args) {
		

		System.out.println("_______ Question 1 a _______");		
		// 1. Create a new array of int called ages that contains values: 3,9,23,64,2,8,28,93.
	int[] ages = {3,9,23,64,2,8,28,93};
	
		  /* 
		   * a. Programmatically subtract the value of the first element in the Array from the value
		   * in the last element of the Array (do not use ages[7] in your code. Print the result to the console
		   */
	int result = ages[ages.length -1] - ages[0];
		   /* 
		    * initialize new integer (int) named result and calculate difference of the first value in the array from the last value in the array
		    * using [age.length -1] call the value in the last indexed position and [0] to call the value in the first indexed position.
		    * The result (named result) is then printed to console.
		    */
	System.out.println(result);
	
	
	System.out.println();
    System.out.println("_______ Question 1 b _______");	
		 /* b. Create a new array of int called ages2 with 9 Elements.class */

	int[] ages2 = {8, 12, 42, 67, 19, 36, 88, 5, 25};
	int result2 = ages2[ages2.length -1] - ages2[0];
	System.out.println(result2);
	   	 /* This is to demonstrate that the index values are dynamic in that they will work for arrays of different length. */
		
	
	System.out.println();
	System.out.println("_______ Question 1 c _______");	
		 /* c. Use a loop to iterate through the Array and calculate the average age. Print the result to the console. */
		
	int sum = 0;
	    /* initializes int sum to zero before starting the loop to calculate the sum. */
		  
	for (int age : ages) { 
	    /* start of loop condition, for every age in the array named ages. */	
    	
	sum += age;
	    /* if condition checks to true, the age is to be added to sum */
	           
	}   // step out of loop once condition returns value of false and move to next step
	        
	double average = (double) sum / ages.length;  
	    /* initialize value of average to type double and perform the calculation of getting the average 
	     * (the sum of all ages - the amount of ages in array (using the ages.length)) */
	        
	System.out.println("Average Age: " + average);
        /* prints result of calculation */
	         
	       
	System.out.println();
	System.out.println("_______ Question 2 a_______");         
	    /* 2. Create an Array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob". */
	       
	String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
	    /* Array of type String called names initialized with given names */
	         
	    // a. Use a loop to iterate through the Array and calculate the average number of letters per name. Print result to console.
	         
    int numLetters = 0; 
        /* define and initialize new int named numLetter to 0 before starting to calculate in loop */
	         
    for (String name : names) {
	    /* start of loop condition, for every name in the names array */
	        	 
    numLetters += name.length();
     	/* counts number of letters in a name and adds to numLetters */
	        	
    } 	// steps out of loop once condition returns a value of false and moves to next step
	        	
    double averageLetters = (double) numLetters / names.length;
        /* defines and initializes new type double named averageLetters and calculate
	     * the average amount of letters in each name by getting the number of letters of each name and dividing it by the amount of names
	     * in the names Array */
	        
    System.out.println("Average number of letters per name is: " + averageLetters);
        /* Prints the result to the console */
	         
    
    System.out.println();
    System.out.println("_______ Question 2 b _______");	        	 
	    // b. Use a loop to iterate through the Array again and concatenate all the names together, separated by spaces and print the results to the console.                                
	         
    StringBuilder concatenatedNames = new StringBuilder();
	        
    for (String name : names) {
        /* start of loop condition, for every name in the names array */	
	        	
   	concatenatedNames.append(name).append(" ");
        /* each iteration through loop will append the next name followed by a space to previous name followed by a space */
	            
    }   // steps out of loop once condition returns a value of false
	        
    
    System.out.println("Concatenated names: " + concatenatedNames.toString());
        /* prints concatenated names separated by spaces to console */
	        
	           
        // 3. How do you access the last element of any Array?
	        
    int[] array = {1,2,3,4};
    int lastElement = array[array.length -1];
    // (to test) System.out.println(lastElement);    
        /* whereas array.length gives the total number of elements in the array
	     * array.length-1 gives the index of the last element (minus one because arrays are zero indexed. */
	        
    
        // 4. How do you access the first element of any Array? 
	        
    int firstElement = array[0]; //since arrays are zero indexed, the first element will be at index [0]
    // (to test)System.out.println(firstElement);
           
    
	    /* 5. Create a new Array of int called nameLengths. Write a loop to iterate over the previously created names Array 
	       * and add the length of each name to the nameLengths Array. */
	  
    int[] nameLengths = new int[names.length];
        /* Create an array to hold the lengths of the names */
    for (int i = 0; i < names.length; i++) { 
 	nameLengths[i] = names[i].length();	
	 	/*Loop through the names array and populate the nameLengths array*/
   	}
        /* step out of loop */
  
    
    System.out.println();
    System.out.println("_______ Question 6 _______"); 
         //6. Write a loop to iterate over the nameLengths Array and calculate the sum of all the elements in the Array. Print results to the console.
	int sums =0;      
    for (int length : nameLengths) { 
    	/* start of loop condition, length(of a name) in the array of names */
    	
    	sums +=length;
    	/* calculating the sum of all the lengths in names array */
    } 
    /* step out of loop when condition returns value of false */
    
    System.out.println("The total sum of the name lengths: " + sums);
    
    
    System.out.println();
    System.out.println("_______ Question 7 _______"); 
    
    
    Scanner scanner = new Scanner(System.in);
            
            // Taking user input for the word and the number of repetitions
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();
            
            System.out.print("Enter the number of times to concatenate: ");
            int n = scanner.nextInt();
            
            // Calling the method and displaying the result
            String resulted = concatenateWord(word, n);
            System.out.println("Result: " + resulted);
            
            scanner.close();
       


        
   
          /* 8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
           * (the full name should be the first and the last name as a String separated by a space. */
  
           
   
         /* 9. Write a method that takes an Array of int and returns true if the sum 
          *  of all the ints in the Array is greater than 100. */
   
    
    
    
         /* 10. Write a method that takes an Array of double and returns the average of all the elements in the Array. */
    
    
         /* 11. Write a method that takes an Array of double and returns true if the average of the elements in the first Array 
          *  is greater than the average of the elements in the second Array. */
         
    
   
         /* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true
          * if it is hot outside and if moneyInPocket is greater than 10.50. */
    
            
         /* 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it. */
    
    
//Method 7:	

public static String concatenateWord(String word, int n) {
    StringBuilder concatenatedString = new StringBuilder();
    for (int i = 0; i < n; i++) {
        concatenatedString.append(word);
    }
    return concatenatedString.toString(); 
}

//Method 8:

public static String getName(String firstName, String lastName) {
	String fullName = firstName + " " + lastName;
	return fullName;	
	}

//Method 9:


        }
    } 
    
    
    
    



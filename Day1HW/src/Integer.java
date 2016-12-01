// Jonathan Hofler day 1 Homework 2/22/2016 page 67 2.16

import java.util.Scanner;

public class Integer { // name of class is Arithmetic

	public static void main(String[]args){ // declares the main method 
		
		// creates a scanner to get input from user and holds in memory
		Scanner input = new Scanner(System.in); // specifies the name (input) and type (scanner) 
		
		int number1; // holds integer
		int number2; // holds integer
	
		System.out.printf("This program tells which of the 2 intergers are larger or are equal to\n\n");		
		
		// Prompt the user for 2 integers
		System.out.printf("User enter 1st interger ");
	    number1 = input.nextInt(); // holds/stores numeric value
	    System.out.println(); // prints separation between lines of code
	    System.out.printf("User enter 2nd interger ");
	    number2 = input.nextInt();  // holds/stores numeric value
	    
	    if (number1 == number2){
	    	System.out.printf("\nboth numbers are equal", number1, number2);
	    }
	    else if (number1 > number2) {
	    	System.out.printf("\nnumber %d is larger", number1);
	    }
	    else if (number1 < number2) {
	    	System.out.printf("\nnumber %d is larger", number2);
	    }
	   
	    
	}
}


// Jonathan Hofler day 1 Homework page 66 2.15 2/22/2016

import java.util.Scanner;

public class Arithmetic { // name of class is Arithmetic

	public static void main(String[]args){ // declares the main method 
		
		// creates a scanner to get input from user and holds in memory
		Scanner input = new Scanner(System.in); // specifies the name (input) and type (scanner) 
		
		int number1; // holds integer
		int number2; // holds integer
		int sum; // holds sum calculation
		int product; // holds multiplication calculation
		int difference; // holds subtraction calculation
		int quotient; // holds division calculation
	
		System.out.printf("This program ask the user for 2 intergers and then calculates\n");
		System.out.printf("the sum, product(multiplication),difference(subtraction) and quotient (division).\n\n");
		
		// Prompt the user for 2 integers
		System.out.printf("User enter 1st interger ");
	    number1 = input.nextInt(); // holds/stores numeric value
	    System.out.println(); // prints separation between lines of code
	    System.out.printf("User enter 2nd interger ");
	    number2 = input.nextInt();  // holds/stores numeric value
	    
	    sum = number1 + number2;// sum calculation
	    System.out.printf("\nThe sum is %d ", sum); // prints answer out to the screen
	    
	    product = number1 * number2; // product calculation
	    System.out.printf("\nThe product is %d ", product); // prints answer out to the screen
	    
	    difference = (number1 - number2); //subtraction calculation
	    System.out.printf("\nThe difference is %d ", difference); // prints answer out to the screen
	    
	    quotient = number1 / number2; // division calculation
	    System.out.printf("\nThe quotient is %d ", quotient); // prints answer out to the screen
		
	}
}

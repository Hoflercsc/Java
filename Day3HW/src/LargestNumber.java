// Jonathan Hofler day 3 CW page 146 4.18 2/29/2016

import java.util.Scanner;

public class LargestNumber { // name of class is Calculator

	public static void main(String[]args){ // declares the main method
	
	 Scanner input = new Scanner (System.in);
	 
	 int counter = 0;
	 int number = 0; 
	 int largest = 0;
	 int secondlargest = 0;
	 
		System.out.printf("This program tells which is the 2 largest of 10 numbers\n");
		
		for(counter = 0; counter < 9; counter++)
		{
			System.out.printf("Enter number ");
		    number = input.nextInt();
		    
		    if(number > largest )
		    {//Another condition to find the maximum number
		    	secondlargest = largest;
		    	largest = number;//if so, number will be saved in (largest)
		    } 
		    else if (number > secondlargest) 
		    {
		    	secondlargest = number;
		    }
		}
	  
		System.out.println ("\nLargest number is "+ largest);
		System.out.println("\nthe 2nd largest number is "+ secondlargest);
	}
}


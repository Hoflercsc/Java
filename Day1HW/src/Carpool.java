// Jonathan Hofler day 1 Homework page 66 2.15 2/22/2016

import java.util.Scanner;

public class Carpool { // name of class is Arithmetic

	public static void main(String[]args){ // declares the main method 
		
		// creates a scanner to get input from user and holds in memory
		Scanner input = new Scanner(System.in); // specifies the name (input) and type (scanner) 
		
		float milesTraveled; // Total miles driven per day
		float costPergallon; // cost per gallon of gasoline
		float avgmilesPergallon; // Average miles driven per day
		float parkingFees; // parking fees per day
		float tollsPerday; // Tolls per day
		
		float dailyDrivecost;
		
		System.out.printf("This program calculates daily driving cost\n\n");
		
		
		// Prompt the user for 2 integers
		System.out.printf("Enter total miles driven per day ");
		milesTraveled = input.nextFloat(); // holds/stores numeric value
	    
	    System.out.printf("\nEnter cost per gallon of gasoline ");
	    costPergallon = input.nextFloat();  // holds/stores numeric value
	    
	    System.out.printf("\nEnter average miles per gallon ");
	    avgmilesPergallon = input.nextFloat();  // holds/stores numeric value
	   
	    System.out.printf("\nEnter Parking fees per day ");
	    parkingFees = input.nextFloat();  // holds/stores numeric value
	    
	    System.out.printf("\nEnter Tolls per day ");
	    tollsPerday = input.nextFloat();  // holds/stores numeric value
	    
	    dailyDrivecost = (milesTraveled / costPergallon ) * avgmilesPergallon + parkingFees + tollsPerday;
	    
	    System.out.printf("\nTotal daily driving cost $ %.2f", dailyDrivecost );
	    
	}
}

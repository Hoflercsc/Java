// Jonathan Hofler 3/21/2016 6.22 page 237


import java.util.Scanner;// Java Scanner Library 

public class Tempconversion {
	
    private static float fahrenheit = 0, celsius = 0;// F = fahrenheit, c = celsius
    
    private static final Scanner scan = new Scanner (System.in);
    private static int converChoice = 1;

    public static void main(String [] args) { // main program
        System.out.println("Press 1 to convert celsius to fahrenheit "); // gives user choice
        System.out.println("Press 2 to convert fahrenheit to celsius "); // gives user choice
        converChoice = scan.nextInt(); // 

        if (converChoice == 1) // if else statement
        	convertCeltoFarPrint();// calls method
        else
        	convertFartoCelPrint();// calls method
    }

    public static void convertFartoCelPrint() { // fahrenheit to celsius conversion method 
        System.out.println("Please enter degrees fahrenheit ");  //prompts user for temperature in fahrenheit
        fahrenheit = scan.nextFloat();

        celsius = (5* (fahrenheit - 32)) / 9f; //fahrenheit to celsius formula 

        System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees (celsius)"); // prints out answer
    }

    public static void convertCeltoFarPrint() { // celsius to fahrenheit conversion method 
        System.out.println("Please enter degrees celsius "); //prompts user for temperature in celsius
        celsius = scan.nextFloat();

        fahrenheit = (9 * celsius + 160) / 5f; // celsius to fahrenheit formula 

        System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees (fahrenheit) "); // prints out answer
    } // end of method
} // end of class

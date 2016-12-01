// Jonathan Hofler Day 4 Class work 3/2/2016 page 195 5.29 Christmas song
//import java.util.Scanner;


public class Christmas { // name of class is Arithmetic

	public static void main(String[]args) { // declares the main method 
			
	int day;// counter
	
	for (day = 1; day <= 12; day++){ // for loop for both switch statements
		
		System.out.printf("\n\nOn the"); // this and the switch statement is the first part of the song
		
		switch(day){ // first switch statement
		
		case 1: // each case represents the day number
		System.out.printf(" first");
		break;
		
		case 2:
		System.out.printf(" second");
		break;
		
		case 3:
		System.out.printf(" third");
		break;
		
		case 4:
		System.out.printf(" fourth");
		break;
		
		case 5:
		System.out.printf(" fifth");
		break;
		
		case 6:
		System.out.printf(" sixth");
		break;
		
		case 7:
		System.out.printf(" seventh");
		break;
		
		case 8:
		System.out.printf(" eight");
		break;
		
		case 9:
		System.out.printf(" ninth");
		break;
		
		case 10:
		System.out.printf(" tenth");
		break;
		
		case 11:
		System.out.printf(" eleventh");
		break;
		
		case 12:
		System.out.printf(" twelvth");
		break;
	}// end 1st switch statement 
		
		System.out.printf(" day of Christmas\nmy true love sent to me:");
		
switch(day){ // seconds switch statement
		
		case 12: // in reverse order to match the 1st switch statement\
		System.out.printf(" 12 Drummers Drumming");
		break;
		
		case 11:
		System.out.printf(" 11 pipers pipping");
		break;
		
		case 10:
		System.out.printf(" 10 lords leaping");
		break;
		
		case 9:
		System.out.printf(" 9 ladies dancing");
		break;
		
		case 8:
		System.out.printf(" 8 maids milking");
		break;
		
		case 7:
		System.out.printf(" 7 swans swiming");
		break;
		
		case 6:
		System.out.printf(" 6 geese laying");
		break;
		
		case 5:
		System.out.printf(" 5 golden rings ");
		break;
		
		case 4:
		System.out.printf(" 4 calling birds");
		break;
		
		case 3:
		System.out.printf(" 3 french hens");
		break;
		
		case 2:
		System.out.printf(" 2 turtle doves");
		break;
		
		case 1:
		System.out.printf(" A Partridge in a Pear Tree.");
		break;
		
	       }// end 2nd switch statement
	
	    }// end for loop
	
	 } // end main method
 
   }// end public class
// Jonathan Hofler day 2 Home Work page 100 2.15 2/27/2016

import java.util.Scanner;

public class AccountTest 
{
	// declares the main method 
	public static void main( String[]args)
	{  
		Account account1 = new Account( 50.00 ); // connecting account.java file to this file
		Account account2 = new Account( -7.53 ); // connecting account.java file to this file
		
		// display inital balance of each object 
		System.out.printf(" account1 balance: $%.2f\n ", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n ", account2.getBalance());
		
		// creates a scanner to get input from command window
		Scanner input = new Scanner(System.in); 
		double depositAmount; // deposit amount read from user
		double debitAmount;
		
		
		
		System.out.printf("enter deposit amount for account1:"); // prompts user
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("\n adding %.2f to account1 balance\n\n", depositAmount);
		account1.credit(depositAmount);// add to account 1 balance
		
		//display balances
		System.out.printf(" account1 balance: $%.2f\n ", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n ", account2.getBalance());
		
		System.out.printf("enter deposit amount for account2:");
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("\n adding %.2f to account2 balance\n\n", depositAmount);
		account2.credit(depositAmount);// add to account 2 balance
		
		System.out.printf(" account1 balance: $%.2f\n ", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n ", account2.getBalance());
		
		System.out.printf ("Enter Debit Amount From Account(1): ");
        debitAmount = input.nextDouble();
         
        System.out.printf ("\n\nDebiting $%.2f from Account(1) balance\n", debitAmount);
        account1.debit(debitAmount);
         
        System.out.printf ("\nYour Account(1) Balance is: $%.2f\n\n", account1.getBalance());
        
        // debit account 2
        System.out.printf ("Enter Debit Amount From Account(2): ");
        debitAmount = input.nextDouble();
         
        System.out.printf ("\n\nDebiting $%.2f from Account(2) balance\n", debitAmount);
        account2.debit(debitAmount);
         
        System.out.printf ("\nYour Account(2) Balance is: $%.2f\n\n", account2.getBalance());
		
	}//end main
}//end program test


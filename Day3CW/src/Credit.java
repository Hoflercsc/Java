

// Jonathan Hofler day 3 CW page 146 4.18 2/29/2016

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Credit { // name of class is Calculator

	public static void main(String[]args){ // declares the main method
		
		
		// creates a scanner to get input from user and holds in memory
		Scanner input = new Scanner(System.in); // specifies the name (input) and type (scanner) 
		
		int accountNumber; // account number
		int beginMonthBal; // Beginning month balance
		int itemsCharged; //  items charged
		int creditsApplied; // credit applied to customer account
		int creditLimit; // holds creditLimit
		int newBalance; // holds newBalance calculation
	
		System.out.printf("This Application tells if customer exceeded credit limit\n");
				
		    String question1 =
	  		  JOptionPane.showInputDialog("Enter account number");
		      accountNumber = Integer.parseInt(question1);// accountNumber holds answer
	  	    
	  	    String question2 =
	  	  	  JOptionPane.showInputDialog("beginning months balance");
	  	      beginMonthBal = Integer.parseInt(question2);//beginMonthBal holds answer
	  	  	    
	  	    String question3 =
	  	  	  JOptionPane.showInputDialog("Total Items charged this month");
	  	      itemsCharged = Integer.parseInt(question3);//itemsCharged holds answer
	  	      
	  	    String question4 = // 4th question printed to screen
	  	  	  	  JOptionPane.showInputDialog("Credits applied to your account");
	  	           creditsApplied = Integer.parseInt(question4); // creditsApplied holds answer
	  	  	      
	  	    String question5 =
	  	  	  JOptionPane.showInputDialog("What is your allowed credit limit");
	  	      creditLimit = Integer.parseInt(question5);
	  	     
	  	    newBalance = beginMonthBal + itemsCharged - creditsApplied;// new balance calculation
	  	    
	  	    if (newBalance >= creditLimit ){ // if statement if credit limit is exceeded
	  	    	
	  	    	JOptionPane.showMessageDialog(null,"Credit limit exceeded.");
	  	    }
	  	      
	  	  	String message = 
	  	  	  String.format("New Balance is %d", newBalance ); // displays customer available balance
	  	  	  JOptionPane.showMessageDialog(null, message);	// centers message
	}
}


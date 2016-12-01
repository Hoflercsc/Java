
import java.util.Scanner;

public class Invoice {//start class invoice
	
	static String partNumber;
	static String description;
	
	public static void main (String[] args) {//start main
	
	Invoice hardware = new Invoice();// constructor.  This line links invoice and invoiceTest together.
	
	Scanner input = new Scanner(System.in);//prepares program to accept input

	
		partNumber = "Enter part number";
		description = "Enter part description";
	
		System.out.println(partNumber);
		int partNum = input.nextInt(); 
		hardware.setpartNum(partNum);
		
		System.out.println(description);//prompt for partNumber
		String description = input.nextLine(); //links this user input to invoiceTest.java file.
		hardware.setdescription(description);
		
		System.out.println ("Enter quantity.");
		int quantity = input.nextInt();//gets quantity from user
		hardware.setquantity(quantity);
		
		System.out.println ("Enter price per unit.");
		double price = input.nextInt();//gets price from user.
		hardware.setprice(price);
		
		hardware.displayMessage(); //This is the method that calculates the prices.
	
	}//end main
}//end class	


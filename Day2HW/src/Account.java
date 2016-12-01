// Jonathan Hofler day 2 Home Work page 100 2.15 2/27/2016

public class Account { // name of class is Account
	private double balance; //instance variable that stores the balance
	
	// constructor
	public Account( double initialBalance){
		if (initialBalance > 0.0)
			balance = initialBalance;
	}
	
	// adds an amount to account
	public void credit(double amount){
		balance = balance + amount; // adds amount to balance
	}// end method credit
	
	// subtracts an amount to account
	public void debit(double amount){		
		if (amount > balance){
			balance = balance;
			System.out.printf("\nDebit Amount Exceeded Account Balance\n ");
		}
		else if (amount == balance){
	        balance = balance - amount;
		}
		else if (amount < balance){
	        balance = balance - amount;
		}
	}// end method debit
	
	//return the account balance
			public double getBalance(){
			return balance; // gives the value of balance to the calling method
		}// end method getBalance
}// end class Account

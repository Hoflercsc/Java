public class InvoiceTest {//start class

	private int partNum;
	private int quantity;
	private double price;
	private double total;
	private String description;
	
	public int getpartNum(){   //gets part number from user
	return partNum;
	}
	
	public String getdescription(){   //gets description from user
	return description;
	}
	
	public int getquantity(){   //gets quantity from user
	return quantity;
	}
	
	public double getprice(){   //gets price from user
	return price;
	}
	
	public void setpartNum(int number){
	partNum = number;
	}
	
	public void setdescription(String description){   //gets description from user
	 description = description;
	}
	
	public void setprice(double number){
	price = number;
	}	
	
	public void setquantity(int number){
	quantity = number;
	}
	
	public double gettotal(){
	return  total = (quantity * price);
	}
	
	public void displayMessage(){
	System.out.printf("Invoice\n\n");
	System.out.printf ("Part Number %d\t, Part Description %s\t, Price %d.2f\t, Quantity %d\t", getpartNum(), getdescription(), getprice(), getquantity()); 
	System.out.printf("\n Total price:  ", gettotal());
	}
	
	}//end main



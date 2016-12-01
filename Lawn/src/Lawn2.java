/*Jonathan Hofler, Ani Desai, Donna Ridgeway
 * March 7.2016
 * Day 4 Classwork
 */

import java.util.Scanner;
public class Lawn2 {
	
	public static void main( String[] args )
	{
		Scanner input = new Scanner (System.in);

		//declare variables
		int length;
		int width;
		int lotSize;
		int payment;
	    int seasonalFee = 20;
		final int SM_LOT_FEE = 25;
		final int MD_LOT_FEE = 35;
		final int LG_LOT_FEE = 50;
		
		//user is prompted to input length and width of lawn
		System.out.print( "Enter length of lawn: " );
		length = input.nextInt();
		System.out.print( "Enter width of lawn: " );
		width = input.nextInt();
		
		
		//lotsize is calculated and prints to user
		lotSize = length * width;
		System.out.printf( "The lot size is %d sqft\n", lotSize );
				
		
		//output shows user cost per week and seasonal fee
		if (lotSize <= 399)
		{
			System.out.printf( "The cost per week is $%d\n",SM_LOT_FEE );	
			System.out.printf( "The seasonal fee is $%d\n", SM_LOT_FEE * seasonalFee );
		

		}
		
		else if ((lotSize >= 400 ) && (lotSize <= 599 ))
		        
		{
			System.out.printf( "The cost per week is $%d\n",MD_LOT_FEE );	
			System.out.printf( "The seasonal fee is $%d\n", MD_LOT_FEE * seasonalFee );
		}
		
		else 
		{
			System.out.printf( "The cost per week is $%d\n",LG_LOT_FEE );
			System.out.printf( "The seasonal fee is $%d\n", LG_LOT_FEE * seasonalFee );
		}
		
		
		//user is prompted to enter 1,2,3 on how they're paying
		System.out.print( "Do you want to pay once(1), twice(2), or 20 times a year(3)? ");
		payment = input.nextInt();
		
		//output shows fee on payment is being made
		if (payment == 1)
		{
			if (lotSize <= 399)
			{
				System.out.printf( "Fee for the season is: $%d\n",SM_LOT_FEE * seasonalFee );	

			}
			
			else if ((lotSize >= 400 ) && (lotSize <= 599 ))
			        
			{

				System.out.printf( "Fee for the season is $%d\n", MD_LOT_FEE * seasonalFee );
			}
			
			else 
			{

				System.out.printf( "Fee for the season is $%d\n", LG_LOT_FEE * seasonalFee );
			}

		}
		
		else if (payment == 2)
		{
			if (lotSize <= 399)
			{
				System.out.printf( "Each payment is: $%d\n",((SM_LOT_FEE * seasonalFee) / 2) + 5 );	

			}
			
			else if ((lotSize >= 400 ) && (lotSize <= 599 ))
			        
			{

				System.out.printf( "Each payment is $%d\n", ((MD_LOT_FEE * seasonalFee) / 2) + 5 );
			}
			
			else 
			{

				System.out.printf( "Each payment is $%d\n", ((LG_LOT_FEE * seasonalFee) / 2) + 5 );
			}

		}
		
		else if (payment == 3)
		{
			if (lotSize <= 399)
			{
				System.out.printf( "Each payment is: $%d\n", SM_LOT_FEE + 3 ) ;	

			}
			
			else if ((lotSize >= 400 ) && (lotSize <= 599 ))
			        
			{

				System.out.printf( "Each payment is $%d\n", MD_LOT_FEE + 3 );
			}
			
			else 
			{

				System.out.printf( "Each payment is $%d\n", LG_LOT_FEE + 3 );
			}

		}
		

		
	}
}
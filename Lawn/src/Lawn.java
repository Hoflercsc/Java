/*Jonathan Hofler, Ani Desai, Donna Ridgeway
 * March 7.2016
 * Day 4 Classwork
 */
import java.util.Scanner;

public class Lawn {
	
	public static void main( String[] args )
	{
		Scanner input = new Scanner (System.in);

		//declare variables
		int length;
		int width;
		int lotSize;
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
		
		
		
	}
}
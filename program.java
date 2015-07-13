import java.util.Scanner;
import java.util.Random;


public class program
{
     public static void main(String[] args)
     {
        System.out.println(); // For space between lines

        System.out.println("This is an  Math concept program for young childern");
        System.out.println(); // For space between lines
        System.out.println("Its purpose is to teach you childern Math.");
        System.out.println(); // For space between lines
        System.out.println("Lets begin");
        System.out.println(); // For space between lines

// Create Scanner Object
    Scanner get = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    Scanner scr = new Scanner(System.in);

// Create variables
    String name;
    String expression1;
    String order1;
    String order2;
    String order3;
    String order4;
    String order5;
    String order6;


    System.out.printf("First - what is your name?\n");
    System.out.println(); // Show seperation
    name = get.nextLine();

	     {
			System.out.println(); // Show seperation
		    System.out.printf("Thank You\n",name);
		}

   System.out.println(); // Show seperation
   System.out.printf("\n%S here are some valid Math Expressions ( + ) and ( - )", name);
   System.out.println(); // Show seperation
   System.out.println("Now you type a different math symbol");
   System.out.println(); // Show seperation
   expression1 = get.nextLine();


   if(expression1.equals("/"))
   	     {
   			System.out.println(); // Show seperation
   		    System.out.println("that is a correct Math expression\n");
	     }

   else if (expression1.equals("*"))
       {
		   System.out.println(); // Show seperation
   		   System.out.println("that is a correct Math expression\n");
	   }
       else
       {
		   System.out.println(); // Show seperation
   		   System.out.println("Not a math expression\n");
	   }

           System.out.println(); // Show seperation
   		   System.out.println("What are the Order Of Operations?\n");
   		   order1 = get.nextLine();

    if(order1.equals("parentheses"))
      	      {
      			System.out.println(); // Show seperation
      		    System.out.println("Parentheses is correct\n");
   	           }
       else
	    {
		System.out.println(); // Show seperation
	    System.out.println("wrong\n");
	    }

	    System.out.println(); // Show seperation
	    System.out.println("What is the (2nd) order of operations?\n");
	    order2 = get.nextLine();

	    if(order2.equals("exponents"))
	     {
	      System.out.println(); // Show seperation
	      System.out.println("Exponents correct\n");
	     }

	   else
	   	  {
	   	    System.out.println(); // Show seperation
	   	    System.out.println("wrong\n");
	      }

	      System.out.println(); // Show seperation
		  System.out.println("What is the (3rd) order of operations?\n");
		  order3 = get.nextLine();

		if(order3.equals("multiply"))
		  {
		   System.out.println(); // Show seperation
		   System.out.println("Multiply is correct\n");
		   }

		else
		  {
		   System.out.println(); // Show seperation
		   System.out.println("wrong answer\n");
		  }

		  System.out.println(); // Show seperation
		  System.out.println("What is the (4th) order of operations?\n");
		  order4 = get.nextLine();

		  if(order4.equals("divide"))
					 		   	 {
		  System.out.println(); // Show seperation
		  System.out.println("Divide is correct\n");
		 }

	      else
		 {
			System.out.println(); // Show seperation
			System.out.println("wrong answer\n");
		 }

            System.out.println(); // Show seperation
		    System.out.println("What is the (5th) order of operations?\n");
		    order5 = get.nextLine();

		    if(order5.equals("add"))
		 {
			System.out.println(); // Show seperation
			System.out.println("Add is correct\n");
		 }

	       else
		 {
			System.out.println(); // Show seperation
			System.out.println("wrong answer\n");
		 }

	        System.out.println(); // Show seperation
			System.out.println("What is the (6th) order of operations?\n");
			order6 = get.nextLine();

		    if(order6.equals("subtract"))
		   {
		   System.out.println(); // Show seperation
		   System.out.println("Subtract is correct\n");
			 }

	       else
			{
			System.out.println(); // Show seperation
			System.out.println("wrong answer\n");
			}

		   System.out.println(); // Show seperation
		   System.out.println("You have completed the test\n");


     }
}

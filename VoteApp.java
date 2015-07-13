import java.util.Scanner;
import java.util.Random;


public class VoteApp
{
     public static void main(String[] args)
     {

        System.out.println(); // display seperation

        System.out.println(" WELCOME TO VOTE SMART");

        System.out.println(); // display seperation

        System.out.println(" This program determins if you are qualified to vote.");

        System.out.println(" Please answer all questions honestly and to the best of your knowledge!");

        System.out.println(" So Lets Begin!");

        System.out.println(); // Show seperation


// Create Scanner Object
    Scanner get = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    Scanner scr = new Scanner(System.in);


    // Create variables
    String name, go;
    String word, to;

    System.out.printf("Applicant - what is your name?\n");
    System.out.println(); // Show seperation
    name = get.nextLine();

    // Prompt the user
    System.out.printf("\n%S - How old are you? (Type numbers only)\n",name);
    System.out.println(); // Show seperation
    int age = scr.nextInt();

     if(age >= 18)
	     {
			System.out.println(); // Show seperation
		    System.out.println("Good...next question\n");
	     }
	 else if( age <= 18)
	     {
			System.out.println(); // Show seperation
	        System.out.println("Sorry you dont qualify to vote.\n" );
	        System.out.println("This program will end.\n" );
	     }

    System.out.printf("How long have you lived in USA? (Type numbers only)\n");
    System.out.println(); // Show seperation
    int time = scr.nextInt();

    if(time >= 5)
		     {
				System.out.println(); // Show seperation
			    System.out.println("Good...next question\n");
		     }
		 else if( age <= 5)
		     {
				System.out.println(); // Show seperation
		        System.out.println("Sorry you dont qualify to vote.\n" );
		        System.out.println("This program will end.\n" );
	         }

   System.out.printf("How long have you lived in VIRGINIA? (Type numbers only)\n");
   System.out.println(); // Show seperation
   int length = scr.nextInt();

   if(length >= 5)
   		     {
   				System.out.println(); // Show seperation
   			    System.out.println("Good... next question\n");
   		     }
   		 else if( length <= 5)
   		     {
   				System.out.println(); // Show seperation
   		        System.out.println("Sorry you dont qualify to vote.\n" );
   		        System.out.println("This program will end.\n" );
            }
                System.out.printf("Do you have a visa, green card, or U.S. citzenship? (y) for yes (n) for no\n");
                word = input.nextLine();

   if(word.equals("y"))
             {
               System.out.println(); // Show seperation
               System.out.println(" Excellent! You have passed this test");
               System.out.println(); // Show seperation
               System.out.println(" Please go back to the waiting area and wait to be called");
               System.out.println(); // Show seperation
		    }
        else
   		     {
   				System.out.println(); // Show seperation
   		        System.out.println("Sorry wrong answer.\n" );
   		        System.out.println(); // Show seperation
   		        System.out.println("You dont qualify to vote.\n" );
              }

     }
}


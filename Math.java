import java.util.Scanner;
import java.util.Random;


public class Math
{
     public static void main(String[] args)
     {
        System.out.println(); // For space between lines

        System.out.println("This math problem program for young childern");
        System.out.println(); // For space between lines
        System.out.println("This program teachs children to solve math problems.");
        System.out.println(); // For space between lines
        System.out.println("Lets begin");
        System.out.println(); // For space between lines

// Create Scanner Object
    Scanner get = new Scanner(System.in);
    Scanner input = new Scanner(System.in);
    Scanner scr = new Scanner(System.in);

// Create variables
    String name;
    String word;


    System.out.printf("First - what is your name?\n");
    System.out.println(); // Show seperation
    name = get.nextLine();

// Prompt the user
    System.out.printf("\n%S - How old are you? (Type numbers only)\n",name);
    System.out.println(); // Show seperation
    int age = scr.nextInt();

     if(age >= 5)
	     {
			System.out.println(); // Show seperation
		    System.out.println("Good...lets start the math test\n");
	     }
	 else if( age <= 5)
	     {
			System.out.println(); // Show seperation
	        System.out.println("Sorry your to young.\n" );
	        System.out.println("This program will end.\n" );
	     }

    System.out.printf( "if a = 1, b = 2");
    System.out.println(); // Show seperation
    System.out.println(); // Show seperation
    System.out.println( "Then a + b = ?");
    int answer1 = scr.nextInt();

    if(answer1 == 3)
		     {
				System.out.println(); // Show seperation
			    System.out.println("Correct a + b = 3\n");
		     }
		 else if( answer1 != 3)
		     {
				System.out.println(); // Show seperationJonathan
		        System.out.println("wrong answer.\n" );
			}

System.out.printf( "if c = 10, d = 50");
System.out.println(); // Show seperation
System.out.println(); // Show seperation
System.out.println( "Then c + d = ?");
int answer2 = scr.nextInt();

    if( answer2 == 60)
		     {
				System.out.println(); // Show seperation
			    System.out.println("Correct c + d = 60\n");
		     }
		 else if( answer1 != 60)
		     {
				System.out.println(); // Show seperationJonathan
		        System.out.println("wrong answer.\n" );
		        }

     }
}

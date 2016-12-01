import java.util.Scanner;
 
public class StudentJEH {
        public static void main (String [] args) {
            
        	Student pupil = new Student();
 
     Scanner input = new Scanner (System.in);
             
            System.out.printf ("Enter your Studnet ID: ");
            //String studentID = input.nextLine();
            int studentID = input.nextInt();
            pupil.setstudentID(studentID);
           //pupil.setCourseName(name);
            
            System.out.printf ("\nEnter student points: ");
            int points = input.nextInt();
            pupil.setpoints(points); 
            
            System.out.printf ("\nEnter credits hours: ");
            int hours = input.nextInt();
            pupil.sethours(hours);
            
                   
             
            pupil.displayMessage();
 
    }


}
public class Student {
     
     private int studentID; 
     private int hours; 
     private int points;
     private int gradepointaverage;
   
     
           
     public int getstudentID() {
     return studentID;
     }
      
     public int gethours(){
     return hours;
     }
      
     public int getpoints() {
     return points;
     }
     
     
     public void sethours(int number) { 
     hours = number;
     }
     
     public void setpoints(int number){
     points = number;
     } 
       
     public void setstudentID(int number){
     studentID = number;
     }
      
     
     public float getgradepointaverage(){
     return (float) points / hours;
     
     }
     
     public void displayMessage () {
         System.out.printf ("\n Student Information student ID %d, hours %d, points %d", getstudentID(), gethours(), getpoints());         
         System.out.printf ("\n Student GPA is %.2f", getgradepointaverage());
     

           gradepointaverage = (points / hours);
         
         if (gradepointaverage <= 2.7 ){ 
        	 System.out.println("\n Student Letter grade is B-");
        	 }
        	 else if (gradepointaverage < 3 ){ 
              	 System.out.println ("\n Student Letter grade is B");
        	 }
        	 else if (gradepointaverage >= 3 ){ 
              	 System.out.println ("\n Student Letter grade is B+");
        	 }
        	 else if (gradepointaverage >= 3.7){ 
              	 System.out.println("\n Student Letter grade is A-");
        	 }
        	 else if (gradepointaverage > 3.8){ 
              	 System.out.printf ("\n Student Letter grade is A+");
        	 }
        	 else  
              	 System.out.println("\n Higher or lower than normal GPA"); 
        	
     }
  
}  
 
 
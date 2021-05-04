
//Vincenzo D'Aria
//CS-151-03
//Homework 2 HomeworkFirst

import java.util.Scanner; //importing scanner utility

public class HomeworkFirst { //open public class 
  public static void main (String[] args){ //open static main
  
    Scanner scan = new Scanner(System.in);
    
    int hello = 0; //assigning inter named 'hello' to be zero for looping purposes
    
    while(hello < 1){ //open main while loop to operate when the int hello is assigned to be <1
      System.out.print("Is your homework done?");
      String responseHomework = scan.nextLine(); 
      // (Above) asks user if their hmework is done and gathers a user-inputted response 
      
      if (responseHomework.equals ("Yes") || (responseHomework.equals ("yes"))){
        int t = 0;
        while (t < 1){
          System.out.print("What is the temperature?");
          double outsideTemp = scan.nextDouble();
          //(Above) asks user the temperature outside if the response to completing homework is 'yes' or 'yes'
          
          if(outsideTemp <-100 || outsideTemp >120){
            System.out.println("temperature must be from -100 to 120 inclusive");
            t=0;
            //(Above) restarts the while loop if user inputs an invalid temperature based on the given range
          }else if (outsideTemp <70){
            System.out.println("Read a book");
            t=1;
            hello=1;
            //(Above) tells user to read a book if the temperature is less than 70, ends program
          }else if(outsideTemp >= 70){
            System.out.println("Go play outside");
            t=1;
            hello=1;
          }//(Above) tells user to play outside if temp is equal to or more than 70, ends program
        }// end of (t<1) while loop
      }else if(responseHomework.equals("No") || (responseHomework.equals("no"))){
        int h = 0;
        while (h < 1){
          System.out.print("What is the temperature?");
          double outsideTemp2 = scan.nextDouble();
          //(Above) Aks for the temp outside if the user did not complete their homeowork
          if(outsideTemp2 <-100 || outsideTemp2 >120){
            System.out.println("temperature must be from -100 to 120 inclusive");
            h=0;
          //(Above) Reruns while loop (asks for temperature again) if an invalid temperature value from outside the range is entered
          }else if (outsideTemp2 <70){
            System.out.println("Get to Work");
            h=1;
            hello=1;
          }else if(outsideTemp2 >= 70){
            System.out.println("Get to Work");
            h=1;
            hello=1;
          }// Regardless if the temperature is less than, equal to, or greater than 70, the user is told to 'Get to Work', program ends
        }
      }else{
        System.out.println("Acceptable answers are yes, Yes, no, No.");
        hello = 0;
      } //(Above) if any unacceptable answers are entered for the first while loop, the loop is reran.
    } //close main while loop
  } //close static main
} // close public class
    

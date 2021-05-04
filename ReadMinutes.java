//Vincenzo D'Aria
//CS-151-03
//Read Minutes

/*
Warm up: Write a program that asks the user for a number of minutes. 
Read the minutes from the user as an int.
Calculate and print the number of hours and minutes.
*/


import java.util.Scanner;

public class ReadMinutes {
  public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What is the number of minutes? ");
    int userMinutes = scan.nextInt();
    
    int userHours = userMinutes /60;
    int remainingMinutes = userMinutes % 60;
    
    System.out.println("The number of hours is " + userHours + " hours " + remainingMinutes + " minutes" );
    
  }
}
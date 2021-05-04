
//Vincenzo D'Aria
//CS-151-03
//Homework 2 Truth Table

import java.util.Scanner;

public class TruthTable {
  public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    String lotColor = "green";
    
    System.out.print("What is your pass color? Response should be green, red, or yellow:  ");
    String passColor = scan.nextLine();
    
    if(passColor.equals ("green")){
          System.out.println("Which spot number would you like to park in?" + "\n" + 
          "Enter a value between 1 and 25");
          
          int spotNum = scan.nextInt();
          boolean reserved;
          
          if (spotNum  <= 0 && spotNum >25){
            System.out.println("Sorry, pick a spot number between 1 and 25.");
          }else if (spotNum <=3){
            reserved = true;
            System.out.println("Sorry, spot number " + spotNum +" is reserved.");
          }else if (spotNum >3){
            reserved = false;
            System.out.println("Please proceed to park in spot number " + spotNum +".");
          }
          
          
    }else if(passColor.equals("red") || (passColor.equals("yellow"))){
      System.out.println("Sorry, you are not allowed to park in this lot. You are not a resident.");
    }
  }
}


  
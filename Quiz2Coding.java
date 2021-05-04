//Vincenzo D'Aria
//CS-151-03
//Quiz2


import java.util.Scanner;

public class Quiz2Coding{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int score = 0;


    System.out.print("Enter your course score (0-100): ");

    score = scan.nextInt();


    if(score <40){
      System.out.println("fail");
      System.out.println("no credit");
    }else if ((score >= 40 && score <70)){
      System.out.println("pass");
      System.out.println("no credit");
      
    }if (score >=70){
      System.out.println("pass");
      System.out.println("credit for prerequisite");
    }

  }//end of main

}//end of class Quiz2Coding
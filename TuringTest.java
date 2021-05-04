//Vicnenzo D'Aria
//CS-151-03
//Turing Test


import java.util.Scanner; //imports the scanner class

public class TuringTest{ //opens public class

  public static void main (String[] args){ // opens public args
    
    String firstAnswer, secondAnswer, thirdAnswer; //defines the the three answers to the questions as string variables
    
    Scanner scan = new Scanner(System.in); //Scanner reads imput from the user's keyboard
    
    System.out.println("Which type of hamburger bun would you like?");
    firstAnswer = scan.nextLine();
    
    System.out.println("Which toppings would you like on your burger?");
    secondAnswer = scan.nextLine();
    
    System.out.println("Which condiments would you like on your burger?");
    thirdAnswer = scan.nextLine();
    
    System.out.println("\n");
    
   //(Above) Asks what the customer wants on a burger and asks for input via the scanner method
   
   System.out.println("Thank you for choosing BurgerTown! We are currently processing" +"\n" +
   "your order of a burger with a" + " "+ firstAnswer +" " + "bun, with" + "\n" + "some" +" "+ secondAnswer + " "+
   "as your toppings, and" + "\n" + "some" + " "+ thirdAnswer +" "+ "as your condiments." + "\n" +
   "Your order will be out momentarily.");
   
   //(Above) Prints an order for a burger using the previously inputted answers
    
  }
}
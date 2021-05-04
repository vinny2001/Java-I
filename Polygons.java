//Vincenzo D'Aria
//CS-151-03
//Polygons

import java.util.Scanner; // importing scanner untility 
import java.lang.Math; // importing math library for absolute value method when calculating area

public class Polygons { //open public class
  public static void main (String[] args){ //open static main
    
    Scanner scan = new Scanner(System.in); // making a scanner
    
    System.out.print("What is the length of one side?"); // Asks for length of a side of the shape
    double sideLength = scan.nextDouble(); //assigns the imputted side length as a double variable
    
    System.out.print("How many sides?"); // Asks for the amount of sides the shape has
    int sideCount = scan.nextInt(); //assigns the imputted side count as an integer variable
    
    System.out.print("Length of apothem?"); // Asks for length of the apothem
    double apothemLength = scan.nextDouble(); //assigns the imputted apothem length as a double variable
    
    
    double area = Math.abs(sideLength * sideCount * (apothemLength/2)); //calcuation of the area and stores it as a double variable called 'area'
    System.out.print("Areas is: "+area); // Prints out area 
  } // close static main 
} //close public class
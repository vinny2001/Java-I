//Vicnenzo D'Aria
//CS-151-03
//Watched Pot


import java.util.Scanner; //imports the scanner class

public class WatchedPot { //opens public class

  public static void main (String[] args){ // opens public args
    
    float waterDepth, waterTemp; //defining the water depth and temperature as float variabes
    
    Scanner scan = new Scanner(System.in); //Scanner reads imput from the user's keyboard
    
    System.out.println("How deep is the water? "); // asks user the desired depth of water
    waterDepth = scan.nextFloat(); // User answers question with input from the keyboard
    
    System.out.println("How warm is the water? "); // asks user the desired temperature of water
    waterTemp = scan.nextFloat(); // User answers question with input from the keyboard
    
    int potRadius = 10; // defines the pot's radius as an integer
    double cylinderVolume = (3.1415)*((potRadius)*(potRadius))*(waterDepth); //Cylinder volume equation
    double rateOfHeatAdded = 250; // defines heat rate variable as a double
    double tempChangeNeeded = 100 - waterTemp; // Defines the change of temperature vaiable as a double
    double caloriesNeeded = tempChangeNeeded * cylinderVolume; // Defines the amount of calories needed to heat the water as a double
    double timeSeconds = caloriesNeeded / rateOfHeatAdded; //defines the time needed to heat the pot in seconds as a double variable
    double timeMinutes = timeSeconds / 60; //double variable that converts the time from seconds to minutes    

    
    System.out.println("Minutes until boiling: " + timeMinutes); //Prints the time in minutes needed for the water to boil on the screen
    
  } //close public args
} // close public class
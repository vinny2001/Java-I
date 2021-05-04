//Vincenzo D'Aria
//CS-151-03
//Midterm


public class CarLoan {
  public static void main (String[] args){
    
    double total = 4550.00;
    int count = 1;
    double payPerMonth = 450.00*count;
    double paymentWithInterest = payPerMonth * 1.02;
      
    while (count <=5){
      total = total - paymentWithInterest;
      System.out.print("Month Number " + count);
      System.out.print("          ");
      System.out.print("Your Balance After Payment Number " + count + " is: " + total);
      System.out.println("");
      count++;
  } 
  
 }
  
}
 
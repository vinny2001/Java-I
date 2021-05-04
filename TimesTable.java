//Vincenzo D'Aria
//CS-151-03
//TimesTable


public class TimesTable {
  public static void main (String[] args){
    
    //Print Table
    
    for (int row = 1; row < 47; row+=5){
      for(int col = 1; col <14 ; col+=3){
        if(row*col<10){
          System.out.print("  ");
        }else if(row*col<100){
          System.out.print(" ");
          
        }
        System.out.print(row*col + " ");
        
      }
      System.out.println("");
      System.out.println("");
    }
    
  }
}

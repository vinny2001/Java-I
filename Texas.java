//Vincenzo D'Aria
//CS-151-03
//Texas


public class Texas {
  
  static double years=0;
  static double caliRate=0.98;
  static double texRate= 1.03;
    
  static double tex = 25000000.0; 
  static double cali =32000000.0; 
  
  public static void main (String[] args){
    
    
    
    for(int i=1; cali>tex; i++){
      years=i;
      cali = cali*(caliRate);
      tex = tex*(texRate);
      
    }
    System.out.println("it took "+ years +" years.");
      
   
  }
}

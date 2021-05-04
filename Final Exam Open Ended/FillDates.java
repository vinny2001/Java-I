

public class FillDates{

   public static void main (String[] args) {
      int i = 0;
      
      int[]array = new int[5];

      for (i = 0; i != 5; i++) {
            
          array[1]= 1;

          array[2] = 1;

          array[3]= 2021;

      }

      for (i = 0; i != 5; i++) {

          System.out.print(array[1] + "/");

          System.out.print(array[2] + "/");

          System.out.println(array[3]);

      }   

   }

}
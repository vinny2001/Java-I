//Vincenzo D'Aria
//CS-151-03
//Homework5 - Baseball


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class Baseball{
    public static void main(String[]args)throws FileNotFoundException{
    
    //Parse CSV File
    
    String fileName = "2004CCSUBaseball.txt";
    
    File file = new File(fileName);
    
    try{
        Scanner data = new Scanner(file); //Scanner for the .txt file containing the baseball stats
        data.nextLine(); //Skips line 1 with column headers
        
        //Varibles for the average calculation (see below)
        
        double sum = 0;
        double countER = 0;
        
        //Variables defining top 3 players and top 3 ERs
        
        String top1="";
        double first =0;
            
        String top2="";
        double second =0;
            
        String top3="";
        double third =0;
        
        while(data.hasNext()){
            String strData = data.nextLine(); // Retrieves line
            String[] values = strData.split(",");
            double AB = Double.parseDouble(values[3]); //AB Double Values
            double RBI = Double.parseDouble(values[9]); //RBI Double Values
            double ER = (RBI/AB); //ER Double Values
            String playerList = (values[0]); //List of all players
            
            //Filters out players based on ER to determine top 3 players
            if(ER > first){
                first = ER;
                top1 = playerList;
    
            }else if(ER > second){
                second = ER;
                top2 = playerList;
            }else if(ER > third){
                third = ER;
                top3 = playerList;
            }
            
            //Calculate averge of ER from each eligible player
            if (AB > 25.0){
                sum+=ER;
                countER++;
            }
        }
        data.close();
        
        //Maybe make this a printf statement to reduce decimal place?
        System.out.println("\n"+"Average ER for qualifying players : " +(sum/countER) + "\n"); //Prints Average
        
        System.out.println("The top three players based on their ER are: ");
        System.out.println(top1+", "+top2+", "+ top3 + "");//Prints players names
        
        }catch (FileNotFoundException e){  
        
        e.printStackTrace(); //Error Handling
    
        }
    
    }

}
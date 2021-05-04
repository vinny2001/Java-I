
import java.util.Scanner;
public class BoxTester
{
    public static void main(String[] args){
        
        //create box 1
        
        System.out.println("For box one:");
        
        Scanner scan = new Scanner(System.in);
        Box box1 = new Box(0,0,0,0);
        System.out.print("Enter the left side length: ");
        box1.leftSide = scan.nextInt();
        System.out.print("Enter the right side length: ");
        box1.rightSide = scan.nextInt();
        System.out.print("Enter the top side length: ");
        box1.topSide = scan.nextInt();
        System.out.print("Enter the bottom side length: ");
        box1.bottomSide = scan.nextInt();
        
        
        System.out.println("\n");
        
        
        //Create Box 2
        
        System.out.println("For box two:");
        
        Box box2 = new Box(0,0,0,0);
        System.out.print("Enter the left side length: ");
        box2.leftSide = scan.nextInt();
        System.out.print("Enter the right side length: ");
        box2.rightSide = scan.nextInt();
        System.out.print("Enter the top side length: ");
        box2.topSide = scan.nextInt();
        System.out.print("Enter the bottom side length: ");
        box2.bottomSide = scan.nextInt();
        
        System.out.println("\n");
        
        //Print out Box 1
        
        System.out.println("Box one: "+ box1);
        
        if(box1.isClosed()== true){
            System.out.print("Closed, ");
            if (box1.isSquare()){
                System.out.print("Square");
            }else if(box1.isRectangle()){
                System.out.print("Rectangle");
            }else if (box1.isKite()){
                System.out.print("Kite");
            }else if (box1.isCrooked()){
                System.out.print("Crooked");
            }else{
                System.out.println("This box falls under neither category.");
            }
            System.out.println("\n");
        }
        if (box1.isOpen()== true){
            System.out.print("Open ");
        }
        
        //Print out Box 2
        
        System.out.println("\n");
        System.out.print("Box two: "+ box2+"\n");
        
        if(box2.isClosed()==true){
            System.out.print("Closed, ");
            if (box2.isSquare()){
                System.out.print("Square");
            }else if(box2.isRectangle()){
                System.out.print("Rectangle");
            }else if (box2.isKite()){
                System.out.print("Kite");
            }else if (box2.isCrooked()){
                System.out.print("Crooked");
            }else{
                System.out.println("This box falls under neither category.");
            }
            System.out.println("\n");
        }
        if (box2.isOpen()==true){
            System.out.print("Open ");
        }

        System.out.println("\n");
        
        //Prints Equality Statement between the two boxes
        
        if(box1.equals(box2)){
            System.out.println("Box 1 and Box 2 are equal: "+ true);
        }else{
            System.out.println("Box 1 and Box 2 are equal: "+ false);
        }
        System.out.println("\n");
        
        //Author
        
        System.out.println("Coded by Vincenzo D'Aria");
        
        System.out.println("\n");
    }
}
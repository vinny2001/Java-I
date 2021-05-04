//Vincenzo D'Aria
//CS-151-03
//Homework 5 - PlayingCardTester

public class PlayingCardTester{
    public static void main(String[]args){
        
        PlayingCard card = new PlayingCard(1, PlayingCard.Suit.HEARTS);
        System.out.println("\n"+"This program will now present an ace of hearts:"+ "\n");
        
        System.out.println("* * * * * * * * * * *");
        System.out.println("*  "+card.toString().toLowerCase()+"    *");
        System.out.println("* * * * * * * * * * *");
        
        
        
        
        PlayingCard card2 = new PlayingCard(3, PlayingCard.Suit.CLUBS);
        System.out.println("\n"+"This program will now present a 3 of clubs:"+ "\n");
        
        System.out.println("* * * * * * * * * * *");
        System.out.println("*    "+card2.getRank()+" of "+card2.getSuit().toString().toLowerCase()+"     *");
        System.out.println("* * * * * * * * * * *");
        
        
        
        PlayingCard card3 = new PlayingCard(13, PlayingCard.Suit.DIAMONDS);
        System.out.println("\n"+"This program will now present a king of diamonds:"+ "\n");
        
        System.out.println("* * * * * * * * * * *");
        System.out.println("*  "+card3.toString().toLowerCase()+" *");
        System.out.println("* * * * * * * * * * *");
        
        
        
    
    }
}

//Coded By Vincenzo D'Aria, All Rights Reserved
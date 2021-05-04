//Vincenzo D'Aria
//CS-151-03
//Homework 5 - PlayingCard


import java.util.Objects;

public class PlayingCard{
    
    //Enumerated list of suit values
    
    public enum Suit{
        
        SPADES, HEARTS, DIAMONDS, CLUBS;
    
    }
    
    
    //Card ranking integer values
    
    private static final int MIN_RANK = 1;
    private static final int MAX_RANK = 13;
    
    
    
    private int rank;
    private Suit suit;
    
    //Constructor
    
    public PlayingCard(int rank, Suit suit){
        setRank(rank);
        setSuit(suit);
        
    }
    
    //Rank getter  
        
    public int getRank(){
        return rank;
    }
    
    //Rank setter
    
    public void setRank(int rank){
        
        if(rank < MIN_RANK || rank > MAX_RANK){
            throw new RuntimeException();
        }
        
        
        this.rank = rank;
    }
    
    //Suit Getter
    
    public Suit getSuit(){
    
        return suit;
    }
    
    //Suit Setter
    
    public void setSuit (Suit suit){
        if(suit == null){
            throw new RuntimeException();
        }
        
        this.suit = suit;
    }
    
    //toString: (sets the print output format for Rank and Suit)
    
    public String toString(){
        
        if(rank == 1){
            return "Ace of " + getSuit().name();
        }else if (rank == 11){
            return "Jack of " + getSuit().name();
        }else if (rank == 12){
            return "Queen of " + getSuit().name();
        }else if (rank == 13){
            return "King of " + getSuit().name();
        }else{
            return String.format("%s[rank=%d, suit=%s]",
            getClass().getSimpleName(),
            getRank(),
            getSuit().name());
        }
        
    }
    
    
    public boolean equals(Object obj){
    
        if (!(obj instanceof PlayingCard)){
            return false;
        }
        if (obj == this){
            return true;
        }
        PlayingCard that = (PlayingCard)obj;
        return that.getRank() == getRank() && that.getSuit() == getSuit();
    }
    
    //Getters for Min & Max Rank
    
    public static int getMinRank(){
        
        return MIN_RANK;
    }
    
    public static int getMaxRank(){
    
        return MAX_RANK;
    }
    
    //Sets up array for the emumerated suit values
    
    public static Suit[] getSuits(){
        
        return Suit.values();
    
    }
    
} //Close PlayingCard

//Coded By Vincenzo D'Aria, All Rights Reserved
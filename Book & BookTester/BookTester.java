//Jeff Blankenship
//CS-151
//Homework 3 Problem 2

//This is the client program for the Book class
//to be written in this homework problem.
//A successful version of Book class will allow
//BookTester to run without errors and provide the 
//output as listed in the homework.


public class BookTester{

  public static void main(String[] args){
    
    //create three books
    Book book1 = new Book();
    book1.setTitle("Great Expectations");
    book1.setAuthor("Charles Dickens");
    
    Book book2 = new Book();
    book2.setTitle("Great Expectations");
    book2.setAuthor("Charles Dickens");
    
    Book book3 = new Book();
    book3.setTitle("To Kill a Mockingbird");
    book3.setAuthor("Harper Lee");
    
    //display the books
    System.out.println("book1 is: " + book1);
    System.out.println("book2 is: " + book2);
    System.out.println("book3 is: " + book3);
    
    //test if books are equal
    System.out.println("book1.equals(book2): " + book1.equals(book2) );
    System.out.println("book1 == book2:      " + (book1 == book2)    );
    System.out.println("book2.equals(book3): " + book2.equals(book3) );
    
    
  }//main
}//class BookTester
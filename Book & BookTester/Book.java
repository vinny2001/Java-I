//Vincenzo D'Aria
//CS-151-03
//Book

public class Book{
  
  private String title;
  private String author;

  public Book(){
    title = "Great Expectations";
    author = "Charles Dickens";
  }
  
  public boolean equals(Book that){
    boolean result = false;
    
    if (title.equals(that.title)&&(author.equals(that.author))){
      result = true;
    }else{
      result = false;
    }
    
    return result;
  }
  
  public String getTitle(){
    return title;
  }
  
  public String getAuthor(){
    return author; 
  }
  
  public void setTitle(String newTitle){
    this.title=newTitle; 
  }
  
  public void setAuthor(String newAuthor){
    this.author=newAuthor;
  }

  public String toString(){
    String result = String.valueOf(getTitle());
    return result;
  }
  
}
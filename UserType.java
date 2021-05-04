
//Vincenzo D'Aria
//User Type


public class UserType{
  
  private int student;
  private int educator;
  private int athlete;
  private int professional;
  private int parent;
  private int other;
  
  
  public UserType(){
    
    student = 0;
    educator = 0;
    athlete = 0;
    professional = 0;
    parent = 0;
    other = 0;
    
  }
  
  
  
  public boolean isStudent(){
    
    if (student <1){
      
      System.out.println("Let's now personalize your experience as a student.");
      
    }
    return true;
  }
  
  public boolean isEducator(){
    
    if (educator <1){
      
      System.out.println("Let's now personalize your experience as an educator.");
      
    }
    return true;
  }
  
  public boolean isAthlete(){
    
    if (athlete <1){
      
      System.out.println("Let's now personalize your experience as an athlete.");
      
    }
    return true;
  }
  
  public boolean isProfessional(){
    
    if (professional <1){
      
      System.out.println("Let's now personalize your experience as a professional.");
      
    }
    return true;
  }
  
  public boolean isParent(){
    
    if (parent <1){
      
      System.out.println("Let's now personalize your experience as a parent.");
      
    }
    return true;
  }
  
  public boolean isOther(){
    
    if (other <1){
      
      System.out.println("Okay, let's get to personalization!");
      
    }
    return true;
  }
  
}


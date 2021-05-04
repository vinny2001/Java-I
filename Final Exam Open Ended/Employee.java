//Vincenzo D'Aria
//CS-151-03
//Final Exam


public class Employee{

    private String name;
    private String ssn;
    
    public Employee(String name, String ssn){
        
        setName(name);
        setSSN(ssn);
    
        
    }
    public void setName(String name){
    
        this.name = name;
    }
    public void setSSN(String ssn){
    
        this.ssn = ssn;
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getSSN(){
        return ssn;
    }
    
    static double computePay(int hours, double rate){
    
        double pay= hours*rate;
        
        return pay;
    
    }
}


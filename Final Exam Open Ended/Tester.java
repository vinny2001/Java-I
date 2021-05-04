

public class Tester{

    public static void main(String[]args){
    
        Employee worker1 = new Employee("John Doe","555-55-5555");
        
        System.out.println("Employee 1 name and SSN: ");
        System.out.print(worker1.getName() +"  "+ worker1.getSSN());
        
        
        double wage = Employee.computePay(8, 25.00);
        
        
        System.out.println("\n\n"+ "Employee 1's pay: ");
        System.out.println("$"+wage);
    
    
    }


}
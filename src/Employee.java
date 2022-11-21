import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    Scanner scanner =new Scanner(System.in);
   Employee (){
       System.out.println("1.Create");
       int menu=scanner.nextInt();
       switch(menu){
           case 1:
               createemployee();
               break;
           case 5:

               System.exit(0);


       }
   }
   void createemployee(){
       String empCode,empName,designation,salary,company,phoneNumber,email;
       System.out.println("Employee Code");
       empCode=scanner.next();
       System.out.println("Employee Name");
       empName=scanner.next();
       System.out.println("Employee Designation");
       designation= scanner.next();
       System.out.println("Employee Salary");
       salary= scanner.next();
       System.out.println("Company");
       company= scanner.next();
       System.out.println("Employee Phone");
       phoneNumber= scanner.next();
       System.out.println("Employee Email");
       email= scanner.next();





   }
    public static void main(String[] args) {

       while(1>0){
           ArrayList<Employee> employeeDetails =new ArrayList<Employee>();
           employeeDetails.add(new Employee());       }
    }
}

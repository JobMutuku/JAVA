//Author:JOB MUTUKU
//REG NO:CT101/G/19347
//A Program to create three classes; Employee class,SalaryCalculator class and MainApp class
import java.util.Scanner;

     double salary;
    private String name;
class Employee {
   private final  String name;
    private final double salary;
    //a constructor to initialize the attributes
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    //a method to display employee details
    public void displayDetails(){
        System.out.print("Employee name: " + name);
        System.out.print("Employee salary: " + salary);
    }
        public double getSalary() {
            
            throw new UnsupportedOperationException("Unimplemented method 'getSalary'");
        }
    
            
            
            
        }
    //Salary calculator class
    class SalaryCalculator {
        //method to calculate bonus
        public double calculateBonus(double salary) {
    return salary * 0.10; //10% of salary
        }
    }
    //getter method for salary 
    public double getSalary() {
        return salary;
    }
    //getter method for name
    public String getName() {
        return name;
    }
    //MainApp2 class
    public class MainApp2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Accept user input for employee details
            System.out.println("Enter employee name: ");
            String name = scanner.nextLine();
    
            System.out.println("Enter employee salary: ");
            double salary = scanner.nextDouble();
    
            //create an employee object
            Employee employee = new Employee( name, salary);
    
            //create a SalaryCalculator object
            SalaryCalculator salaryCalculator = new SalaryCalculator();
    
            //calculate the bonus
            double bonus = salaryCalculator.calculateBonus(employee.getSalary());

        //Display employee details
        employee.displayDetails();

        //display the bonus calculated
        System.out.println("Calculated bonus: " + bonus);

        scanner.close();
    }
}
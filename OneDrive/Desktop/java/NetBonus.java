//A program to compute and print net bonus using salary and period of service
//Author : Job Mutuku
//ReG No: CT101/G/19347/23
//Date :19/1/2025
import java.util.Scanner;
public class NetBonus {
    public static void main(String[] args){
        //create a scannner object for user input
        Scanner obj = new Scanner(System.in);

        //hard code the salary and years of service
        //prompt for the salary from the user
        System.out.print("Please enter your salary: ");
double salary = obj.nextDouble();
        //prompt for the years of service from the user
        System.out.print("Please enter your years of sevice:");
        int yearsOfService = obj.nextInt();
        //printing the net bonus 
        System.out.printf("The net bonus is:%.02f\n",netBonus(salary, yearsOfService));
    
    }
    //computing the net bonus
     static double netBonus(double salary,int yearsOfService) {
        double netbonus;
        
        if(yearsOfService>10) {
            netbonus=salary * 0.12;
            }
            else if(yearsOfService>=6&&yearsOfService<=10){
                netbonus=salary * 0.10;
            }
            else if(yearsOfService<6){
                netbonus=salary * 0.08;
            }
        else{
            netbonus=0.0;
        }
                
                return netbonus;
        
}
}
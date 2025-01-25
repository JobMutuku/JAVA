//Author : Job Mutuku : REG NO CT101/G/19347/23
/*program to get discount taking input from the user*/
//input amount>5000------> 1% discount
//input amount>=1000&&amount<=5000----->5% discount
//input amount <1000 ---->No discount
import java.util.Scanner;
public class GetDiscount2{
     public static   double  getDiscount(double amount) {
    double discount = 0;
    
        if(amount>5000){
            discount = amount * 0.01;
           
        }
        else if(amount>=1000&&amount<=5000){
            discount = amount * 0.05;
           
        }
        else if(amount<1000){
         
         System.out.println( "No Discount");
        }
        return discount;
       }
     public static void main(String[] args) {
        double discount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount");
        double amount=input.nextDouble();
        
//calling the method and passing one argument amount to the method
      discount = getDiscount(amount);
       System.out.println("The discount is = " + discount);

    }
}
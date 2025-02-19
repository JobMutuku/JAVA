//program to add two numbers
import java.util.Scanner;

public class Add {
public static void main(String[] args) {
  
int num1, num2,result;
//creating an object called sc
Scanner sc = new Scanner(System.in);
//prompting user input
System.out.println("Enter the number 1");
num1 =sc.nextInt();
System.out.println("Enter the number 2");
num2 =sc.nextInt();
//close the object file
sc.close();

result = num1 + num2;  

System.out.println(num1 + " + " + num2 + " = " + result);
}
}
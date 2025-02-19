//java program ---scanner class
import java.util.Scanner;

public class scannerDemo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //read a string
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
   System.out.println("name: "+ name);
//read an integer
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("age:" + age);
} 
}
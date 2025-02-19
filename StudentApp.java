//studentApp class
//Author :Job Mutuku
//Reg No :CT101/G/19347/23

import java.util.Scanner;
public class StudentApp {
     //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt user for input
        System.out.println("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Course: ");
        String course = scanner.nextLine();

        //create StudentRecord object
        StudentRecord student = new StudentRecord(studentID, name, course);

        //display student details
        student.displayInfo();
        scanner.close();
    }  
}

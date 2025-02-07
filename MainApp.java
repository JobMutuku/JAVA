//Author JOB
//REG NO: CT101/G/19347/23

import java.util.Scanner;

class Student{
    private final String name;
    private final double marks;
    //constructor to initialize the attributes
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    //method to display student details
    public void displayDetails(){
        System.out.println("Student Name: " + name);
        System.out.println(" marks: " + marks);
    }
    //getter methods
    public double getMarks() {
        return marks;
    }
    public String getName(){
        return name;
    }                                                                               
}

//GradeCalculator Class
class GradeCalculator {
//method for calculating grade based on the marks
public String calculateGrade(double marks) {
    if(marks>=90){
        return "A";
    }else if(marks>=75){
        return "B";
    }else if(marks>=50){
        return "C";
    }else{
        return "D";
    }
}
}
//MainApp Class
public class MainApp{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Accepting user input
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student marks: ");
        double marks = scanner.nextDouble();

        //creating student object
        Student student = new Student(name,marks);
        //creating GradeCalculator object
        GradeCalculator gradeCalculator = new GradeCalculator();

        //calculating grade
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        //displaying student details and grade
         student.displayDetails();
         System.out.println("Grade: " + grade);
scanner.close();
         
    }
}
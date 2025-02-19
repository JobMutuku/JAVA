public class StudentRecord {


        private final  String studentID;
  
        private final String name;
  
         private final String course;
  
       //constructor
  
  public StudentRecord(String studentID, String name, String course) {
  
  this.name = name;
  
  this.studentID = studentID;
  
  this.course = course;
  
  }
  
        //Method to display student details
  
  public void displayInfo() {
  
       System.out.println("Student ID: " + studentID);
  
       System.out.println("Name: " + name);
  
       System.out.println("Course: " + course);
  
  }
  
  }


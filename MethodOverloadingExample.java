public class MethodOverloadingExample {

    // Overloaded method with one integer parameter
    public static void display(int num) {
        System.out.println("Integer value: " + num);
    }

    // Overloaded method with two integer parameters
    public static void display(int num1, int num2) {
        System.out.println("Integer values: " + num1 + " and " + num2);
    }

    // Overloaded method with one string parameter
    public static void display(String str) {
        System.out.println("String value: " + str);
    }

    public static void main(String[] args) {
        // Calling the overloaded methods
        display(5);               // Calls method with one integer
        display(10, 20);          // Calls method with two integers
        display("Hello, World!"); // Calls method with a string
    }
}

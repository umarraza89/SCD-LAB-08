import java.util.Scanner;

public class Calculator {

    public Calculator() 
    {
        // Constructor code if needed
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        // Input number 1
        System.out.println("Enter number 1");
        int a = s.nextInt();

        // Input number 2
        System.out.println("Enter number 2");
        int b = s.nextInt();

        // Perform calculations if both numbers are greater than 0
        if (a > 0 && b > 0) {
            System.out.println("Addition: " + addition(a, b));
            System.out.println("Multiplication: " + multiplication(a, b));
        } 
        else
        {
            System.out.println("Both numbers must be greater than zero.");
        }

        // Close the Scanner to avoid resource leaks
        s.close();
    }

    static int addition(int num1, int num2) 
    {
        return num1 + num2;
    }

    static int multiplication(int num1, int num2) 
    {
        return num1 * num2;
    }
}

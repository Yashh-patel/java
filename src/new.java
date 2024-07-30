import java.util.Scanner;

public class new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());
            
            double result = divide(num1, num2);
            System.out.println("The result of the division is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
            System.out.println("Program has ended.");
        }
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

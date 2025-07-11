


import java.util.Scanner;

public class Program1 {

    public static class Calculator {
        public double calculate(double a, double b, String operation) {
            return switch (operation.toLowerCase()) {
                case "add" -> a + b;
                case "subtract" -> a - b;
                case "multiply" -> a * b;
                case "divide" -> {
                    if (b != 0) yield a / b;
                    else {
                        System.out.println("Error: Division by zero.");
                        yield 0.0;
                    }
                }
                default -> {
                    System.out.println("Invalid operation.");
                    yield 0.0;
                }
            };
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        Calculator calculator = new Calculator();
        double result = calculator.calculate(a, b, operation);

        System.out.println("Result: " + result);

        scanner.close();
    }
}

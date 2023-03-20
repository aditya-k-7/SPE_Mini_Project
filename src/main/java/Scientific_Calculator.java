import java.util.Scanner;

public class Scientific_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Square root");
            System.out.println("2. Logarithm");
            System.out.println("3. Power");
            System.out.println("4. Factorial");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter a number: ");
                double number = scanner.nextDouble();
                double result = squareRoot(number);
                System.out.println("Result: " + result);
            } else if (choice == 2) {
                System.out.print("Enter a number: ");
                double number = scanner.nextDouble();
                double result = logarithm(number);
                System.out.println("Result: " + result);
            } else if (choice == 3) {
                System.out.print("Enter a base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter an exponent: ");
                double exponent = scanner.nextDouble();
                double result = power(base, exponent);
                System.out.println("Result: " + result);
            } else if (choice == 4) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                int result = factorial(number);
                System.out.println("Result: " + result);
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double logarithm(double number) {
        return Math.log(number);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
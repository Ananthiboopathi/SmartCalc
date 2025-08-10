import java.util.Scanner;

public class SmartCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to SmartCalc!");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Factorial");
            System.out.println("8. Armstrong Number Check");
            System.out.println("9. Fibonacci Series");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Result: " + (a + b));
                }
                case 2 -> {
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Result: " + (a - b));
                }
                case 3 -> {
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    System.out.println("Result: " + (a * b));
                }
                case 4 -> {
                    System.out.print("Enter two numbers: ");
                    double a = sc.nextDouble(), b = sc.nextDouble();
                    if (b != 0)
                        System.out.println("Result: " + (a / b));
                    else
                        System.out.println("Error: Division by zero!");
                }
                case 5 -> {
                    System.out.print("Enter a number: ");
                    double num = sc.nextDouble();
                    System.out.println("Square root: " + Math.sqrt(num));
                }
                case 6 -> {
                    System.out.print("Enter base and exponent: ");
                    double base = sc.nextDouble(), exp = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exp));
                }
                case 7 -> {
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= n; i++) fact *= i;
                    System.out.println("Factorial: " + fact);
                }
                case 8 -> {
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt(), sum = 0, temp = num;
                    while (temp > 0) {
                        int digit = temp % 10;
                        sum += digit * digit * digit;
                        temp /= 10;
                    }
                    if (sum == num)
                        System.out.println(num + " is an Armstrong number.");
                    else
                        System.out.println(num + " is not an Armstrong number.");
                }
                case 9 -> {
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt(), a = 0, b = 1;
                    System.out.print("Fibonacci Series: ");
                    for (int i = 1; i <= terms; i++) {
                        System.out.print(a + " ");
                        int next = a + b;
                        a = b;
                        b = next;
                    }
                    System.out.println();
                }
                case 0 -> System.out.println("Exiting SmartCalc. Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}

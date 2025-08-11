import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = v.nextInt();

        int a = 0;

        while (number != 0) {
            int digit = number % 10;       
            a = a * 10 + digit; 
            number = number / 10;         
        }

        System.out.println("a number: " + a);

    }
}


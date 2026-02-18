import java.util.Scanner;

public class projectB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number :");

        int input = scanner.nextInt();

        int result = factorial(input);
        System.out.println("Factorial of " + input + " is: " + result);


    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
      return result;
    }
}

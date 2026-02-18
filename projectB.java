import java.util.Scanner;

public class projectB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number :");
        int input = scanner.nextInt();

        int result = factorial(input);
        System.out.println("Factorial of " + input + " is: " + result);

        int square = input * input;
        System.out.println("Result: " +square);


        double absresult = absoluteVal(input);
        System.out.println("The Result is : "+absresult);

        if (input % 2 == 0) {
            System.out.println("even");
        }
        System.out.println("odd");


        scanner.close();

    }
    public static double absoluteVal(double number){
        return (number < 0 ) ? -number : number;


    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
      return result;
    }
}

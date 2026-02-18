import java.util.Scanner;

public class projectB {

    public static void main (String[] args ){


        Scanner input = new Scanner(System . in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int square = number * number;
        System.out.println("Result: " +square);

        Scanner scanner = new Scanner(System . in);

        System.out.println("Enter a Number: ");
        double input1 = scanner.nextDouble();

        double result = absoluteVal(input1);

        System.out.println("The Result is : "+result);

        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("even");
        }
        System.out.println("odd");

        scanner.close();

    }
    public static double absoluteVal(double number){
        return (number < 0 ) ? -number : number;



    }

}

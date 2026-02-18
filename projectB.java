import java.util.Scanner;

public class projectB {
    public static void main (String[] args ){

        Scanner input = new Scanner(System . in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int square = number * number;
        System.out.println("Result: " +square);
    }

}

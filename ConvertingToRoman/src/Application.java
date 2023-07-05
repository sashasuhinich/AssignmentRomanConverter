import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Converting converting = new Converting();

        System.out.println("This is a system to convert a number to roman notation. (Press 0 to exit)");
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        do {
            try {
                System.out.println("Enter a number you want to convert:");
                number = scanner.nextInt();

                if (number < 0) System.err.println("The number must be higher then 0");

                else System.out.println(number + " in Roman numerals is: " + converting.convertingIntoRomanNumbers(number));

            } catch (Exception e) {
                System.err.println("Please enter correct value!");
                scanner.next();
            }
        } while (number != 0);

        System.out.println("Goodbye!");
    }
}


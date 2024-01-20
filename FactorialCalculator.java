import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {

        while(true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome to the Factorial Calculator\n");
            System.out.print("Enter an integer that's greater than 0 and less than 6: ");

            int numb = input.nextInt();
            input.nextLine();

            long factorialNumb = 1;
            for (int i = 1; i <= numb; i++) {
                factorialNumb *= i;
            }
            System.out.println("The factorial of " + numb + " is " + factorialNumb + ".");
            System.out.print("\nContinue? (y/n): ");
            String repeat = input.nextLine();

            if(repeat.equalsIgnoreCase("n")) {
                break;
            }
        }

    }
}

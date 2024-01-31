import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private PrimeList primeNumbers;


    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.primeNumbers = new PrimeList();
    }

    public void start() {
        while(true) {
            System.out.println("Prime Number Generator");

            // Ask the user for a range of numbers to get the prime numbers from
            System.out.println("Choose a range:");
            System.out.print("From? ");
            int numOne = scanner.nextInt();
            System.out.print("To? ");
            int numTwo = scanner.nextInt();
            primeNumbers.getPrimeNumbers(numOne, numTwo);
            System.out.println();

            // Print the prime numbers
            System.out.println("Prime numbers from " + numOne + " to " + numTwo + ":");
            primeNumbers.print();

            // Ask if the user wants to try a different range
            System.out.println();
            System.out.print("Would you like to try a different range? [Y/N]");
            char response = scanner.next().charAt(0);

            // Exits program if user inputs n, otherwise it loops back to the beginning
            if (response == 'N' || response == 'n') {
                break;
            }
        }
    }
}

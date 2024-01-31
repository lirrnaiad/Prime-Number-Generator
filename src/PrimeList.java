import java.util.ArrayList;

public class PrimeList {
    private ArrayList<Integer> primeNumbers;

    public PrimeList() {
        this.primeNumbers = new ArrayList<>();
    }

    // Checks each number of the given range if they are prime.
    public void getPrimeNumbers(int from, int to) {
        for (int num = from; num <= to; num++) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }
    }

    // Prints the prime numbers in the specific range
    public void print() {
        int primeNumberCount = 0;
        for(int n : primeNumbers) {
            System.out.println(n);
            primeNumberCount++;
        }

        System.out.println("Number of prime numbers: " + primeNumberCount);
    }

    // A prime number is a number that is only divisible by 1 and itself
    public boolean isPrime(int n) {
        // ... except 1, and negative numbers.
        if (n <= 1) {
            return false;
        }

        // Loop to check if any number is divisible
        // "n / 2" is added as dividing above half of the number is unnecessary
        // Returns false if it is divisible by any other number than 1 and itself
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        // Otherwise, the number is prime
        return true;
    }
}

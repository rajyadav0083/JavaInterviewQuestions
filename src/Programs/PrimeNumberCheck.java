package Programs;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


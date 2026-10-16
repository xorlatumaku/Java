import java.util.Scanner;

public class EfficientPrimeNumbers {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Find all prime numbers <= n, enter n: ");
    int n = input.nextInt();

    // A list to hold prime numbers
    java.util.List<Integer> list = new java.util.ArrayList<>();

    final int NUMBER_PER_LINE = 10; // Display 10 per line
    int count = 0;  // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness
    int squareRoot = 1; // Check whether number <= squareRoot

    System.out.println("The prime numbers are \n");
  }
}

import java.util.Scanner;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two integers
    System.out.print("Enter first integer: ");
    int num1 = input.nextInt();
    System.out.print("Enter second integer: ");
    int num2 = input.nextInt();

    System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd(num1, num2));
  }
  
  /** Return the gcd of two integers */ 
  public static int gcd(int x, int y) {
    int gcd = 1, k = 2;

    while (k <= x && k <= y) {
      if (x % k == 0 && y % k == 0) 
        gcd = k;
      k++;
    }
    return gcd;
  }
}

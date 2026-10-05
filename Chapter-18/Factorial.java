import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a nonnegative integer: ");
    int n = input.nextInt();
    
    
  }
  
    // Return the factorial for the specified number
    public static long factorial(n) {
      if (n == 0)
        return 1;
      else
        return n * factorial(n - 1);
    }
}

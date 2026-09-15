import java.util.Scanner;

public class TestMax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter first integer:");
    int i = input.nextInt();

    System.out.print("Enter second integer:");
    int j = input.nextInt();

    System.out.println("The maximum of " + i + " and " + j + " is " + max(i, j));
  }

  /** Return the max of two numbers */
  public static int max(int num1, int num2) {
    int result = (num1 > num2) ? num1 : num2;

    return result;
  }
}

import java.util.Scanner;

public class ComputeAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter three numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();

    double average = (num1 + num2 + num3) / 3;

    System.out.println("The average of " + num1 + ", " + num2
        + ", " + num3 + ", is " + average);
  }
}
